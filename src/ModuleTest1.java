public class ModuleTest1 {


    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 8,};
        System.out.println("The last num: " + getLastNumber(numbers));
        System.out.println("Even nums: " + countEvenNumbers(numbers));
        System.out.println("Index of num: " + findNumber(numbers, 2));
        System.out.println("If not included result is: " + findNumber(numbers, 10));

        int[] firstNumbers = {0, 1, 2, 3, 4};
        int[] secondNumbers = {5, 6, 5, 4, 4, 4, 3};
        System.out.println("Same number: " + countSameNumbers(firstNumbers, secondNumbers));

        System.out.println("MaxIndex: " + findMaxIndex(numbers));

        int[][] matrix = {{100, 1, 2, 3, 4}, {5, 6, 5, 4, 4, 4, 3}};
        System.out.println("TopLeft: " + getTopLeftNumber(matrix));

        int[][] matrixDiagonal = {{100, 200, 300}, {400, 500, 600}, {700, 800, 900}};
        System.out.println("MatrixDiagonal difference: " + getDiagonalDifference(matrixDiagonal));
        int[][] matrixDiagonal2 = {{10, 300, 600}, {400, 400, 600}, {700, 800, 1000}};
        System.out.println("MatrixDiagonal difference: " + getDiagonalDifference(matrixDiagonal2));

        int[] array1 = {30, 10, 30, 10, 30, 30, 20, 10, 30, 10, 30};
        int[] array2 = {56, 1, 33, 42, 0, 86, 42, 86, 1, 56, 0};

        System.out.println("Find the sox: " + findTheOneSock(array1));
        System.out.println("Find the sox: " + findTheOneSock(array2));

        System.out.println("Meet or not: " + willWizardsBeTogether(0,3, 4, 2));
        System.out.println("Meet or not: " + willWizardsBeTogether(2,2, 5, 3));
    }


    public static int getLastNumber(int[] numbers) {
        return numbers[numbers.length - 1];
    }


    public static int countEvenNumbers(int[] numbers) {
        int counter = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }


    public static int findNumber(int[] numbers, int number) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == number) {
                return i;
            }
        }
        return -1;
    }


    public static int countSameNumbers(int[] firstNumbers, int[] secondNumbers) {
        int counter = 0;
        for (int i = 0; i < firstNumbers.length; i++) {
            for (int j = i + 1; j < secondNumbers.length; j++) {
                if (firstNumbers[i] == secondNumbers[j]) {
                    counter++;
                }
            }
        }
        return counter;
    }


    public static int findMaxIndex(int[] numbers) {
        int maxIndex = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > numbers[maxIndex]) {
                maxIndex = i;
                i++;
            }
        }
        return maxIndex;
    }


    // the right code is:
//        int max = numbers[0];
//        int index = 0;
//            for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] > max) {
//                index = i;
//                max = numbers[i];
//            }
//        }
//            return index;
//    }


    public static int getTopLeftNumber(int[][] matrix) { return matrix[0][0]; }


    public static int getDiagonalDifference(int[][] matrix) {
        // first diagonal is situated on the same indexes (I mean both indexes are the same!) e.g.: [0][0]; [1][1], [2][2]
        // second diagonal is situated indexOfRow = (array.length - 1) - indexOfColumn
        int diagonal1 = 0;
        int diagonal2 = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == j) {
                    diagonal1 += matrix[i][j];
                }
            }
            // System.out.println(diagonal1);
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == matrix.length - 1 - j) {
                    diagonal2 += matrix[i][j];
                }
            }
            // System.out.println(diagonal2);
        }
        return Math.abs(diagonal1 - diagonal2);
    }


    public static int findTheOneSock(int[] socks) {
        int count;
        for (int i = 0; i < socks.length; i++) {
            count = 0;
            for (int j = 0; j < socks.length; j++) {
                if (socks[i] == socks[j] && i != j)
                    count++;
            }
            if (count == 0) {
                return socks[i];
            }
        }
        return -1;
    }


    public static boolean willWizardsBeTogether(int s1, int d1, int s2, int d2) {
        // somehow compare them, with division or modulo ... could not find the false
        // could not figure out
        return ((s1 > s2 && (s1 - s2) % (d2 - d1) == 0) || (s2 > s1 && (s2 - s1) % (d1 - d2) == 0));
    }
}