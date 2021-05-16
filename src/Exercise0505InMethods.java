import java.util.Scanner;

public class Exercise0505InMethods {

    public static Scanner scanner;


    public static void main(String[] args) {

        scanner = getScanner();
        System.out.println(getInput());

    }


    public static Scanner getScanner() {
        return new Scanner(System.in);
    }


    public static int getInput() {
        System.out.println("Please enter a number: ");
        return scanner.nextInt();
    }
}


//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please give the first whole number: ");
//        int a = sc.nextInt();
//        System.out.println("Please give the second whole number: ");
//        int b = sc.nextInt();
//
//        // % without using modulo operator
//        System.out.println(a - b * (a / b));


