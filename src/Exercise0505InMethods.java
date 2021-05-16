import java.util.Scanner;

public class Exercise0505InMethods {

    public static Scanner scanner;


    public static void main(String[] args) {

        scanner = getScanner();

        remainderWithoutModulo();


    }


    public static Scanner getScanner() {
        return new Scanner(System.in);
    }


    public static int getInput() {
        System.out.println("Please enter a number: ");
        return scanner.nextInt();
    }


    public static int getFirstNum() {
        return getInput();

    }


    public static int getSecondNum() {
        return getInput();
    }


    public static void remainderWithoutModulo() {
        int firstNum = getFirstNum();
        int secondNum = getSecondNum();
        int modulo = firstNum - secondNum * (firstNum / secondNum);
        System.out.println("The result (using without modulo) is: " + modulo);
    }
}


