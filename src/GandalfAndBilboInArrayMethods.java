import java.util.Arrays;


public class GandalfAndBilboInArrayMethods {


    public static void main(String[] args) {

        int[] nums = {100, 430, 380, 230, 310, 225, 213, 178, 202, 30, 110};
        System.out.println(findTheMax(nums));
        System.out.println(findMaxByIndexes(nums, 2));
        System.out.println(findMaxByIndexes(nums, 8));
        System.out.println(findMaxByIndexes(nums, 9));
        System.out.println(findMaxByIndexes(nums, 10));

        int[] numsWeight = {84, 83, 82, 76, 61, 70, 58, 67, 72, 85};
        System.out.println("The dwarfs and Gandalf needs " + intPairs(numsWeight) + " min to go across the bridge!");

    }


    public static int findTheMax(int[] array) {
        int max = array[0];
        for (int j : array) {
            if (max < j) {
                max = j;
            }
        }
        return max;
    }


    public static int findMaxByIndexes(int[] array, int currentLocation) {
        int max = array[0];
        int counter = 0;
        for (int i = currentLocation; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            } else if (max != array[currentLocation]) {
                counter++;
            }
        }
        System.out.println("The index of current location is: " + currentLocation +
                " the index of the element with max value in the original array is: " + (currentLocation + counter));
        return max;
    }


    public static int intPairs(int[] array) {
        int temp1;
        int[] bubbleSortedIncrease = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j - 1] > array[j]) {
                    temp1 = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp1;
                }
            }
        }
        System.arraycopy(array, 0, bubbleSortedIncrease, 0, array.length);

        System.out.println(Arrays.toString(bubbleSortedIncrease));

        int temp2;
        int[] bubbleSortedDecrease = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++)
                if (array[j - 1] < array[j]) {
                    temp2 = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp2;
                }
        }
        System.arraycopy(array, 0, bubbleSortedDecrease, 0, array.length);

        System.out.println(Arrays.toString(bubbleSortedDecrease));


        int whatTheFuck = 0;
        int firstIndex = 0;
        int lastIndex = (array.length - 1);
        for (int i = firstIndex; i < bubbleSortedIncrease.length; i++) {
            if (bubbleSortedIncrease[firstIndex] + bubbleSortedIncrease[lastIndex] <= 150) {
                firstIndex++;
                lastIndex--;
                whatTheFuck++;
            }
        }
        return (((array.length - (2 * whatTheFuck)) + whatTheFuck) * 5);
    }
}