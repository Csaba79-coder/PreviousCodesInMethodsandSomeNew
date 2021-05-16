import java.util.Arrays;
import java.util.Random;


public class ArraysIfLoops_0508_02_SecondPart_InMethods {


    public static int min = 18;
    public static int max = 42;

    public static int[] ints = new int[randomGenerator(min, max)];


    public static int[] nums1 = new int[randomGenerator(10, 11)];
    public static int[] nums2 = new int[randomGenerator(10, 11)];
    public static int[] nums3 = new int[randomGenerator(10, 11)];
    public static int[] nums4 = new int[randomGenerator(10, 11)];
    public static int[] nums5 = new int[randomGenerator(10, 11)];
    public static int[] nums6 = new int[randomGenerator(10, 11)];
    public static int[] nums7 = new int[randomGenerator(10, 11)];
    public static int[] nums8 = new int[randomGenerator(10, 11)];
    public static int[] nums9 = new int[randomGenerator(10, 11)];
    public static int[] nums10 = new int[randomGenerator(10, 11)];


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


        // after the Exercise number 8:


        randomNumsUploading(10, 20, nums1);
        randomNumsUploading(10, 20, nums2);
        randomNumsUploading(10, 20, nums3);
        randomNumsUploading(10, 20, nums4);
        randomNumsUploading(10, 20, nums5);
        randomNumsUploading(10, 20, nums6);
        randomNumsUploading(10, 20, nums7);
        randomNumsUploading(10, 20, nums8);
        randomNumsUploading(10, 20, nums9);
        randomNumsUploading(10, 20, nums10);

        creatingMatrix();

        printSumOfArray();

        findMaxValueOfArray(sumArray());
        findMinValueOfArray(sumArray());
        findIndexOfMaxOfMatrix(sumArray());
        findIndexOfMinOfMatrix(sumArray());
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

    // I made it as an extra :)
    public static void creatingMatrix () {
        int[][] matrix = {nums1, nums2, nums3, nums4, nums5, nums6, nums7, nums8, nums9, nums10};
        System.out.println("The matrix is as follows: " + (Arrays.deepToString(matrix)));
    }


    public static int sumOfMatrix (int[] array){
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }


    public static int[] sumArray() {
        return new int[]{sumOfMatrix(nums1), sumOfMatrix(nums2), sumOfMatrix(nums3), sumOfMatrix(nums4), sumOfMatrix(nums5),
                sumOfMatrix(nums6), sumOfMatrix(nums7), sumOfMatrix(nums8), sumOfMatrix(nums9), sumOfMatrix(nums10)};
    }


    public static void printSumOfArray() {
        System.out.println("The sum of the elements of arrays one-by-one: " + Arrays.toString(sumArray()));
    }


    public static void findIndexOfMaxOfMatrix (int[] array) {
        int max = 0;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i;
            }
        }
        System.out.println("The number of the array that has the max value is: " + (index + 1) +
                " and the index number of the array is: " + index);
    }


    public static void findIndexOfMinOfMatrix (int[] array) {
        int min = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                index = i;
            }
        }
        System.out.println("The number of the array that has the min value is: " + (index + 1) +
                " and the index number of the array is: " + index);
    }
}
