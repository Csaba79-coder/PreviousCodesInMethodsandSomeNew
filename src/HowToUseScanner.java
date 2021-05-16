import java.util.Scanner;

public class HowToUseScanner {

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
