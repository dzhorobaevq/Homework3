import java.util.Scanner;
public class A2 {
    public static void main(String[] args) {
        Scanner guess11 = new Scanner(System.in);
        System.out.println("Attempts left:5");
        System.out.println("Enter your guess:");
        int guess1 = guess11.nextInt();
        int num = 16;
        if (guess1 == num) {
            System.out.println("You won!");
            System.out.println("You needed 1 attempt");
        } else {
            Scanner guess22 = new Scanner(System.in);
            if(guess1 > num){
                System.out.println("Too high!");
            } else{
                System.out.println("Too low!");   }
            System.out.println("Attempts left:4");
            System.out.println("Enter your guess:");
            int guess2 = guess22.nextInt();
            if (guess2 == num) {
                System.out.println("You won!");
                System.out.println("You needed 2 attempts");
            } else {
                Scanner guess33 = new Scanner(System.in);
                if(guess2 > num){
                    System.out.println("Too high!");
                } else{
                    System.out.println("Too low!");   }
                System.out.println("Attempts left:3");
                System.out.println("Enter your guess:");
                int guess3 = guess33.nextInt();
                if (guess3 == num) {
                    System.out.println("You won!");
                    System.out.println("You needed 3 attempts");
                } else {
                    Scanner guess44 = new Scanner(System.in);
                    if(guess3 > num){
                        System.out.println("Too high!");
                    } else{
                        System.out.println("Too low!");   }
                    System.out.println("Attempts left:2");
                    System.out.println("Enter your guess:");
                    int guess4 = guess44.nextInt();
                    if (guess4 == num) {
                        System.out.println("You won!");
                        System.out.println("You needed 4 attempts");
                    } else {
                        Scanner guess55 = new Scanner(System.in);
                        if(guess4 > num){
                            System.out.println("Too high!");
                        } else{
                            System.out.println("Too low!");   }
                        System.out.println("Attempts left:1");
                        System.out.println("Enter your guess:");
                        int guess5 = guess55.nextInt();
                        if (guess5 == num) {
                            System.out.println("You won");
                            System.out.println("You needed 5 attempts");
                        } else {
                            System.out.println("Game over");



                        }
                    }

                }
            }
        }
    }
}