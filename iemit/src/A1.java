import java.util.Scanner;
public class A1 {
    public static void main(String[] args) {
        Scanner attempt = new Scanner(System.in);
        System.out.println("Attempts left:3");
        System.out.println("Enter ATM PIN(min 4 simbols):");
        int pin = attempt.nextInt();
        int num = 1234;
        if (pin == num) {
            System.out.println("Access granted!");
        } else {
            Scanner secondatt = new Scanner(System.in);
            System.out.println("Incorrect PIN");
            System.out.println("Attempts left:2");
            System.out.println("Enter min 4 simbols:");
            int pin2 = attempt.nextInt();
            if (pin2 == num) {
                System.out.println("Access granted!");
            } else {
                Scanner thirdatt = new Scanner(System.in);
                System.out.println("Incorrect PIN");
                System.out.println("Attempts left:1");
                System.out.println("Enter min 4 simbols:");
                int pin3 = attempt.nextInt();
                if (pin3 == num) {
                    System.out.println("Access granted!");
                } else {

                    System.out.println("Incorrect PIN");
                    System.out.println("Attempts left:0");
                    System.out.println("Card blocked");
                }
            }

        }
    }
}