import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomMethods {


    public static void main(String[] args) {

        System.out.println(getRandom());
        System.out.println(getRandomNums(10, 100));
        System.out.println(Arrays.toString(randomArray(getIntInput())));
    }

    // get 1 random number from the interval of int
    public static int getRandom() {
        Random randomNum = new Random();
        return randomNum.nextInt();
    }


    // creating random numbers between min and max interval! max is included!!!
    public static int getRandomNums(int min, int max) {
        Random randNum = new Random();

        return randNum.nextInt(max - min + 1) + min;
    }


    // generating array (random length if input int num = getRandom()
    public static int[] randomArray(int num) {
        int[] array = new int[num];
        for (int i = 0; i < array.length; i++) {
            // uploading with random nums!
            // array[i] = getRandom();

            // or another way to upload
            array[i] = getRandomNums(10, 100);
        }
        return array;
    }


    public static Scanner getScanner() { return new Scanner(System.in); }


    public static int getIntInput() {
        System.out.println("Please enter a number: ");
        return getScanner().nextInt();
    }
}
