import java.util.Scanner;
public class d5 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = myObj.nextInt();
        int i = 1;
        while(i<=number){
            i++;
            if(i % 2 == 1) {
                System.out.println(i);
            }

        }
        System.out.println("Here is all Odd numbers");

    }
}
//import java.util.Scanner;
//public class d5 {
//    public static void main(String[] args) {
//        Scanner myObj = new Scanner(System.in);
//        System.out.println("Enter a number:");
//        int number = myObj.nextInt();
//        for(int i =1;i<=number;i++)
//            if(i % 2 == 1) {
//                System.out.println(i);
//
//        }
//
//        System.out.println("Here is all Odd numbers");
//
//    }
//    }
//import java.util.Scanner;
//public class d5 {
//    public static void main(String[] args) {
//        Scanner myObj = new Scanner(System.in);
//        System.out.println("Enter a number:");
//        int number = myObj.nextInt();
//        int i = 1;
//        do {
//            if(i % 2 == 1) {
//                System.out.println(i);}
//            i++;
//        }while(i<=number);
//
//        System.out.println("Here is all Odd numbers");
//
//    }
//}
