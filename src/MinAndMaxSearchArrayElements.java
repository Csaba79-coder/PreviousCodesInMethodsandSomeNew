import java.util.Arrays;
import java.util.Random;


public class MinAndMaxSearchArrayElements {

    public static void main(String[] args) {

        int arrayLength = 10;
        int min = 10;
        int max = 100;
        int[] array = randomArray(arrayLength, min, max);
        System.out.println(Arrays.toString(array));
        System.out.println(findMinValue(array));
        System.out.println(findMaxValue(array));
    }


    public static int getRandomNums(int min, int max) {
        Random randNum = new Random();
        return randNum.nextInt(max - min + 1) + min;
    }


    public static int[] randomArray(int num, int min, int max) {
        int[] array = new int[num];
        for (int i = 0; i < array.length; i++) {
            // max included!
            array[i] = getRandomNums(min, max);
        }
        return array;
    }


    public static int findMinValue(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                i++;
            }
        }
        return min;
    }


    public static int findMaxValue(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                i++;
            }
        }
        return max;
    }
}


