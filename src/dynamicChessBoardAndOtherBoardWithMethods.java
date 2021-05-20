import java.util.Scanner;


public class dynamicChessBoardAndOtherBoardWithMethods {


    public static int width;
    public static int length;


    public static void main(String[] args) {


        isValidChessboard();
    }


    public static Scanner getScanner() {
        return new Scanner(System.in);
    }


    public static int getInputInt() {
        System.out.println("Please enter a number: ");
        return getScanner().nextInt();
    }


    public static int getWidth() {
        System.out.println("Please determine of the width (in case of Chessboard widths is: 8)");
        return width = getInputInt();
    }


    public static int getLength() {
        System.out.println("Please determine of the length (in case of Chessboard length is: 8) ");
        return length = getInputInt();
    }


    public static void isValidChessboard() {
        boolean isValid = false;
        do {
            width = getWidth();
            length = getLength();
            if (width == 8 && length == 8) {
                isValid = true;
                System.out.println("\nIt is a chessboard, let's play together!\n");
            } else {
                System.out.println("Please enter a valid input for chessboard, that is 8 long and 8 wide!");
            }
        }
        while (!isValid);
    }
}

// another type just for practice!!! but not in loop!!!

//    public static void getSystemWelcomeMessage(String result) {
//        switch (result) {
//            case "true":
//                System.out.println("\nIt is a chessboard, let's play together!\n");
//                break;
//            case "false":
//                System.out.println("Please enter a valid input for chessboard, that is 8 long and 8 wide!");
//        }
//    }


