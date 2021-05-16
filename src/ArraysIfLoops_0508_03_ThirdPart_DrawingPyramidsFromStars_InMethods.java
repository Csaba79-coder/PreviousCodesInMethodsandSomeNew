public class ArraysIfLoops_0508_03_ThirdPart_DrawingPyramidsFromStars_InMethods {


    public static int n = 5;


    public static void main(String[] args) {


        firstPyramid();

        secondPyramid();


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
        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= n; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
