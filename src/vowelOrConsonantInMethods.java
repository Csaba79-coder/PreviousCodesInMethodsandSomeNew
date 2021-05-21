import java.util.Scanner;


public class vowelOrConsonantInMethods {


    public static int tries = 3;
    public static int limit = 3;
    public static boolean isValidInput = false;
    public static char ch;


    public static void main(String[] args) {

        System.out.println("Checking character is vowel or consonant?!\n");
        checkCharInput(isValidInput());

    }


    public static Scanner getScanner() {
        return new Scanner(System.in);
    }


    public static char getCharInput() {
        System.out.println("Please give me a char (regarding ASCII - English ABC) for checking vowel or constant: ");
        return getScanner().next().charAt(0);
    }



    public static boolean isValidInput() {
        do {
           ch = getCharInput();
        if (Character.isAlphabetic(ch)) {
            isValidInput = true;
        } else System.out.println("Invalid input, please try again, maximum tries " + --limit + "!");
        }
        while (!isValidInput && (--tries > 0));
        return isValidInput;
    }


    public static void checkCharInput(boolean bool) {
        if (bool == true) {
            char chSwitchLower = Character.toLowerCase(ch);
            switch (chSwitchLower) {
                case 'a', 'e', 'i', 'o', 'u', 'á', 'é', 'í', 'ó', 'ö', 'ő', 'ú', 'ü', 'ű', 'ä' -> System.out.println(ch + " is vowel");
                default -> System.out.println(ch + " is consonant");
            }
        } else System.out.println("Invalid input");
    }
}


