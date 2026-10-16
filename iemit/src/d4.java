import java.util.Scanner;
public class d4 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        do{
            number++;
            System.out.println(number);

        }while(true);
    }
}