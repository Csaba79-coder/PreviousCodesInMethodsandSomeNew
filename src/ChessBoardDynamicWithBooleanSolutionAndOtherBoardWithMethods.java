import java.util.Scanner;


public class ChessBoardDynamicWithBooleanSolutionAndOtherBoardWithMethods {


    public static int width;
    public static int length;
    public static String userName = getUserName();
    public static boolean[][] chessBoard;


    public static void main(String[] args) {


        isValidChessboard();
        printBoard(getBoard(width, length));
    }


    public static Scanner getScanner() {
        return new Scanner(System.in);
    }


    public static String getUserName() {
        System.out.println("Please enter your surname: ");
        userName = getScanner().next();
        return userName.substring(0, 1).toUpperCase() + userName.substring(1);
    }


    public static int getInputInt() {
        System.out.println("Please enter a number: ");
        return getScanner().nextInt();
    }


    public static int getWidth() {
        System.out.println("Please determine of the width (in case of Chessboard the width is: 8)");
        return width = getInputInt();
    }


    public static int getLength() {
        System.out.println("Please determine of the length (in case of Chessboard the length is: 8) ");
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
                System.out.println("Good luck " + userName.substring(0, 1).toUpperCase() + userName.substring(1) + "!\n");
            } else {
                System.out.println("\nPlease enter a valid input for chessboard's size, the size: 8 long and 8 wide!\n");
            }
        }
        while (!isValid);
    }


    public static boolean[][] getBoard(int length, int width) {
        chessBoard = new boolean[length][width];
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[i].length; j++) {
                chessBoard[i][j] = (i + j) % 2 == 0;
            }
        }
        return chessBoard;
    }


    public static void printBoard(boolean[][] array) {


        for (int i = array.length-1; i >= 0; i--) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j]) {
                    System.out.print("B ");
                } else {
                    System.out.print("W ");
                }
            }
            System.out.println("\b");
        }
        System.out.print(" ");
        for (char i = 'A'; i < 'A' + array[0].length ; i++) {
            System.out.print(" " + i);
        }
        System.out.println();
    }

}



// another type just for practice switch!!! but it was not in loop!!! - just for me :)

//    public static void getSystemWelcomeMessage(String result) {
//        switch (result) {
//            case "true":
//                System.out.println("\nIt is a chessboard, let's play together!\n");
//                break;
//            case "false":
//                System.out.println("Please enter a valid input for chessboard, that is 8 long and 8 wide!");
//        }
//    }


