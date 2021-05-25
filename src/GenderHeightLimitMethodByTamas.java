import java.util.Scanner;


public class GenderHeightLimitMethodByTamas {

    public static String womanGender = "woman";
    public static String manGender = "man";
    public static int limit = 5;


    public static int avWomanHeight = 164;
    public static int avManHeight = 176;


    public static Scanner scanner;

    public static String gender;


    public static void main(String[] args) {

        scanner = getScanner();

        getGenderInput();

        // bonus: input error handling (0 < 250)
        int height = getUserHeight();

        // bonus: return the difference between av and current height
        String result = getGenderHeightRelation(height);
        System.out.println(result);

    }


    public static String getGenderHeightRelation(int height) {
        if (gender.equals(womanGender)) {
            return getHeightRelation(height, avWomanHeight);
        } else if (gender.equals(manGender)) {
            return getHeightRelation(height, avManHeight);
        }
        return "Wrong gender input!";
    }


    public static String getHeightRelation(int height, int av) {
        if (height < av) {
            return "You are smaller than the average";
        } else if (height == av) {
            return "You are exactly the average";
        } else if (height > av) {
            return "You are taller than the average";
        } else {
            return "Unknown error";
        }
    }


    public static void getGenderInput() {
        System.out.println("Please add your gender (" + womanGender + "/" + manGender +")");
        do {
            gender = scanner.next();
        } while (!isValidGenderInput() && --limit > 0);
        System.out.println("You are a " + gender);
    }


    public static boolean isValidGenderInput() {
        if (gender.equals(womanGender) || gender.equals(manGender)) {
            return true;
        } else {
            System.out.println("Invalid input, please try again!");
            return false;
        }
    }

    
    public static int getUserHeight() {
        System.out.println("Please add your height in centimeter");
        int height = scanner.nextInt();
        System.out.println("You are " + height + " cm");
        return height;
    }


    public static Scanner getScanner() {
        return new Scanner(System.in);
    }
}
