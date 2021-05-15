import java.util.Random;
import java.util.Scanner;

public class MinSearchArrayElements {

    public static void main(String[] args) {


    }


    public static int getrandom() {
        Random randomNum = new Random();
        return randomNum.nextInt();
    }


    public static int[] randomArray(int sizeOfArray) {
        int [] array = new int[sizeOfArray];
        sizeOfArray = getScanner().nextInt();
        return array;
    }


    public static Scanner getScanner() {
        Scanner scanner = new Scanner(System.in);
        return scanner;
    }


    public static void printArray(int[] array) {
        System.out.println("My array has the following values: ");
        for (int j : array) {
            System.out.println(" " + j);
            System.out.println("!");
        }
    }
}

