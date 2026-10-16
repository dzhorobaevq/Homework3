import java.util.Scanner;
public class A3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int negative = 0;
        int positive = 0;
        int zero = 0;
        int odd = 0;
        int even = 0;
        int i =1;
        while(i <= 10) {

            System.out.println("Enter number " + i + ":");
            int number = scanner.nextInt();

            if (number < 0) {
                negative++;
            } else if (number > 0) {
                positive++;
            } else {
                zero++;
            }
            if (number % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            i++;

        }
        System.out.println("Numbers of positive numbers:" + positive);
        System.out.println("Numbers of negative numbers:" + negative);
        System.out.println("Numbers of zero numbers:" + zero);
        System.out.println("Numbers of even numbers:" + even);
        System.out.println("Numbers of odd numbers:" + odd);
    }
}