import java.util.Arrays;


public class MockExamWithAdvicesSendingForReview {


    public static void main(String[] args) {


        // for checking prints:
        System.out.println(checkDivision(7));
        System.out.println(checkDivision(10, 5));
        System.out.println(checkDivision(10, 3));
        System.out.println(countIntDivisors(16));
        System.out.println(divisorWithMaxLimit(16, 3));
        System.out.println(counterIntDivisorPairs(16));
        System.out.println(sumDigits(123));
        System.out.println(differenceOfDigits(123, sumDigits(123)));
        System.out.println(isPalindrome("ANNA"));
        System.out.println(isPalindrome("CSABA"));
        System.out.println(Arrays.toString(getPrimeFirstTen()));
        System.out.println(Arrays.toString(getPrime(26)));

        String[] strings = {"apple", "melon"};
        System.out.println(Arrays.toString(indexOfItems(strings, "a")));
        System.out.println(Arrays.toString(indexOfItems(strings, "e")));
        System.out.println(Arrays.toString(indexOfItems(strings, "o")));
        System.out.println(Arrays.toString(indexOfItems(strings, "x")));

//        String[] strings2 = {"apple", "watermelon"};
//        System.out.println(Arrays.toString(indexOfItemsDoubleChar(strings2, "e")));
//        System.out.println(Arrays.toString(indexOfItemsDoubleChar(strings2, "o")));
//        System.out.println(Arrays.toString(indexOfItemsDoubleChar(strings2, "x")));

        int[] nums = {1, 2, 1, 3, 4, 5, 6, 1, 1, 1, 1};
        int[] nums2 = {1, 2, 3, 4, 5, 6};
        System.out.println(howManyTimesElement(nums, 1));
        System.out.println(howManyTimesElement(nums2, 1));
        System.out.println(howManyTimesElement(nums2, 7));

    }


    public static boolean checkDivision(double number1) {
        return (number1 % 7 == 0);
    }


    public static boolean checkDivision(double number1, double number2) {
        return (number1 % number2 == 0);
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
        return Math.min(number, limit);
        // before refactor:
//        if (number < limit) {
//            return number;
//        } else if (number > limit) {
//            return limit;
//        } else return number;
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
        String reverse = new StringBuffer(string).reverse().toString();
        return (string.equals(reverse));
    }


    public static int[] getPrimeFirstTen() {
        int n = 10;
        int status = 1;
        int num = 2;
        int[] primes = new int[n];

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


    public static int[] getPrime(int n) {
        int status = 1;
        int num = 2;
        int[] primes = new int[n];

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


    public static int[] indexOfItems(String[] array, String character) {
        int occurrences = 0;
        int[] tempArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i].toLowerCase().contains(character.toLowerCase())) {
                tempArray[occurrences] = i;
                occurrences++;
            }
        }
        int[] result = new int[occurrences];
        System.arraycopy(tempArray, 0, result, 0, occurrences);

        // this one bellow was before intelliJ transforms :)
//        for (int i = 0; i < occurrences; i++) {
//            result[i] = tempArray[i];
//        }

        return result;
    }

//
    


    public static int howManyTimesElement(int[] array, int number) {
        int counter = 0;
        for (int j : array) {
            if (number == j) {
                counter++;
            }
        }
        return counter;
    }
}

