import java.util.Arrays;

public class ExtraAfterGandalf2 {

    public static void main(String[] args) {
        int[] trialArrOddEven = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(sortArrayToPddEvenOrder(trialArrOddEven)));
        System.out.println(addNumberRepeated(3, 3));
    }


    public static int[] sortArrayToPddEvenOrder(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                newArr[i] = arr[i];
            }
        }
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] % 2 == 0) {
//                newArr[i] = arr[i];
//            }
//        }
        return newArr;
    }


    public static int addNumberRepeated(int number, int repeat) {
        int result = 0;
        int k = 1;
        for (int i = 0; i < (repeat-1); i++) {
            result += (number + (number * Math.pow(10, k)));
            k++;
        }
        return result;
    }
}
