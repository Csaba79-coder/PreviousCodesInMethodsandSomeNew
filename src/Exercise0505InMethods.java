import java.util.Scanner;

public class Exercise0505InMethods {

    public static Scanner scanner;


    public static void main(String[] args) {

        scanner = getScanner();

        remainderWithoutModulo();

        System.out.println("------------------------");

        getAverageOfNums3();

        System.out.println("------------------------");

        greetingUser();

        System.out.println("------------------------");

        basicArithmeticOfTwoNums();

        System.out.println("------------------------");

        printCharFromInput();

        System.out.println("------------------------");

        trueOrFalse();

        System.out.println("------------------------");

        findMaxNum();

        System.out.println("------------------------");

        calculateSquare();

        System.out.println("------------------------");

        calculateRaiseToPower();

        System.out.println("------------------------");

        calculateSquareRoot();
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


    public static char getCharInput() {
        System.out.println("Please enter a char: ");
        return scanner.next().charAt(0);
    }


    public static void printCharFromInput() {
        System.out.println("The char is the following: " + getCharInput());
    }


    public static void trueOrFalse() {
        double num = getNumDouble();
        if (num > 0) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }


    public static void findMaxNum() {
        int num1 = getNumInt();
        int num2 = getNumInt();
        if (num1 > num2) {
            System.out.println("The bigger num is: " + num1);
        }
        else {
            System.out.println("The bigger num is: " + num2);
        }
    }


    public static void calculateSquare() {
        double num = getNumDouble();
        System.out.println("The square of the " + num + " is: " + (Math.pow (num, 2)));
    }


    public static void calculateRaiseToPower() {
        double num1 = getNumDouble();
        double num2 = getNumDouble();
        System.out.println(num1 + " raising to the power of " + num2 + " is equal to: " + (Math.pow(num1, num2)));
    }


    public static void  calculateSquareRoot() {
        double num = getNumDouble();
        System.out.println("The square root of the " + num + " is: " + Math.sqrt(num));
    }
}


