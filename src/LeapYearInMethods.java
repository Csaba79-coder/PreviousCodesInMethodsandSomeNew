import java.util.Scanner;


public class LeapYearInMethods {


    // leap year: 1976, 1980, 1984, 1988, 1992, 1996, 2000, 2004, 2008, 2012, 2016, 2020 és 2024
    // not leap year: 1700, 1800, 1900, 2100, 2200 és 2300
    // BUT leap year:  1600, 2000 és 2400


    public static void main(String[] args) {


        checkLeapOrNot(getYearInput());
    }


    public static Scanner getScanner() { return new Scanner(System.in); }


    public static int getIntInput() {
        return getScanner().nextInt();
    }


    public static int getYearInput() {
        System.out.println("Please enter a year: ");
        return getIntInput();
    }


    public static void checkLeapOrNot(int number) {
        if ((number % 4 == 0) && number % 100 != 0)
        {
            System.out.println(number + " is a leap year.");
        }
        else if ((number % 4 == 0) && (number % 100 == 0) && (number % 400 == 0))
        {
            System.out.println(number + " is a leap year.");
        }
        else
        {
            System.out.println(number + " is not a leap year.");
        }
    }
}
