// import java.util.Arrays;
import java.util.Scanner;


public class mockExam_0521 {


    public static boolean division = false;
    public static double number1;
    public static double number2 = 7;

    public static int number;

    public static boolean palindrome = false;


    public static void main(String[] args) {


        System.out.println("---------------1-------------------\n");
        System.out.println("Checking division by 7:");
        number1 = getDoubleInput();
        printCheckDivisionResult(checkDivision(number1, number2));
        // extra 2 user input
        System.out.println("Checking division any number with any number:");
        number1 = getDoubleInput();
        number2 = getDoubleInput();
        printCheckDivisionResult(checkDivision(number1, number2));

        System.out.println("\n---------------2-------------------\n");
        System.out.println("Count the divisor!");
        System.out.println("The number has " + countIntDivisors(getIntInput()) + " divisor!");

        System.out.println("\n---------------3-------------------\n");
        System.out.println("Count the divisor pairs:");
        System.out.println("The number has " + counterIntDivisorPairs(getIntInput()) + " divisor pairs!");

        System.out.println("\n---------------4-------------------\n");
        System.out.println("Sum of the digits of a num:");
        System.out.println("The sum of the digits are: " + sumDigits());

        System.out.println("\n---------------5-------------------\n");
        System.out.println("Palindrome or not?");
        printIsPalindrome(isPalindrome());

        System.out.println("\n---------------6-------------------\n");
        System.out.println("Get first 10 prime numbers:");
        System.out.println(getPrimeFirstTen());
        System.out.println("Get first n prime numbers:");
        System.out.println(getPrime());
        // wanted to continue to add nums to array!!! as elements!
        // Arrays.toString(getPrime())


    }


    public static Scanner getScanner() {
        return new Scanner(System.in);
    }


    public static double getDoubleInput() {
        System.out.println("Please enter a number:");
        return getScanner().nextDouble();
    }


    public static int getIntInput() {
        System.out.println("Please enter a number:");
        return getScanner().nextInt();
    }


    public static String getStringInput() {
        System.out.println("Please enter a text:");
        return getScanner().nextLine();
    }


    public static boolean checkDivision(double number1, double number2) {
        if (number1 % number2 == 0) {
            return !division;
        }
        return division;
    }


    public static void printCheckDivisionResult(boolean bool) {
        if (bool) {
            System.out.println("It is possible to divide the " + number1 + " with " + number2 + " without remainder!");
        } else {
            System.out.println("It is not possible to divide the number without remainder!");
        }
    }


    public static int countIntDivisors(int number) {
        int counter = 0;
        for (int i = 1; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                if (number / i == i)
                    counter++;

                else
                    counter = counter + 2;
            }
        }
        return counter;
    }


    public static double counterIntDivisorPairs(int number) {
        double counterPairs = 0;
        for (int i = 1; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                if (number / i == i)
                    counterPairs++;

                else
                    counterPairs = counterPairs + 2;
            }
        }
        return Math.ceil((counterPairs / 2));
    }


    public static int sumDigits() {
        int n, sum = 0;
        number = getIntInput();
        while (number > 0) {
            n = number % 10;
            sum = sum + n;
            number = number / 10;
        }
        return sum;
    }


    public static boolean isPalindrome() {
        String string = getStringInput();
        int i = 0, j = string.length() - 1;
        while (i < j) {
            if (string.charAt(i) != string.charAt(j))
                return !palindrome;
            i++;
            j--;
        }
        return palindrome;
    }

    public static void printIsPalindrome(boolean bool) {
        if (bool == palindrome) {
            System.out.println("The text is palindrome!");
        }
        else {
                System.out.println("This is not palindrome!");
        }
    }


    public static int getPrimeFirstTen() {
        int n = 10;
        int status = 1;
        int num = 2;

        if (n >= 1) {
            System.out.println("First " + n + " prime numbers are:");
        }

        for ( int i = 2 ; i <= n ;  )
        {
            for ( int j = 2 ; j <= Math.sqrt(num) ; j++ )
            {
                if ( num % j == 0 )
                {
                    status = 0;
                    break;
                }
            }
            if ( status != 0 )
            {
                System.out.println(num);
                i++;
            }
            status = 1;
            num++;
        }
        return num;
    }


    public static int getPrime() {
        int n = getIntInput();
        int status = 1;
        int num = 2;
        int index = 0;
        int[] primes = new int[n];

        if (n >= 1) {
            System.out.println("First " + n + " prime numbers are:");
            System.out.println(2);
        }

        for ( int i = 2 ; i <= n ;  )
        {
            for ( int j = 2 ; j <= Math.sqrt(num) ; j++ )
            {
                if ( num % j == 0 )
                {
                    status = 0;
                    index++;
                    break;
                }
            }
            if ( status != 0 )
            {
                System.out.println(num);
                i++;
            }
            status = 1;
            num++;
        }
        return num;
    }
}
