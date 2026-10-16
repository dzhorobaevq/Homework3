import java.util.Scanner;
public class A4 { public static void main(String[] args) { Scanner scanner = new Scanner(System.in);
    final String CORRECT_PIN = "1234";
    double balance = 1000.0;
    int maxAttempts = 3;
    boolean loggedIn = false;

    System.out.println("===== DASTAN'S ATM =====");

    while (maxAttempts > 0) {
        System.out.print("Enter your PIN: ");
        String enteredPin = scanner.next();

        if (enteredPin.equals(CORRECT_PIN)) {
            System.out.println("Login successful!");
            loggedIn = true;
            break;
        } else {
            maxAttempts--;
            System.out.println("Incorrect PIN.");
            if (maxAttempts > 0) {
                System.out.println("Remaining attempts: " + maxAttempts);
            } else {
                System.out.println("Your account has been blocked.");
            }
            System.out.println();
        }
    }

    if (loggedIn) {
        int option = 0;
        while (option != 4) {
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check balance");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdraw money");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            if (scanner.hasNextInt()) {
                option = scanner.nextInt();
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
                continue;
            }


            if (option == 1) {

                System.out.println("Your current balance is: $" + balance);

            } else if (option == 2) {

                System.out.print("Enter deposit amount: ");
                if (scanner.hasNextDouble()) {
                    double depositAmount = scanner.nextDouble();
                    if (depositAmount > 0) {
                        balance += depositAmount;
                        System.out.println("Deposit successful.");
                        System.out.println("Your new balance is: $" + balance);
                    } else {
                        System.out.println("Invalid amount. Deposit must be greater than zero.");
                    }
                } else {
                    System.out.println("Invalid input format.");
                    scanner.next();
                }

            } else if (option == 3) {
                System.out.print("Enter withdrawal amount: ");
                if (scanner.hasNextDouble()) {
                    double withdrawAmount = scanner.nextDouble();
                    if (withdrawAmount <= 0) {
                        System.out.println("Invalid amount. Withdrawal must be greater than zero.");
                    } else if (withdrawAmount > balance) {
                        System.out.println("Insufficient funds. Amount cannot exceed current balance.");
                    } else {
                        balance -= withdrawAmount;
                        System.out.println("Withdrawal successful.");
                        System.out.println("Your new balance is: $" + balance);
                    }
                } else {
                    System.out.println("Invalid input format.");
                    scanner.next();
                }

            } else if (option == 4) {

                System.out.println("Thank you for using DASTAN'S ATM. Goodbye!");

            } else {System.out.println("Invalid option. Please choose between 1 and 4.");
            }
        }
    }

    scanner.close();
}
}
