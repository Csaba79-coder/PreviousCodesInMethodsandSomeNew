public class ProgrammingTheorems {


    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6};
        System.out.println("The sum of the array elements are: " + sum(array));
        System.out.println("The sum of the array elements are: " + sum2(array));
        System.out.println(count(array) + " elements has the array!");
        int number1 = 6;
        System.out.println("The array contains " + number1 + ": " + decision(array, number1));
        int number2 = 7;
        System.out.println("The array contains " + number2 + ": " +decision(array, number2));
        System.out.println("The array contains " + number1 + ": " + decision2(array, number1));
        System.out.println("The array contains " + number2 + ": " +decision2(array, number2));
        System.out.println("The array's index where the " + number1 + " is situated is: " + index(array, number1));

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
        for (int i = 0; i < array.length;) {
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

    
}
