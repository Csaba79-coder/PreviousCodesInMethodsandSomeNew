import java.util.Scanner;

public class Exercise0505InMethods {

    public static Scanner scanner;


    public static void main(String[] args) {

        scanner = getScanner();

        remainderWithoutModulo();

        getAverageOfNums3();

    }


    public static Scanner getScanner() {
        return new Scanner(System.in);
    }


    public static int getInput() {
        System.out.println("Please enter a number: ");
        return scanner.nextInt();
    }


    public static int getFirstNumInt() {
        return getInput();
    }


    public static double getFirstNumDouble() {
        return getInput();
    }


    public static int getSecondNumInt() {
        return getInput();
    }


    public static double getSecondNumDouble() {
        return getInput();
    }


    public static double getThirdNumDouble() {
        return getInput();
    }


    public static void remainderWithoutModulo() {
        int firstNum = getFirstNumInt();
        int secondNum = getSecondNumInt();
        int modulo = firstNum - secondNum * (firstNum / secondNum);
        System.out.println("The result (using without modulo) is: " + modulo);
    }


    public static void getAverageOfNums3 () {
        double firstNum = getFirstNumDouble();
        double secondNum = getSecondNumDouble();
        double thirdNum = getThirdNumDouble();
        double average = ((firstNum + secondNum + thirdNum) / 3);
        System.out.println("The average of the 3 nums are: " + average);
    }
}


