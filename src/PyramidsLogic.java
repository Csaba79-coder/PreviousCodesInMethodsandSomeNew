public class PyramidsLogic {

    public static int n = 5;


    public static void main(String[] args) {


        firstPyramid();

        getSquare();

        System.out.println("\n\n\n\n\n\n\n");

        firstPyramid();

        secondPyramid();

        firstWithSpacesPyramid();

        getSquare();

        getSquareWithSpaces();

        differentPyramid();

        extraSizePyramid();

        strangePyramid();

        secondNotBadPyramid();

        thirdPyramidWithSpaces();

        anotherPyramid();

        anotherPyramid2();
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


    public static void getSquareWithSpaces() {
        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= n; ++j) {
                System.out.print(" *");
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


    public static void strangePyramid() {
        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; ++k) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void secondNotBadPyramid() {
        int i, j;
        // outer loop to handle number of rows
        //  n in this case
        for (i = 0; i < n; i++) {
            // inner loop to handle number spaces
            // values changing acc. to requirement
            for (j = 2 * (n - i); j >= 0; j--) {
                // printing spaces
                System.out.print(" ");
            }

            //  inner loop to handle number of columns
            //  values changing acc. to outer loop
            for (j = 0; j <= i; j++) {
                // printing stars
                System.out.print(" *");
            }

            // ending line after each row
            System.out.println();
        }
    }


    public static void secondPyramid() {
        int i, j;
        for(i=0; i<n; i++) {
            for(j=(n-i); j>=0; j--)
            {
                System.out.print(" ");
            }
            for(j=0; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void thirdPyramidWithSpaces() {
        // outer loop to handle number of rows
        //  n in this case
        for (int i=0; i<n; i++)
        {

            // inner loop to handle number spaces
            // values changing acc. to requirement
            for (int j=n-i; j>1; j--)
            {
                // printing spaces
                System.out.print(" ");
            }

            //  inner loop to handle number of columns
            //  values changing acc. to outer loop
            for (int j=0; j<=i; j++ )
            {
                // printing stars
                System.out.print("* ");
            }

            // ending line after each row
            System.out.println();
        }
    }


    public static void anotherPyramid() {
        for (int i=0; i<n; i++) {
            for (int j=n-i; j>1; j--) {
                System.out.print("");
            }
            for (int j=0; j<=i; j++ ) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void anotherPyramid2() {
        for (int i=0; i<n; i++) {
            for (int j=0; j<=i; j++ ) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

