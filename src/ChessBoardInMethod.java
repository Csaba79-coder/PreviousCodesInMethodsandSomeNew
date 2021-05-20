import java.util.Scanner;


public class ChessBoardInMethod {

    public static int width;
    public static int length;
    public static String userName = getUserName();
    public static int[][] chessBoard;

    public static void main(String[] args) {


        isValidChessboard();
        printBoard(getChessBoard(width, length));

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
                System.out.println("Good luck " + userName.substring(0, 1).toUpperCase() + userName.substring(1) + "!");
            } else {
                System.out.println("\nPlease enter a valid input for chessboard's size, the size: 8 long and 8 wide!\n");
            }
        }
        while (!isValid);
    }


    public static int[][] getChessBoard(int width, int length) {
        chessBoard = new int[width][length];
        return chessBoard;
    }

    public static void printBoard(int[][] array) {

        System.out.print("\n ");
        for (char i = 'A'; i < 'A' + array[0].length ; i++) {
            System.out.print(" " + i);
        }
        System.out.println();

        for (int i = array.length-1; i >= 0; i--) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < array[i].length; j++) {
                if (i % 2 == 0 && j % 2 == 0 || i % 2 != 0 && j % 2 != 0) {
                    System.out.print("B ");
                } else {
                    System.out.print("W ");
                }
            }
            System.out.println("\b");
        }
        System.out.println();
    }


    /*public static void printBoard2(int[][] array) {

        System.out.print("\n ");
        for (char i = 'A'; i < 'A' + array[0].length ; i++) {
            System.out.print(" " + i);
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 2 == 0 && array[i][j] % 2 != 0 && i % 2 == 0 || j % 2 == 0) {
                    System.out.print("B ");
                } else if (array[i][j] % 2 != 0 && array[i][j] % 2 != 0 && i % 2 != 0 || j % 2 != 0) {
                    System.out.print("W ");
                }
            }
            System.out.println("\b");
        }
        System.out.println();
    }*/
}
