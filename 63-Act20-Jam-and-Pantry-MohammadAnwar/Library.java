import java.util.Scanner;

class Library {

    public static Scanner input = new Scanner(System.in);

    public static void printBreak() {
        System.out.println(Library.TEXT_GREEN + "⟳ - ⠋ ⠙ ⠹ ⠸ ⠼ ⠴ ⠦ ⠧ ⠇ ⠏" + Library.TEXT_RESET);
    }

    public static void print(String message) {
        System.out.println(Library.TEXT_BLUE + "✠ " + message + Library.TEXT_RESET);
    }

    public static void print() {
        System.out.println();
    }

    public static void printBigBreak() {
        System.out.println();
        System.out.println();
    }

    public static void errorMsg(String message) {
        System.out.println(Library.TEXT_RED + "ᣆ " + message + Library.TEXT_RESET);

    }

    // go does not refer to golang
    public static void goMsg(String message) {
        System.out.println(Library.TEXT_GREEN + "⧴  " + message + Library.TEXT_RESET);

    }

    public static void sucMsg(String message) {
        System.out.println(Library.TEXT_YELLOW + "ᖚ  " + message + Library.TEXT_RESET);

    }

    // ***** Text Colors for the Console *****************//
    public static final String TEXT_RESET = "\u001B[0m";
    public static final String TEXT_BLACK = "\u001B[30m";
    public static final String TEXT_RED = "\u001B[31m";
    public static final String TEXT_GREEN = "\u001B[32m";
    public static final String TEXT_YELLOW = "\u001B[43m\u001B[1;33m";
    public static final String TEXT_BLUE = "\u001B[34m";
    public static final String TEXT_PURPLE = "\u001B[95m";
    public static final String TEXT_CYAN = "\u001B[36m";

    public static int random(int min, int max) {
        // up to 1 less than max
        int temp;
        temp = (int) (Math.random() * (max - min) + min);

        return temp;
    }// myRandom

    public static int stringSearch(String[] arr, String searchTerm) {
        for (int i = 0; i < arr.length; i++) {
            if (searchTerm.equalsIgnoreCase(arr[i])) {
                return i;
            }
        }
        return -1;
    }// stringSearch

}// class