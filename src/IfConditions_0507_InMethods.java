import java.util.Locale;
import java.util.Scanner;


public class IfConditions_0507_InMethods {


    public static String manGender = "FFI";
    public static String womanGender = "NO";


    public static int triesGender = 3;
    public static int limitGender = 3;

    public static int triesHeight = 3;
    public static int limitHeight = 3;

    public static boolean isValidInput = false;

    public static int averageWomanHeight = 164;
    public static int averageManHeight = 176;


    public static void main(String[] args) {


        System.out.println("-------------1-----------\n");

        System.out.println(numIsOddOrEven(getIntInput()) ? "The number is odd!" : "The number is even");

        System.out.println("\n-------------2-----------\n");

        greetingUserByAge();

        System.out.println("\n-------------3-----------\n");

        colorChecker();

        System.out.println("\n-------------4-----------\n");

        genderHeightChecker();

        System.out.println("\n-------------5-----------\n");

        pythagorasChecker(getDoubleInput(), getDoubleInput(), getDoubleInput());
    }


    public static Scanner getScanner() {
        return new Scanner(System.in);
    }


    public static int getIntInput() {
        System.out.println("Please enter a number: ");
        return getScanner().nextInt();
    }


    public static double getDoubleInput() {
        System.out.println("Please enter a number");
        return getScanner().nextDouble();
    }


    public static String getStringInput() {
        System.out.println("Please enter the text:");
        return getScanner().nextLine();
    }


    public static boolean numIsOddOrEven(int num) {
        return (num % 2 == 0);
    }


    public static void greetingUserByAge() {
        System.out.println("Please give your age!");
        int age = getIntInput();
        if (age >= 0 && age <= 3) {
            System.out.println("bru-bru-bruu babuci");
        } else if (age > 3 && age < 13) {
            System.out.println("szióka");
        } else if (age >= 13 && age < 20) {
            System.out.println("csá");
        } else if (age >= 20) {
            System.out.println("Jó napot kívánok.");
        } else {
            System.out.println("Hello, Marty McFly");
        }
    }


    public static void colorChecker() {
        System.out.println("Please enter your favourite color");
        String color = getStringInput().toUpperCase(Locale.ROOT);
        switch (color) {
            case "RED" -> System.out.println("A piros tilos!");
            case "GREEN" -> System.out.println("Szabad!");
            default -> System.out.println("N/A");
        }
    }


    public static String getGenderInput() {
        do {
            System.out.println("Please enter your gender (man = ffi / woman = no) :");
            String genderInput = getStringInput().toUpperCase(Locale.ROOT);
            if (genderInput.equals(womanGender) || genderInput.equals(manGender)) {
                isValidInput = true;
            } else {
                System.out.println("Invalid input, please try again, maximum tries " + --limitGender + "!");
            }
        }
        while (!isValidInput && (--triesGender > 0));
        return null;
    }


    public static int getHeightInput() {
        do {
            System.out.println("Please enter your height (required data in cm) :");
            int height = getIntInput();
            if (50 < height && height < 250) {
                isValidInput = false;
            } else System.out.println("Invalid input, please try again, maximum tries " + --limitHeight + "!");
        }
        while (isValidInput && (--triesHeight > 0));
        return 0;
    }


    public static void genderHeightChecker() {
        String string = getGenderInput();
        int num = getHeightInput();
        if (string.equals("FFI") && num > averageManHeight) {
            System.out.println("Az Ön magassága az átlagnál magasabb!");
        } else if (string.equals("FFI") && num < averageManHeight) {
            System.out.println("Az Ön magassága az átlagnál alacsonyabb!");
        } else if (string.equals("FFI") && num == averageManHeight) {
            System.out.println("Az Ön magassága éppen átlagos!");
        } else if (string.equals("NO") && num > averageWomanHeight) {
            System.out.println("Az Ön magassága az átlagnál magasabb!");
        } else if (string.equals("NO") && num < averageWomanHeight) {
            System.out.println("Az Ön magassága az átlagnál alacsonyabb!");
        } else if (string.equals("NO") && num == averageWomanHeight) {
            System.out.println("Az Ön magassága éppen átlagos!");
        } else {
            System.out.println("Invalid input!");
        }
    }


    public static void pythagorasChecker(double num1, double num2, double num3) {
        if (Math.pow(num1, 2) + Math.pow(num2, 2) == Math.pow(num3, 2)) {
            System.out.println("It is possible to creat a right-angled triangle");
        } else if (Math.pow(num1, 2) + Math.pow(num3, 2) == Math.pow(num2, 2)){
            System.out.println("It is possible to creat a right-angled triangle");
        } else if (Math.pow(num2, 2) + Math.pow(num3, 2) == Math.pow(num1, 2)) {
            System.out.println("It is possible to creat a right-angled triangle");
        } else {
            System.out.println("It is NOT possible to creat a right-angled triangle");
        }
    }
}