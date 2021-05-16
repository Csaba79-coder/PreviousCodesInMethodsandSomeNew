import java.util.Scanner;

public class Exercise0505InMethods {

    public static Scanner scanner;


    public static void main(String[] args) {

        scanner = getScanner();

        remainderWithoutModulo();

        getAverageOfNums3();

        greetingUser();

        basicArithmeticOfTwoNums();
    }


    public static Scanner getScanner() {
        return new Scanner(System.in);
    }


    public static int getInput() {
        System.out.println("Please enter a number: ");
        return scanner.nextInt();
    }


    public static int getNumInt() {
        return getInput();
    }


    public static double getNumDouble() {
        return getInput();
    }


    public static void remainderWithoutModulo() {
        int firstNum = getNumInt();
        int secondNum = getNumInt();
        int modulo = firstNum - secondNum * (firstNum / secondNum);
        System.out.println("The result (using without modulo) is: " + modulo);
    }


    public static void getAverageOfNums3 () {
        double firstNum = getNumDouble();
        double secondNum = getNumDouble();
        double thirdNum = getNumDouble();
        double average = ((firstNum + secondNum + thirdNum) / 3);
        System.out.println("The average of the 3 nums are: " + average);
    }

    public static String getUserName() {
        System.out.println("Please enter your name: ");
        scanner.nextLine();
        return scanner.nextLine();
    }


    public static void greetingUser() {
        System.out.println("Hello dear user: " + getUserName());
    }


    public static void basicArithmeticOfTwoNums() {
        double firstNum = getNumInt();
        double secondNum = getNumInt();
        System.out.println("The sum of the nums: " + (firstNum + secondNum));
        System.out.println("The difference of the nums: " + (firstNum - secondNum));
        System.out.println("The multiple of the nums: " + (firstNum * secondNum));
        System.out.println("The division of the nums: " + (firstNum / secondNum));
    }
}


