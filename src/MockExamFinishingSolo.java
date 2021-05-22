import java.util.Arrays;
import java.util.Scanner;


public class MockExamFinishingSolo {


    public static void main(String[] args) {


        System.out.println("---------------1-------------------\n");
        System.out.println("Checking division by 7:");
        double number1 = getDoubleInput();
        double number2 = 7;
        System.out.println(printCheckDivisionResult(checkDivision(number1, number2), number1, number2));
        // extra 2 user input
        System.out.println("Checking division any number with any number:");
        number1 = getDoubleInput();
        number2 = getDoubleInput();
        System.out.println(printCheckDivisionResult(checkDivision(number1, number2), number1, number2));


        System.out.println("\n---------------2-------------------\n");
        System.out.println("Count the divisor!");
        int number = getIntInput();
        System.out.println("The number has " + countIntDivisors(number) + " divisor!");
        System.out.println("Divisor with max limit, please enter the max limit of divisors: ");
        number = countIntDivisors(number);
        int limit = getIntInput();
        System.out.println("The number has " + divisorWithMaxLimit(number, limit) + " divisor!");


        System.out.println("\n---------------3-------------------\n");
        System.out.println("Count the divisor pairs:");
        System.out.println("The number has " + counterIntDivisorPairs(getIntInput()) + " divisor pairs!");


        System.out.println("\n---------------4-------------------\n");
        System.out.println("Sum of the digits of a num:");
        number = getIntInput();
        System.out.println("The sum of the digits are: " + sumDigits(number));
        System.out.println("Calculate the difference of the oring number and the digits's sum as follows: ");
        System.out.println("The difference of the original digit and the sum of the digit is: "
                + differenceOfDigits(number, sumDigits(number)));


        System.out.println("\n---------------5-------------------\n");
        System.out.println("Palindrome or not?");
        System.out.println(printIsPalindrome(isPalindrome("ANNA")));
        System.out.println(printIsPalindrome(isPalindrome("CSABA")));
        System.out.println(isPalindromeByMyself("malayalam"));
        System.out.println(isPalindromeByMyself("GeeksForGeeks"));


        System.out.println("\n---------------6-------------------\n");
        System.out.println("Get first 10 prime numbers:");
        System.out.println(Arrays.toString(getPrimeFirstTen()));
        System.out.println("Get first n prime numbers:");
        int n = getIntInput();
        System.out.println("Get the first " + n + " number of primes in array: " + Arrays.toString(getPrime(n)));

        System.out.println("\n---------------7-------------------\n");
        String[] strings = {"apple", "melon"};
//        System.out.println(sumCharsInStringArray(strings));
//        System.out.println(convertStringToCharArray(strings, sumCharsInStringArray(strings)));
        System.out.println(Arrays.toString(convertStringToCharArray(strings, sumCharsInStringArray(strings))));
        System.out.println(findCharsIndices(convertStringToCharArray(strings, sumCharsInStringArray(strings)), "a"));
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


//    // it was not necessary to write, there were no such exercises!
//    public static String getStringInput() {
//        System.out.println("Please enter a text:");
//        return getScanner().nextLine();
//    }


    public static boolean checkDivision(double number1, double number2) {
        return (number1 % number2 == 0);
    }


    public static String printCheckDivisionResult(boolean bool, double number1, double number2) {
        return bool ? "It is possible to divide the " + number1 + " with "
                + number2 + " without remainder!" : "It is not possible to divide the number without remainder!";
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


    public static int divisorWithMaxLimit(int number, int limit) {
        if (number < limit) {
            System.out.println("The number has " + number + "!");
            return number;
        } else if (number > limit) {
            System.out.println("The number has more divisor, but the limit is: " + limit + "!");
            return limit;
        } else return number;
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


    public static int sumDigits(int number) {
        int n, sum = 0;
        while (number > 0) {
            n = number % 10;
            sum = sum + n;
            number = number / 10;
        }
        return sum;
    }


    public static int differenceOfDigits(int number1, int number2) {
        return Math.abs((number1 - number2));
    }


    public static boolean isPalindrome(String string) {
        int i = 0, j = string.length() - 1;
        while (i < j) {
            if (string.charAt(i) != string.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }


    public static String isPalindromeByMyself(String string) {
        String result;
        String reverse = new StringBuffer(string).reverse().toString();
        result = (string.equals(reverse)) ? "The text is palindrome!" : "The text is not palindrome!";
        return result;
    }


    public static String printIsPalindrome(boolean bool) {
        return bool ? "The text is palindrome!" : "This is not palindrome!";
    }


    public static int[] getPrimeFirstTen() {
        int n = 10;
        int status = 1;
        int num = 2;
        int[] primeNums = new int[10];


        for (int i = 0; i < n; ) {
            for (int j = 2; j <= Math.sqrt(num); j++) {
                if (num % j == 0) {
                    status = 0;
                    break;
                }
            }
            if (status != 0) {
                primeNums[i] = num;
                i++;
            }
            status = 1;
            num++;
        }
        return primeNums;
    }


    public static int[] getPrime(int n) {
        int status = 1;
        int num = 2;
        int[] primes = new int[n];

        System.out.println("First " + n + " prime numbers are:");


        for (int i = 0; i < n; ) {
            for (int j = 2; j <= Math.sqrt(num); j++) {
                if (num % j == 0) {
                    status = 0;
                    break;
                }
            }
            if (status != 0) {
                primes[i] = num;
                i++;
            }
            status = 1;
            num++;
        }
        return primes;
    }


    public static int sumCharsInStringArray(String[] strings) {
        int sum = 0;
        for (String string : strings) {
            for (int j = 0; j < string.length(); j++) {
                sum++;
            }
        }
        return sum;
    }


    public static String[] convertStringToCharArray(String[] strings, int sum) {
        int k = 0;
        String[] characters = new String[sumCharsInStringArray(strings)];
        for (String s : strings) {
            for (int j = 0; j < s.length(); j++) {
                characters[k++] = String.valueOf(s.charAt(j));
            }
        }
        return characters;
    }


    // making char array from string!!!
//    public static char[] convertStringToCharArray(String[] strings, int sum) {
//        int k = 0;
//        char[] characters = new char[sumCharsInStringArray(strings)];
//        for (String s : strings) {
//            for (int j = 0; j < s.length(); j++) {
//                characters[k++] = s.charAt(j);
//            }
//        }
//        return characters;
//    }


    public static int findCharsIndices(String[] strings, String character) {
        character = null;
        int index = 0;
        for (int i = 0; i < strings.length; i++) {
            if (strings[i] == character);
            index++;
        }
        return index;
    }


}