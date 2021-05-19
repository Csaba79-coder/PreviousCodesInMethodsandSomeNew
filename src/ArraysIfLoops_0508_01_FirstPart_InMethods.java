import java.util.Arrays;

public class ArraysIfLoops_0508_01_FirstPart_InMethods {

    public static byte[] bytes = {10, 33, -2, 0, 56, -42, 99, -73, 60};
    public static char[] chars = {'A', '*', 'c', 'd', 'E', ' '};
    public static int[] ints = {27, 969, -56, 1222, 8647000, -333, 7541, 89, 6502, -53042, 123, 876};
    public static double[] doubles = {3.14, -765.99, 52.4986, -10.3333337, 834.0965};
    public static String[] strings = {"alma", "málna", "barack", "szilva"};
    public static double[][] numsMatrixDouble = {castArrayToDouble(bytes), castArrayToDouble(ints), doubles};


    public static void main(String[] args) {


        checkDataTypeOfArray(getMaxLengthOfArray(new int[]{bytes.length, chars.length, ints.length, doubles.length,
                strings.length}));

//        sumOfArrays(bytes);
//        sumOfArray(chars);
//        sumOfArray(ints);
//        sumOfArray(doubles);
//        sumOfArray(strings);

        printResultInString(new String[]{Integer.toString(sumOfArrays(bytes)), sumOfArray(chars),
                Integer.toString(sumOfArray(ints)), Double.toString(sumOfArray(doubles)),
                sumOfArray(strings)}); // or using if I don't know the type: String.valueOf(sumOfArray(bytes))

        printFirstAndLastItemOfArray(new String[]{findFirstAndLastItemOfArray(bytes), findFirstAndLastItemOfArray(chars),
                findFirstAndLastItemOfArray(ints), findFirstAndLastItemOfArray(doubles), findFirstAndLastItemOfArray(strings)});

//        castArrayToDouble(bytes);
//        castArrayToDouble(ints);

        printPosAndNegNumsOfArray(new double[][]{castArrayToDouble(bytes), castArrayToDouble(ints), doubles});

        printIsNotLetter(chars);

        printAllMaxLengthString(strings);

        System.out.println(Arrays.deepToString(numsMatrixDouble));

        sumAndAverageOfNumsMatrix(numsMatrixDouble);

        maxLengthString(strings);

        sumCharsInStrings(strings);

        lettersOfStringsInArray(strings);

        twoDimensionMatrixOfStrings(strings);
    }


    public static int getMaxLengthOfArray(int[] array) {
        int res = 0;
        for (int j : array) {
            res = Math.max(j, res);
        }
        System.out.println("The longest arrays' length is: " + res);
        return res;
    }


    public static void checkDataTypeOfArray(int res) {
        if (bytes.length == res) {
            System.out.println("It is a byte data type!");
        } else if (chars.length == res) {
            System.out.println("It is a char data type!");
        } else if (ints.length == res) {
            System.out.println("It is an int data type!");
        } else if (doubles.length == res) {
            System.out.println("It is a double type!");
        } else if (strings.length == res) {
            System.out.println("It is a String data type!");
        } else {
            System.out.println("Index out of range!");
        }
    }


    public static int sumOfArrays(byte[] array) {
        int sumBytes = 0;
        for (byte i : array) {
            sumBytes += i;
        }
        // System.out.println("The sum of bytes: " + sumBytes);
        return sumBytes;
    }


    public static String sumOfArray(char[] array) {
        StringBuilder sumChars = new StringBuilder();
        for (char i : array) {
            sumChars.append(i);
        }
        // System.out.println("The sum of chars: " + sumChars);
        return sumChars.toString();
    }


    public static int sumOfArray(int[] array) {
        int sumInts = 0;
        for (int i : array) {
            sumInts += i;
        }
        // System.out.println("The sum of ints: " + sumInts);
        return sumInts;
    }


    public static double sumOfArray(double[] array) {
        int sumDoubles = 0;
        for (double i : array) {
            sumDoubles += i;
        }
        // System.out.println("The sum of doubles: " + sumDoubles);
        return sumDoubles;
    }


    public static String sumOfArray(String[] array) {
        StringBuilder sumStrings = new StringBuilder();
        for (String i : array) {
            sumStrings.append(i);
        }
        // System.out.println("The sum of strings: " + sumStrings);
        return sumStrings.toString();
    }


/*
    public static void OutputOfAllSumOfArray() {
        System.out.println("The sum of bytes: " + sumOfArrays(bytes));
        System.out.println("The sum of chars: " + sumOfArray(chars));
        System.out.println("The sum of ints: " + sumOfArray(ints));
        System.out.println("The sum of doubles: " + sumOfArray(doubles));
        System.out.println("The sum of strings: " + sumOfArray(strings));
        */


    public static void printResultInString(String[] array) {
        for (String s : array) {
            System.out.println(s);
        }
    }


    public static String findFirstAndLastItemOfArray(byte[] array) {
        return "The first item of the array (byte) is: " + array[0] + " and the last item of the array is: "
                + (array[array.length - 1]) + ".";
    }


    public static String findFirstAndLastItemOfArray(char[] array) {
        return "The first item of the array (char) is: " + array[0] + " and the last item of the array is: "
                + (array[array.length - 1]) + ".";
    }


    public static String findFirstAndLastItemOfArray(int[] array) {
        return "The first item of the array (int) is: " + array[0] + " and the last item of the array is: "
                + (array[array.length - 1]) + ".";
    }


    public static String findFirstAndLastItemOfArray(double[] array) {
        return "The first item of the array (double) is: " + array[0] + " and the last item of the array is: "
                + (array[array.length - 1]) + ".";
    }


    public static String findFirstAndLastItemOfArray(String[] array) {
        return "The first item of the array (string) is: " + array[0] + " and the last item of the array is: "
                + (array[array.length - 1]) + ".";
    }


    public static void printFirstAndLastItemOfArray(String[] array) {
        for (String s : array) {
            System.out.println(s);
        }
    }


    public static double[] castArrayToDouble(byte[] array) {
        double[] byteToDoubleArr = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            byteToDoubleArr[i] = array[i];
        }
        // System.out.println(Arrays.toString(byteToDoubleArr));
        return byteToDoubleArr;
    }


    public static double[] castArrayToDouble(int[] array) {
        double[] intToDoubleArr = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            intToDoubleArr[i] = array[i];
        }
        // System.out.println(Arrays.toString(intToDoubleArr));
        return intToDoubleArr;
    }

    public static void printPosAndNegNumsOfArray(double[][] matrix) {
        for (double[] value : matrix) {
            int pos = 0;
            int neg = 0;
            int zero = 0;
            for (double v : value) {
                if (v == 0) {
                    zero++;
                } else if (v > 0) {
                    pos++;
                } else {
                    neg++;
                }
            }
            System.out.println("This array contains: " + pos + " positive and " + neg + " negative and "
                    + zero + " zero numbers!");
        }
    }


//        // Sum the all pos and neg and zeros in all Array altogether
//        public static void printAllPosAndNegNumsUfAllArray (double [][] matrix){
//            int pos = 0;
//            int neg = 0;
//            int zero = 0;
//            for (int i = 0; i < matrix.length; i++) {
//                for (int j = 0; j < matrix[i].length; j++) {
//                    if (matrix[i][j] == 0) {
//                        zero++;
//                    } else if (matrix[i][j] > 0) {
//                        pos++;
//                    } else {
//                        neg++;
//                    }
//                }
//            }
//        }


    public static void printIsNotLetter(char[] array) {
        int counter = 0;
        for (char c : array) {
            if (!Character.isLetter(c)) {
                counter++;
            }
        }
        System.out.println("This array contains: " + counter + " characters which does not belongs to ABC.");
    }


    public static int maxLengthString(String[] array) {
        int maxLength = 0;
        for (String s : array) {
            maxLength = Math.max(maxLength, s.length());
        }
//        System.out.println(maxLength);
        return maxLength;

    }


    public static void printAllMaxLengthString(String[] array) {
        int longestWordLength = maxLengthString(array);
        for (String s : array) {
            if (longestWordLength == s.length()) {
                // break // if found the first element, exit!!! so no break, I want it all!
                System.out.println("The longest word is: " + s);
            }
        }
    }


    public static void sumAndAverageOfNumsMatrix(double[][] array) {
        double  sumMatrix = 0;
        double counterMatrix = 0;
        for (double[] arr : array) {
            for (double i : arr) {
                sumMatrix += i;
                counterMatrix ++;
            }
        }
        System.out.println("The sum of all elements of the matrix in double: " + sumMatrix);
        System.out.println("The average is: " + (sumMatrix / counterMatrix) + " (the value is in double)");
    }


    public static int sumCharsInStrings (String[] array) {
        int sum = 0; // sum chars
        for (String s : array) {
            sum += s.length();
        }
        System.out.println("The sum of chars in strings: " + sum);
        return sum;
    }


    public static void lettersOfStringsInArray (String[] array) {
        int k = 0;
        char[] charsFromStrOne = new char[sumCharsInStrings(array)];
        for (String s : array) {
            for (int j = 0; j < s.length(); j++) {
                charsFromStrOne[k++] = s.charAt(j);
            }
        }
        System.out.println(Arrays.toString(charsFromStrOne));
    }


    public static void twoDimensionMatrixOfStrings (String[] array) {

        char[][] charsFromStringsTwo = new char[array.length][];
        // charsFromStringsTwo[0] = new char[array.length];

        for (int i = 0; i < array.length; i++) { // enter the two dimension of array! - first dimension
            charsFromStringsTwo[i] = new char[array[i].length()]; // creating the empty array for the words!
            for (int j = 0; j < array[i].length(); j++) { // enter the 2nd dimension
                charsFromStringsTwo[i][j] = array[i].charAt(j);
            }
        }
        System.out.println(Arrays.deepToString(charsFromStringsTwo));
    }
}

//        Solutions:
//
//        The longest arrays' length is: 12
//        It is an int data type!
//        141
//        A*cdE
//        8610918
//        115.0
//        almamálnabarackszilva
//        The first item of the array (byte) is: 10 and the last item of the array is: 60.
//        The first item of the array (char) is: A and the last item of the array is:  .
//        The first item of the array (int) is: 27 and the last item of the array is: 876.
//        The first item of the array (double) is: 3.14 and the last item of the array is: 834.0965.
//        The first item of the array (string) is: alma and the last item of the array is: szilva.
//        This array contains: 5 positive and 3 negative and 1 zero numbers!
//        This array contains: 9 positive and 3 negative and 0 zero numbers!
//        This array contains: 3 positive and 2 negative and 0 zero numbers!
//        This array contains: 2 characters which does not belongs to ABC.
//        The longest word is: barack
//        The longest word is: szilva
//        [[10.0, 33.0, -2.0, 0.0, 56.0, -42.0, 99.0, -73.0, 60.0], [27.0, 969.0, -56.0, 1222.0, 8647000.0, -333.0, 7541.0, 89.0, 6502.0, -53042.0, 123.0, 876.0], [3.14, -765.99, 52.4986, -10.3333337, 834.0965]]
//        The sum of all elements of the matrix in double: 8611172.4117663
//        The average is: 331198.9389140885 (the value is in double)
//        The sum of chars in strings: 21
//        The sum of chars in strings: 21
//        [a, l, m, a, m, á, l, n, a, b, a, r, a, c, k, s, z, i, l, v, a]
//        [[a, l, m, a], [m, á, l, n, a], [b, a, r, a, c, k], [s, z, i, l, v, a]]
