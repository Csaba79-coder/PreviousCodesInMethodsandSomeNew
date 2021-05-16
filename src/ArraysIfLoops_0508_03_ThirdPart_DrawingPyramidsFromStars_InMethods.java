public class ArraysIfLoops_0508_03_ThirdPart_DrawingPyramidsFromStars_InMethods {


    public static int n = 5;


    public static void main(String[] args) {


        firstPyramid();

        System.out.println("------------------------");

        secondPyramid();

        System.out.println("------------------------");

        thirdPyramid();

    }


    public static void firstPyramid() {
        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void secondPyramid() {
        int i, j;
        for (i = 0; i < n; i++) {
            for (j = (n - i); j >= 0; j--) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void thirdPyramid() {
        for (int i=0; i<n; i++) {
            for (int j=n-i; j>1; j--) {
                System.out.print(" ");
            }
            for (int j=0; j<=i; j++ ) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}