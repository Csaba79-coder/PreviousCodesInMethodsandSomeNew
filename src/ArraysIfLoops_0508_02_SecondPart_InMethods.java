import java.util.Arrays;
import java.util.Random;


public class ArraysIfLoops_0508_02_SecondPart_InMethods {


    public static int min = 18;
    public static int max = 42;

    public static int[] ints = new int[randomGenerator(min, max)];


    public static void main(String[] args) {

        System.out.println("Before loading up, with default values:");
        System.out.println(Arrays.toString(ints));
        System.out.println("After loading:");
        randomNumsUploading(min, max, ints);
        System.out.println(Arrays.toString(ints));
        getEvenAndOddNums(ints);
        findMinValueOfArray(ints);
        findMaxValueOfArray(ints);
        differenceNums(ints);
        halfValueOfElements(ints);
        doubleValueOfElements(ints);



    }


    public static int randomGenerator(int min, int max) {
        Random random = new Random();
        return (random.nextInt(max - min) + min);
    }


    // I wanted to use the same min and max value
    public static void randomNumsUploading(int min, int max, int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = randomGenerator(min, max);
        }
    }


    public static void getEvenAndOddNums(int[] array) {
        int sum = 0;
        for (int j : array) {
            if (j % 2 == 0) {
                sum++;
            }
        }
        System.out.println("The length of array is: " + array.length);
        System.out.println("The sum odd numbers in array are: " + sum);
        System.out.println("The sum even numbers in array are: " + (array.length - sum));
    }


    public static void findMinValueOfArray(int[] array) {
        int minimum = array[0];
        for (int j : array) {
            if (minimum > j) {
                minimum = j;
            }
        }
        System.out.println("The min value of the array: " + minimum);
    }


    public static void findMaxValueOfArray(int[] array) {
        int maximum = array[0];
        for (int j : array) {
            if (maximum < j) {
                maximum = j;
            }
        }
        System.out.println("The max value of the array: " + maximum);
    }


    public static int averageValueOfArray(int[] array) {
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        // if print of average is here duplication !!! because of calling method / function
        return (sum / array.length);
    }


    public static void differenceNums(int[] array) {
        int counter = 0;
        for (int j : array) {
            if ((j + 2) == averageValueOfArray(array) || (j - 2) == averageValueOfArray(array))
                counter++;
        }
        System.out.println("The average value of the array is: " + averageValueOfArray(array));
        System.out.println("There are " + counter + " numbers, that smaller or larger with 2.");
    }


    public static void halfValueOfElements(int[] array) {
        int counter = 0;
        for (int j : array) {
            if (j < (averageValueOfArray(array) / 2)) {
                counter++;
            }
        }
        System.out.println("There are " + counter + " elements that has half value as the average sum of array!");
    }


    public static void doubleValueOfElements(int[] array) {
        int counter = 0;
        for (int j : array) {
            if (j > (averageValueOfArray(array) * 2)) {
                counter++;
            }
        }
        System.out.println("There are " + counter + " elements that has double value as the average sum of array!");
    }
}
