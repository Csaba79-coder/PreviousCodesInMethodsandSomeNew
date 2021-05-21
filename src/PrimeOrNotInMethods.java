import java.util.Scanner;


public class PrimeOrNotInMethods {


    public static int number; //  = Integer.MAX_VALUE; - for checking max value!

    public static boolean isPrime = false;

    // natural numbers are non-negative integers!
    //prim numbers can only be natural integers, minimum is 2 !!!
    // e.g.: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101,
    // 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199
    //numbers divisible by themselves and one are prim numbers !!!
    // therefore I am examining divisibility !!!


    public static void main(String[] args) {


        System.out.println("Please enter a number for checking whether it is prime or not?!\n");
        number = getIntInput();
        isPrime(getUserIntInput(number));

    }


    public static Scanner getScanner() { return new Scanner(System.in); }


    public static int getIntInput() {
        System.out.println("Please enter a number:");
        return getScanner().nextInt();
    }


    public static int getUserIntInput(int number) {
        return number;
    }


    public static void isPrime(int number) {
        if (number < 2) {
            isPrime = true;
        }
        for (int i = 2; i <= number / 2; ++i) {
            // condition for nonprime number
            if (number % i == 0) {
                isPrime = true;
                break;
            }
        }
        if (!isPrime)
            System.out.println(number + " is a prime number.");
        else
            System.out.println(number + " is not a prime number.");
    }
}
