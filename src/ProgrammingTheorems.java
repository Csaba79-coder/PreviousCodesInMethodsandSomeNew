import java.util.Arrays;


public class ProgrammingTheorems {


    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6};
        System.out.println("The sum of the array elements are: " + sum(array));
        System.out.println("The sum of the array elements are: " + sum2(array));
        System.out.println(count(array) + " elements has the array!");
        int number1 = 6;
        System.out.println("The array contains " + number1 + ": " + decision(array, number1));
        int number2 = 7;
        System.out.println("The array contains " + number2 + ": " + decision(array, number2));
        System.out.println("The array contains " + number1 + ": " + decision2(array, number1));
        System.out.println("The array contains " + number2 + ": " + decision2(array, number2));
        System.out.println("The array's index where the " + number1 + " is situated is: " + index(array, number1));
        int[] array1 = {1, 2, 3, 4, 5, 6, 1, 2, 1, 2};
        System.out.println(Arrays.toString(sorting(array1, 2)));
        System.out.println(Arrays.toString(copyOfSorting(array1, 2)));
        int[] array2 = {1, 2, 3, 4, 5, 6, 1, 2, 1, 2};
        System.out.println(Arrays.toString(assortment(array2, 2)));
        int[] array3 = {1, 2, 3, 4, 5, 6};
        int[] array4 = {3, 4, 5, 6, 7, 8};
        System.out.println(Arrays.toString(intersection(array3, array4)));
        System.out.println(Arrays.toString(union(array3, array4)));
        System.out.println(max(array4));
        System.out.println(min(array4));

        System.out.println("Sorting with finding max value:");
        int[] sortingMax1 = {1, 10, 100, 9, 7, 52, 99, 78, 34, 77};
        System.out.println(Arrays.toString(sortingWithChoosingMaxIncreasingValues(sortingMax1)));
        System.out.println("Sorting with finding min value:");
        int[] sortingMin1 = {1, 10, 100, 9, 7, 52, 99, 78, 34, 77};
        System.out.println(Arrays.toString(sortingWithChoosingMinIncreasingValues(sortingMin1)));
        System.out.println("Bubble sort increasing and decreasing:");
        int[] bubble1 = {1, 10, 100, 9, 7, 52, 99, 78, 34, 77};
        System.out.println(Arrays.toString(bubbleSortGrowing(bubble1)));
        int[] bubble2 = {1, 10, 100, 9, 7, 52, 99, 78, 34, 77};
        System.out.println(Arrays.toString(bubbleSortGrowing2(bubble2)));
        int[] bubble5 = {1, 10, 100, 9, 7, 52, 99, 78, 34, 77};
        System.out.println(Arrays.toString(bubbleSortIncreasing1(bubble5)));
        int[] bubble3 = {1, 10, 100, 9, 7, 52, 99, 78, 34, 77};
        System.out.println(Arrays.toString(bubbleSortReducing(bubble3)));
        int[] bubble4 = {1, 10, 100, 9, 7, 52, 99, 78, 34, 77};
        System.out.println(Arrays.toString(bubbleSortReducing2(bubble4)));
        System.out.println("Binary search (using any of the sorted arrays!!!)");
        System.out.println("The index of the number is: ");
        int[] binary = {1, 7, 9, 10, 34, 52, 77, 78, 99, 100};
        System.out.println(binarySearch(binary, 9));
        System.out.println(binarySearch(binary, 78));
    }


    public static int sum(int[] array) {
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        return sum;
    }


    public static int sum2(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; ) {
            sum += array[i];
            i++;
        }
        return sum;
    }


    public static int count(int[] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            counter++;
        }
        return counter;
    }


    public static boolean decision(int[] array, int number) {
        // boolean contains = false; // boolean contains = false; is the same expression, as boolean default value is false!
        for (int j : array) {
            if (j == number) {
                ++j;
                return true; // return !contains
            }
        }
        return false; // return false
    }


    public static boolean decision2(int[] array, int number) {
        for (int j : array) {
            if (j == number) {
                ++j;
                // contains = true;
                return true;
            }
        }
        return false;
    }


    public static int index(int[] array, int number) {
        int index;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                i++;
            }
        }
        index = (number - 1);
        return index;
    }


    public static int[] sorting(int[] array, int number) {
        int selectedId = 0;
        int counter = 0;
        for (int j : array) {
            if (j == number) {
                counter++;
            }
        }
        int[] selected = new int[counter];
        for (int j : array) {
            if (j == number) {
                selected[selectedId] = j;
                selectedId++;
            }
        }
        return selected;
    }


    public static int[] copyOfSorting(int[] array, int number) {
        int selectedId = 0;
        int counter = 0;
        for (int j : array) {
            if (j == number) {
                counter++;
            }
        }
        int[] selected = new int[counter];
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                array[i]++;
                selected[selectedId] = array[i];
                selectedId++;
            }
        }
        return selected;
    }


    public static int[] assortment(int[] array, int number) {
        int selectedId = 0;
        int counter = 0;
        for (int j : array) {
            if (j == number) {
                counter++;
            }
        }
        int[] selected = new int[counter];
        for (int j : array) {
            if (j == number) {
                selected[selectedId] = j;
                selectedId++;
            }
        }
        int[] unselected = new int[array.length - counter];
        int nonId = 0;
        for (int k : array) {
            if (k != number) {
                unselected[nonId] = k;
                nonId++;
            }
        }
        return unselected;
    }


    public static int[] intersection(int[] array1, int[] array2) {
        int counter = 0;
        for (int k : array1) {
            for (int i : array2) {
                if (k == i) {
                    counter++;
                }
            }
        }
        int[] intersection = new int[counter];
        int id = 0;
        for (int j : array1) {
            for (int k : array2) {
                if (j == k) {
                    intersection[id] = k;
                    id++;
                }
            }
        }
        return intersection;
    }


    public static int[] union(int[] array1, int[] array2) {
        int id = 0;
        int[] union = new int[array1.length + array2.length];
        for (int j : array1) {
            union[id] = j;
            id++;
        }
        for (int i : array2) {
            union[id] = i;
            id++;
        }
        return union;
    }


    public static int max(int[] array) {
        int max = array[0];
        for (int j : array) {
            if (max < j) {
                max = j;
            }
        }
        return max;
    }


    public static int min(int[] array) {
        int min = array[0];
        for (int j : array) {
            if (min > j) {
                min = j;
            }
        }
        return min;
    }


    public static int[] sortingWithChoosingMaxIncreasingValues(int[] array) {

        int[] sortedWithMaxValue = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int tmp;
                if (array[i] > array[j]) {
                    tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
        System.arraycopy(array, 0, sortedWithMaxValue, 0, array.length);
            return sortedWithMaxValue;
    }


    public static int[] sortingWithChoosingMinIncreasingValues(int[] array) {

        int[] sortedWithMinValue = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int tmp;
                if (array[i] < array[j]) {
                    tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
        System.arraycopy(array, 0, sortedWithMinValue, 0, array.length);
        return sortedWithMinValue;
    }


    public static int[] bubbleSortGrowing(int[] array) {
        int temp;
        int[] bubbleSorted = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j] < array[j - 1]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
            System.arraycopy(array, 0, bubbleSorted, 0, array.length);
//            for (int k = 0; k < array.length; k++) {
//                bubbleSorted[k] = array[k];
        }
        return bubbleSorted;
    }


    public static int[] bubbleSortGrowing2(int[] array) {
        int temp;
        int[] bubbleSorted = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
            System.arraycopy(array, 0, bubbleSorted, 0, array.length);
        }
        return bubbleSorted;
    }


    public static int[] bubbleSortIncreasing1(int[] array) {
        int temp;
        int[] bubbleSorted = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < (array.length - 1); j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
            System.arraycopy(array, 0, bubbleSorted, 0, array.length);
        }
        return bubbleSorted;
    }


    public static int[] bubbleSortReducing(int[] array) {
        int temp;
        int[] bubbleSorted = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j - 1] < array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
            System.arraycopy(array, 0, bubbleSorted, 0, array.length);
        }
        return bubbleSorted;
    }


    public static int[] bubbleSortReducing2(int[] array) {
        int temp;
        int[] bubbleSorted = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < (array.length - 1); j++) {
                if (array[j] > array[j - 1]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
            System.arraycopy(array, 0, bubbleSorted, 0, array.length);
        }
        return bubbleSorted;
    }


    public static int binarySearch(int[] array, int number) {
        int left = 0;
        int right = array.length-1;
        int mid;
        int result = -1;

        if (number >= array[0] && number <= array[array.length-1])
            for (int i = 0; i < array.length; i++) {
                if (left <= right) {
                    mid = left + (right - left) / 2;
                    if (number < array[mid]) {
                        right = mid - 1;
                    } else if (number > array[mid]) {
                        left = mid + 1;
                    } else {
                        result = mid;
                    }
                }
            }
        return result;
    }
}