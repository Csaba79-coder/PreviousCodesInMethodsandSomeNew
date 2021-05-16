public class Pyramid {

    public static int n = 5;


    public static void main(String[] args) {


        firstPyramid();

        firstWithSpacesPyramid();

        getSquare();

        differentPyramid();

        extraSizePyramid();

    }


    public static void firstPyramid() {
        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void firstWithSpacesPyramid() {
        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void getSquare() {
        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= n; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void differentPyramid() {
        int k = 0;
        for (int i = 1; i <= n; ++i, k = 0) {
            for (int space = 1; space <= n - i; ++space) {
                System.out.print("");
            }
            while (k != 2 * i - 1) {
                System.out.print("*");
                ++k;
            }
            System.out.println();
        }
    }


    public static void extraSizePyramid() {
        int k = 0;
        for (int i = 1; i <= n; ++i, k = 0) {
            for (int space = 1; space <= n - i; ++space) {
                System.out.print("  ");
            }
            while (k != 2 * i - 1) {
                System.out.print("* ");
                ++k;
            }
            System.out.println();
        }
    }
}

