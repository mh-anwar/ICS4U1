package Root;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;

import java.util.Scanner;

public class Library {

    public static Scanner input = new Scanner(System.in);

    // These print functions require a .toString() (*in other words they REQUIRE a
    // stringular input)
    public static void printBreak() {
        System.out.println(Library.TEXT_GREEN + "⟳ - ⠋ ⠙ ⠹ ⠸ ⠼ ⠴ ⠦ ⠧ ⠇ ⠏" + Library.TEXT_RESET);
    }

    public static void printNiceBreak() {
        System.out.println();
        System.out.println(Library.TEXT_GREEN + "⟳ - ⠋ ⠙ ⠹ ⠸ ⠼ ⠴ ⠦ ⠧ ⠇ ⠏" + Library.TEXT_RESET);
        System.out.println();
    }

    public static void print(String message) {
        System.out.println(Library.TEXT_BLUE + "\n" + "✠ " + message + Library.TEXT_RESET);
    }

    // If no argument is given
    public static void print() {
        System.out.println();
    }

    public static void printf(String message) {
        System.out.print(Library.TEXT_BLUE + "\n" + "✠ " + message + Library.TEXT_RESET + " ");
    }

    // If no argument is given
    public static void printf() {
        System.out.println();
    }

    public static void printBigBreak() {
        System.out.println();
        System.out.println();
    }

    public static void errorMsg(String message) {
        System.out.println(Library.TEXT_RED + "\n" + "ᣆ " + message + Library.TEXT_RESET);
    }

    public static void successMsg(String message) {
        System.out.println(Library.TEXT_GREEN + "\n" + "⧴  " + message + Library.TEXT_RESET);
    }

    public static void prompt() {
        System.out.print(Library.TEXT_GREEN + "⧴  " + Library.TEXT_RESET);
    }

    public static int promptInt() {
        System.out.print(Library.TEXT_GREEN + "⧴  " + Library.TEXT_RESET);
        int data = input.nextInt();
        input.nextLine();
        return data;
    }

    public static String promptLine() {
        System.out.print(Library.TEXT_GREEN + "⧴  " + Library.TEXT_RESET);
        return input.nextLine();
    }

    public static void warningMsg(String message) {
        System.out.println(Library.TEXT_YELLOW + "\nᖚ  " + message + Library.TEXT_RESET);
    }

    public static String formatBlue(String message) {
        return Library.TEXT_BLUE + message + Library.TEXT_RESET + " ";
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

    public static String[] getObjectInfoFromCsv(String filePath) {
        long numberOfLines = 0;
        String currentPath = System.getProperty("user.dir");
        // Get number of lines in file
        try {
            BufferedReader reader = new BufferedReader(new FileReader(currentPath + "/DataFiles/" + filePath));
            numberOfLines = reader.lines().count();
            reader.close();
        } catch (IOException error) {
            // shhh
            error.printStackTrace();
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader(currentPath + "/DataFiles/" + filePath));
            int randomLine = random(1, (int) numberOfLines);
            String line;
            int lineNumber = 0;

            while ((line = reader.readLine()) != null) {
                lineNumber++;
                if (lineNumber == randomLine) {
                    return line.split(",");
                }
            }
            reader.close();
        } catch (IOException error) {
            // shhh
            error.printStackTrace();
        }
        return null;
    }
}// class