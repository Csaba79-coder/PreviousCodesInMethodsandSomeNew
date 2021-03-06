import java.util.Scanner;
import java.util.Random;


public class Exercise0505InMethods {


    public static Scanner scanner;

    public static String text = "There is nothing either good or bad, but thinking makes it so";

    public static String otherText = "In a hole in the ground there lived a hobbit";


    public static void main(String[] args) {

        scanner = getScanner();

        System.out.println("\nThe text is from William Shakespeare, Hamlet, Act II: " + text + "\n");

        System.out.println("-----------2------------");

        remainderWithoutModulo();

        System.out.println("-----------3------------");

        getAverageOfNums3();

        System.out.println("-----------4------------");

        greetingUser();

        System.out.println("-----------5-----------");

        basicArithmeticOfTwoNums();

        System.out.println("-----------6------------");

        printCharConcatenateFromInput();

        System.out.println("-----------7------------");

        trueOrFalse();

        System.out.println("-----------8------------");

        findMaxNum();

        System.out.println("-----------9------------");

        calculateSquare();

        System.out.println("----------10------------");

        calculateRaiseToPower();

        System.out.println("----------11------------");

        calculateSquareRoot();

        System.out.println("----------12------------");

        printRandomNum();

        System.out.println("----------13------------");

        printRandomNumIntervalByUser();

        System.out.println("----------14------------");

        countHowManyCharsInText(userTextInput());

        System.out.println("----------15------------");

        convertNumToString();

        System.out.println("----------16------------");

        greetingUserAgain();

        System.out.println("----------17------------");

        wordsAreEqualOrNot();

        System.out.println("----------18------------");

        textIsOneWordsOrNot();

        System.out.println("----------19------------");

        getFirstAndLastCharOfText(text);

        System.out.println("----------20------------");

        checkIndexOfACharInText();

        System.out.println("----------21------------");

        printDateNewFormat();

        System.out.println("----------22------------");

        printNumberOfDigits();

        System.out.println("----------23------------");

        printFirstTenCharOfText(otherText);

        System.out.println("----------24------------");

        printFirstWordOfText(otherText);
    }


    public static Scanner getScanner() {
        return new Scanner(System.in);
    }


    public static int getInput() {
        System.out.println("Please enter a number: ");
        return scanner.nextInt();
    }


    public static int getNumInt() {
        return getInput();
    }


    public static double getNumDouble() {
        return getInput();
    }


    public static void remainderWithoutModulo() {
        int firstNum = getNumInt();
        int secondNum = getNumInt();
        int modulo = firstNum - secondNum * (firstNum / secondNum);
        System.out.println("The result (using without modulo) is: " + modulo);
    }


    public static void getAverageOfNums3() {
        double firstNum = getNumDouble();
        double secondNum = getNumDouble();
        double thirdNum = getNumDouble();
        double average = ((firstNum + secondNum + thirdNum) / 3);
        System.out.println("The average of the 3 nums are: " + average);
    }

    public static String getUserName() {
        System.out.println("Please enter your name: ");
        scanner.nextLine();
        return scanner.nextLine();
    }


    public static void greetingUser() {
        System.out.println("Hello dear user who's name is: " + getUserName());
    }


    public static void basicArithmeticOfTwoNums() {
        double firstNum = getNumInt();
        double secondNum = getNumInt();
        System.out.println("The sum of the nums: " + (firstNum + secondNum));
        System.out.println("The difference of the nums: " + (firstNum - secondNum));
        System.out.println("The multiple of the nums: " + (firstNum * secondNum));
        System.out.println("The division of the nums: " + (firstNum / secondNum));
    }


    public static char getCharInput() {
        System.out.println("Please enter a char: ");
        return scanner.next().charAt(0);
    }


    public static void printCharConcatenateFromInput() {
        System.out.println("The char concatenate is the following: " + getCharInput() + getCharInput());
    }


    public static void trueOrFalse() {
        double num = getNumDouble();
        if (num > 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }


    public static void findMaxNum() {
        int num1 = getNumInt();
        int num2 = getNumInt();
        if (num1 > num2) {
            System.out.println("The bigger num is: " + num1);
        } else {
            System.out.println("The bigger num is: " + num2);
        }
    }


    public static void calculateSquare() {
        double num = getNumDouble();
        System.out.println("The square of the " + num + " is: " + (Math.pow(num, 2)));
    }


    public static void calculateRaiseToPower() {
        double num1 = getNumDouble();
        double num2 = getNumDouble();
        System.out.println(num1 + " raising to the power of " + num2 + " is equal to: " + (Math.pow(num1, num2)));
    }


    public static void calculateSquareRoot() {
        double num = getNumDouble();
        System.out.println("The square root of the " + num + " is: " + Math.sqrt(num));
    }

    public static int randomGenerator(int min, int max) {
        Random random = new Random();
        return (random.nextInt(max - min) + min);
    }


    public static void printRandomNum() {
        int min = 0;
        int max = 9;
        System.out.println("The random num between 0-9 is: " + randomGenerator(min, max));
    }


    public static void printRandomNumIntervalByUser() {
        int min = getNumInt();
        int max = getNumInt();
        // for including the max: I need (max + 1)
        System.out.println("The random num given by the interval of user is: " + randomGenerator(min, (max + 1)));
    }


    public static String userTextInput() {
        System.out.println("Please enter a text for counting the characters: ");
        scanner.nextLine();
        return scanner.nextLine();
    }


    public static void countHowManyCharsInText(String text) {
        int counter = 0;
        for (int i = 0; i < text.length(); i++) {
            counter++;
        }
        System.out.println("The string is: " + counter + " character long!");
    }

    public static String getStringFromDoubleFirst() {
        double doubleToString = getNumDouble();
        return String.valueOf(doubleToString);
    }

    public static String getGetStringFromIntSecond() {
        // another way:
        int intToString = getNumInt();
        return Integer.toString(intToString);
    }


    public static void convertNumToString() {
        System.out.println("This is a double: " + getStringFromDoubleFirst() + ", that written as string!");
        System.out.println("This is a int: " + getGetStringFromIntSecond() + ", that written as string!");
    }

    public static void greetingUserAgain() {
        System.out.println("Greeting, dear " + getUserName() + "! It is nice to see you again!");
    }


    public static String getWord() {
        System.out.println("Please enter a word: ");
        return scanner.nextLine();
    }


    public static void wordsAreEqualOrNot() {
        String word1 = getWord();
        String word2 = getWord();
        if (word1.equals(word2)) {
            System.out.println("The words are same!");
        }
        else {
            System.out.println("The word are not the same!");
        }
    }


    public static void getFirstAndLastCharOfText(String string) {
        System.out.println("The first char of the text is: " + string.charAt(0) +
                " and the last one is: " + string.charAt(string.length() - 1));
    }


    public static String getTextInput() {
        System.out.println("Please enter a text: ");
        return scanner.nextLine();
    }


    public static void textIsOneWordsOrNot() {
        String text = getTextInput();
        if (text.contains(" ")) {
            System.out.println("Text is more than one words!");
        }
        else {
            System.out.println("The text is only one word!");
        }
    }

    public static void checkIndexOfACharInText() {
        int firstIndex = text.indexOf('t');
        int lastIndex = text.lastIndexOf('t');
        System.out.println("Index of the letter first 't': "+ firstIndex +
                " and index of the letter last 't': " + lastIndex);
    }


    public static String changeDateType() {
        String text = "2021.05.05";
        return text.replaceAll("\\.", "-");
    }


    public static void printDateNewFormat() {
        System.out.println("The new date format is: " + changeDateType());
    }


    public static int countDigits() {
       int digits = getNumInt();
        return String.valueOf(digits).length();
    }


    public static void printNumberOfDigits() {
        System.out.println("The number is " + countDigits() + " digit long!");
    }


    public static String findFirstTenCharOfText(String string) {
        return string.substring(0, 10);
    }

    public static void printFirstTenCharOfText(String string) {
        System.out.println("The first 10 char of the text: " + findFirstTenCharOfText(string));
    }


    public static String findFirstWordOfText(String string) {
        return string.split(" ")[0];
    }

    public static void printFirstWordOfText(String string) {
        System.out.println("The first word of the text is: " + findFirstWordOfText(string));
    }
}