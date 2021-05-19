import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class OneDimensionArrayInMethods {


    public static int[] ints = new int[2];
    public static float[] floats = new float[2];
    public static boolean[] booleans = new boolean[2];
    public static char[] chars = new char[2];
    public static String[] strings = new String[2];
    public static Integer[] integers = new Integer[2];

    public static int min = 0;
    public static int max = 100;
    public static int lengthOfArray = 5;

    public static int[] randNums = uploadArrayWithRandomNums();

    public static int[] numsInput;


    public static void main(String[] args) {

        // prints the default values! - as there is no element in the array!
        System.out.println("-----------1------------\n");
        printFirstLastItemInt(ints);
        printFirstLastItemFloat(floats);
        printFirstLastItemBoolean(booleans);
        printFirstLastItemChar(chars);
        printFirstLastItemString(strings);
        printFirstLastItemInteger(integers);


        System.out.println("\n-----------2------------\n");
        ints[0] = 1;
        floats[0] = 1.0F;
        booleans[0] = true;
        chars[0] = 'd';
        strings[0] = "Csaba";
        integers[0] = 1;

        // solved with another way! where we have all the result in function /separate first and last items!

        System.out.println("First int value: " + getFirstItem(ints) + " Last int value: " + getLastItem(ints));
        System.out.println("First float value: " + getFirstItem(floats) + " Last float value: " + getLastItem(floats));
        System.out.println("First float boolean: " + getFirstItem(booleans) + " Last float boolean: " + getLastItem(booleans));
        System.out.println("First char value: " + getFirstItem(chars) + " Last float value: " + getLastItem(chars));
        System.out.println("First String value: " + getFirstItem(strings) + " Last String value: " + getLastItem(strings));
        System.out.println("First Integer value: " + getFirstItem(integers) + " Last float value: " + getLastItem(integers));

        System.out.println("\n-----------3------------\n");

        // System.out.println(Arrays.toString(uploadArrayWithRandomNums()));

        System.out.println("The numbers of the array are: " + Arrays.toString(randNums));
//        randNums[0] ++;
//        System.out.println("The numbers of the new array are: " + Arrays.toString(randNums));
        System.out.println("The numbers of the new array are: " + Arrays.toString(addOneToFirstElement()));


        System.out.println("\n-----------4------------\n");

        numsInput = uploadArrayWithUserInput();
        System.out.println("The number of the arrays' given by the user is: " + Arrays.toString(numsInput));
        System.out.println("The new array is: " + Arrays.toString(changeElementOfArray()));

        System.out.println("\n-----------5------------\n");

        randomNumOfElementUser();

        System.out.println("\n-----------6------------\n");

        sumOfArrayElement(randNums);
        sumOfArrayElement(numsInput);
    }


    public static void printFirstLastItemInt(int[] nums) {
        System.out.println("First int prime value: " + nums[0] + " Last int value: " + nums[(nums.length - 1)]);
    }

    public static int getFirstItem(int[] nums) {
        return nums[0];
    }

    public static int getLastItem(int[] nums) {
        return nums[(nums.length - 1)];
    }

    public static void printFirstLastItemFloat(float[] nums) {
        System.out.println("First float value: " + nums[0] + " Last float value: " + nums[(nums.length - 1)]);
    }

    public static float getFirstItem(float[] nums) {
        return nums[0];
    }

    public static float getLastItem(float[] nums) {
        return nums[(nums.length - 1)];
    }

    public static void printFirstLastItemBoolean(boolean[] bool) {
        System.out.println("First boolean value: " + bool[0] + " Last boolean value: " + bool[(bool.length - 1)]);

    }

    public static boolean getFirstItem(boolean[] bool) {
        return bool[0];
    }

    public static boolean getLastItem(boolean[] bool) {
        return bool[(bool.length - 1)];
    }


    public static void printFirstLastItemChar(char[] chars) {
        System.out.println("First char value: " + chars[0] + " Last char value: " + chars[(chars.length - 1)]);
    }

    public static char getFirstItem(char[] chars) {
        return chars[0];
    }

    public static char getLastItem(char[] chars) {
        return chars[(chars.length - 1)];
    }


    public static void printFirstLastItemString(String[] string) {
        System.out.println("First String value: " + string[0] + " Last String value: " + string[(string.length - 1)]);
    }

    public static String getFirstItem(String[] string) {
        return string[0];
    }

    public static String getLastItem(String[] string) {
        return string[(string.length - 1)];
    }

    public static void printFirstLastItemInteger(Integer[] nums) {
        System.out.println("First Integer object value: " + nums[0] + " Last Integer value: " + nums[(nums.length - 1)]);
    }

    public static Integer getFirstItem(Integer[] nums) {
        return nums[0];
    }

    public static Integer getLastItem(Integer[] nums) {
        return nums[(nums.length - 1)];
    }


    public static int randomGenerator(int min, int max) {
        Random random = new Random();
        return (random.nextInt(max - min) + min);
    }


    public static int[] uploadArrayWithRandomNums() {
        int[] randomNums = new int[lengthOfArray];
        for (int i = 0; i < randomNums.length; i++) {
            randomNums[i] = randomGenerator(min, max);
        }
        // System.out.println("The numbers of the array are: " + Arrays.toString(randomNums));
        // randomNums[0] ++;
        // System.out.println("The numbers of the new array are: " + Arrays.toString(randomNums));
        return randomNums;
    }

    public static int[] addOneToFirstElement() {
        randNums[0]++;
        return randNums;
    }


    public static Scanner getScanner() {
        return new Scanner(System.in);
    }


    public static int getInputInt() {
        System.out.println("Please enter a number: ");
        return getScanner().nextInt();
    }


    public static int[] uploadArrayWithUserInput() {
        int[] numsUserInput = new int[lengthOfArray];
        for (int i = 0; i < numsUserInput.length; i++) {
            numsUserInput[i] = getInputInt();
        }
        return numsUserInput;
    }


    public static int[] changeElementOfArray() {
        System.out.println("Which number would you like to switch from 1-" + numsInput.length + ": ");
        int numberToSwitch = getScanner().nextInt();
        System.out.println("What is your new number?");
        numsInput[numberToSwitch - 1] = getScanner().nextInt();
        return numsInput;
    }


    public static void randomNumOfElementUser() {
        int randInt = randomGenerator(0, numsInput.length);
        System.out.println("The choosen number's index is: " + randInt);
        System.out.println("The choosen number the " + (randInt + 1) + " element of the array");
        System.out.println("The choosen number's value is: " + numsInput[randInt]);
    }


    public static void sumOfArrayElement(int[] array) {
        int sum = 0;
        int k;
        for (k = 0; k < array.length; k++) {
            sum += array[k];
        }
        System.out.println("The sum of the array is: " + sum);
    }
}
