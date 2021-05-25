import java.util.Locale;
import java.util.Scanner;


public class GenderHeightLimitMethod {


    public static boolean isValid = false;
    public static String gender;
    public static int height;
//    public static int triesGender = 3;
//    public static int limitGender = 3;
//    public static int triesHeight = 3;
//    public static int limitHeight = 3;
    public static int limit = 5;
    public static int tries = 5;


    public static void main(String[] args) {

        // getValidUserInputGender(triesGender, limitGender);
        // getValidUserInputHeight(triesHeight, limitHeight);
        isValidInput(limit, tries);

    }


    public static Scanner getScanner() { return new Scanner(System.in); }


    public static String getStringInput() {
        return getScanner().nextLine().toUpperCase(Locale.ROOT);
    }


    public static int getIntInput() {
        return getScanner().nextInt();
    }


    public static String getGender() {
        System.out.println("Please enter a gender (M for MALE - F for FEMALE): ");
        return getStringInput();
    }


    public static int getHeight() {
        System.out.println("Please enter a height in cm: ");
        return getIntInput();
    }


//    public static boolean getValidUserInputGender(int tries, int limit) {
//        do {
//            gender = getGender();
//            if (gender.equals("M") || gender.equals("F")) {
//                isValid = true;
//            }
//            else {
//                System.out.println("Invalid input, please try again, maximum tries " + --limit + "!");
//            }
//        }
//        while (!isValid && (--tries > 0));
//        return isValid;
//    }
//
//
//    public static boolean getValidUserInputHeight(int tries, int limit) {
//        do {
//            height = getHeight();
//            if (height > 30 && height < 250) {
//                isValid = true;
//            }
//            else {
//                System.out.println("Invalid input, please try again, maximum tries " + --limit + "!");
//            }
//        }
//        while (!isValid && (--tries > 0));
//        return isValid;
//    }


    public static boolean isValidInput(int limit, int tries) {
        do {
            gender = getGender();
            height = getHeight();
            if ( (gender.equals("M") || gender.equals("F") ) && ( height > 30 && height < 250)  ){
                isValid = true;
            }
            else {
                System.out.println("Invalid input, please try again, maximum tries " + --limit + "!");
            }
        }
        while (!isValid && (--tries > 0));
        return isValid;
    }

//



}

