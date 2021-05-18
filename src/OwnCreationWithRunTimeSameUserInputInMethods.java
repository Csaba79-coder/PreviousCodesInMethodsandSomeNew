import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class OwnCreationWithRunTimeSameUserInputInMethods {


    // Exercise0505 refactor THOUGHT again! my own creation!
    // class variables! - global!
    // one input runs over the program
    // counts runtime (nano, milli and second - with converting!) - start and end - also writes the date of pc!
    // first asks all user input (data's!) than running the whole program! (I can switch them in MAIN if I want to!!!)
    // runtime is not including getting user input!!!


    // public static Scanner scanner; // not used because of refactor inside the scanner method!


    public static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    public static LocalDateTime now = LocalDateTime.now();
    public static Timestamp timestampNow = Timestamp.valueOf(LocalDateTime.now());


    public static int numInt1 = getInputInt();
    public static int numInt2 = getInputInt();


    public static double doubleNum1 = getInputDouble();
    public static double doubleNum2 = getInputDouble();
    public static double doubleNum3 = getInputDouble();


    public static String userName = getUserName();


    public static char char1 = getInputChar();
    public static char char2 = getInputChar();


    public static String textInput = getUserTextInput();


    public static String word1 = getWordUserInput();
    public static String word2 = getWordUserInput();


    public static long startTime, endTime;


    public static String text = "There is nothing either good or bad, but thinking makes it so";

    public static String otherText = "In a hole in the ground there lived a hobbit";


    public static void main(String[] args) throws InterruptedException {


        startTime = System.nanoTime();

        TimeUnit.SECONDS.sleep(2);

        System.out.println("\nThe text is from William Shakespeare, Hamlet, Act II: " + text + "\n");

        System.out.println("------------------------");

        System.out.println("The local date is: " + dtf.format(now));

        System.out.println("------------------------");

        System.out.println("Timestamp of starting running the program itself: " + timestampNow);

        System.out.println("-----------2------------");

        remainderDivisionWithoutModule(numInt1, numInt2);

        System.out.println("-----------3------------");

        getAverageOfNumsDouble(doubleNum1, doubleNum2, doubleNum3);

        System.out.println("-----------4------------");

        greetingUser(userName);

        System.out.println("-----------5------------");

        basicArithmeticOfTwoNums(doubleNum1, doubleNum2);

        System.out.println("-----------6------------");

        printCharConcatenateFromInput(char1, char2);

        System.out.println("-----------7------------");

        trueOrFalse(doubleNum1);

        System.out.println("-----------8------------");

        findMaxNum(doubleNum1, doubleNum2);

        System.out.println("-----------9------------");

        calculateSquare(doubleNum1);

        System.out.println("----------10------------");

        calculateRaiseToPower(doubleNum1, doubleNum2);

        System.out.println("----------11------------");

        calculateSquareRoot(doubleNum1);

        System.out.println("----------12------------");

        printRandomNum();

        System.out.println("----------13------------");

        printRandomNumIntervalByUser(numInt1, (numInt1 * 2));

        System.out.println("----------14------------");

        countHowManyCharsInText(textInput);

        System.out.println("----------15------------");

        convertIntToString(numInt1);
        convertDoubleToString(doubleNum1);

        System.out.println("----------16------------");

        greetingUserAgain(userName);

        System.out.println("----------17------------");

        wordsAreEqualOrNot(word1, word2);

        System.out.println("----------18------------");

        textIsOneWordsOrNot(textInput);

        System.out.println("----------19------------");

        getFirstAndLastCharOfText(text);

        System.out.println("----------20------------");

        checkIndexOfACharInText(text);

        System.out.println("----------21------------");

        printDateNewFormat();

        System.out.println("----------22------------");

        printNumberOfDigits(numInt1);

        System.out.println("----------23------------");

        printFirstTenCharOfText(otherText);

        System.out.println("----------24------------");

        printFirstWordOfText(otherText);


        Timestamp instant = Timestamp.from(Instant.now());
        System.out.println("Timestamp (instant) of the date: " + instant);

        endTime = System.nanoTime();

        System.out.println("The system runs totally: " + getProgramRunningTimeInNano() + " nanoseconds");
        System.out.println("The execution time in seconds: " + getExecutionTimeSec());
    }


    public static Scanner getScanner() {
        return new Scanner(System.in);
    }


    public static int getInputInt() {
        // scanner = getScanner();
        System.out.println("Please enter a (whole) number: ");
        // return scanner.nextInt();
        return getScanner().nextInt();
    }


    public static double getInputDouble() {
        System.out.println("Please enter any number: ");
        return getScanner().nextDouble();
    }


    public static String getUserName() {
        System.out.println("Please enter your username: ");
        return getScanner().nextLine();
    }


    public static char getInputChar() {
        System.out.println("Please enter a character: ");
        return getScanner().next().charAt(0);
    }


    public static String getUserTextInput() {
        System.out.println("Please enter a text for counting the characters: ");
        return getScanner().nextLine();
    }


    public static String getWordUserInput() {
        System.out.println("Please enter any word: ");
        return getScanner().nextLine();
    }


    public static long getProgramRunningTimeInNano() {
        return (endTime - startTime);
    }


    public static double getExecutionTimeSec() {
        return (double) getProgramRunningTimeInNano() / 1_000_000_000.0;
    }


    public static void remainderDivisionWithoutModule(int num1, int num2) {
        int modulo = num1 - num2 * (num1 / num2);
        System.out.println("The result (using without modulo) is: " + modulo);
    }


    public static void getAverageOfNumsDouble(double num1, double num2, double num3) {
        double average = ((num1 + num2 + num3) / 3);
        System.out.println("The average of the 3 nums are: " + average);
    }

    public static void greetingUser(String string) {
        System.out.println("Hello dear user who's name is: " + string);
    }


    public static void basicArithmeticOfTwoNums(double num1, double num2) {
        System.out.println("The sum of the nums: " + (num1 + num2));
        System.out.println("The difference of the nums: " + (num1 - num2));
        System.out.println("The multiple of the nums: " + (num1 * num2));
        System.out.println("The division of the nums: " + (num1 / num2));
    }

    public static void printCharConcatenateFromInput(char char1, char char2) {
        System.out.println("The char concatenate is the following: " + char1 + char2);
    }


    public static void trueOrFalse(double num) {
        if (num > 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }


    public static void findMaxNum(double num1, double num2) {
        if (num1 > num2) {
            System.out.println("The bigger num is: " + num1);
        } else {
            System.out.println("The bigger num is: " + num2);
        }
    }


    public static void calculateSquare(double num) {
        System.out.println("The square of the " + num + " is: " + (Math.pow(num, 2)));
    }


    public static void calculateRaiseToPower(double num1, double num2) {
        System.out.println(num1 + " raising to the power of " + num2 + " is equal to: " + (Math.pow(num1, num2)));
    }


    public static void calculateSquareRoot(double num) {
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


    public static void printRandomNumIntervalByUser(int min, int max) {
        System.out.println("The random num given by the interval of user is: " + randomGenerator(min, (max + 1)));
    }


    public static String getStringFromDoubleFirst(double num) {
        return String.valueOf(num);
    }

    public static String getGetStringFromIntSecond(int num) {
        return Integer.toString(num);
    }


    public static void convertDoubleToString(double num) {
        System.out.println("This is a double: " + getStringFromDoubleFirst(num) + ", that written as string!");

    }

    public static void convertIntToString(int num) {
        System.out.println("This is a int: " + getGetStringFromIntSecond(num) + ", that written as string!");
    }

    public static void countHowManyCharsInText(String text) {
        int counter = 0;
        for (int i = 0; i < text.length(); i++) {
            counter++;
        }
        System.out.println("The string is: " + counter + " character long!");
    }


    public static void greetingUserAgain(String string) {
        System.out.println("Greeting, dear " + string + "! It is nice to see you again!");
    }


    public static void wordsAreEqualOrNot(String string1, String string2) {
        if (string1.equals(string2)) {
            System.out.println("The words are same!");
        }
        else {
            System.out.println("The word are not the same!");
        }
    }


    public static void textIsOneWordsOrNot(String string) {
        if (string.contains(" ")) {
            System.out.println("Text is more than one words!");
        }
        else {
            System.out.println("The text is only one word!");
        }
    }


    public static void getFirstAndLastCharOfText(String string) {
        System.out.println("The first char of the text is: " + string.charAt(0) +
                " and the last one is: " + string.charAt(string.length() - 1));
    }


    public static void checkIndexOfACharInText(String string) {
        int firstIndex = string.indexOf('t');
        int lastIndex = string.lastIndexOf('t');
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


    public static void printNumberOfDigits(int num) {
        System.out.println("The number is " + String.valueOf(num).length() + " digit long!");
    }

    public static void printFirstTenCharOfText(String string) {
        System.out.println("The first 10 char of the text: " + string.substring(0, 10));
    }


    public static void printFirstWordOfText(String string) {
        System.out.println("The first word of the text is: " + string.split(" ")[0]);
    }
}