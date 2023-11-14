
public class VigenereCipher {
    public static void run() {
        char[] alphabet = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K',
                'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
        char[][] array = createTable(alphabet);

        printTable(array, alphabet);
        boolean userExit = false;
        while (!userExit) {
            // Print out options for user
            System.out.println();
            System.out.println("Welcome to the Black Chamber:");
            System.out.println("1. Find any letter");
            System.out.println("2. Encrypt");
            System.out.println("3. Decrypt");
            System.out.println("4. Exit");

            // Get user input for their option
            System.out.print("Pick an option: ");
            int userChoice = Library.input.nextInt();
            Library.input.nextLine();
            System.out.println();

            // Execute functions based on user choice
            if (userChoice == 1) {
                searchAnyNum(array);
            } else if (userChoice == 2) {
                // Get encryption key and message
                System.out.print(Library.TEXT_GREEN + "🤫 What is the secret key to use for encryption: "); // SCONA
                String key = Library.input.nextLine();
                System.out.println(Library.TEXT_RESET);

                System.out.print(Library.TEXT_GREEN + "🤫 What is the secret message to be encrypted: "); // WEATTACKATDAWN
                String message = Library.input.nextLine();
                
                System.out.println(Library.TEXT_RESET);

                String keystream = generateKeystream(message, key);
                encrypt(array, message, keystream, alphabet);

            } else if (userChoice == 3) {
                // Get decryption key and message
                System.out.print(Library.TEXT_RED + "🤫 What is the secret key to use for decryption: "); // SCONA
                String key = Library.input.nextLine();
                System.out.println(Library.TEXT_RESET);

                System.out.print(Library.TEXT_RED + "🤫 What is the message to be decrypted: "); // OGOGTSEYNTVCKA
                String message = Library.input.nextLine();
                System.out.println(Library.TEXT_RESET);

                String keystream = generateKeystream(message, key);

                decrypt(array, message, keystream, alphabet);
            } else if (userChoice == 4) {
                return;
            }
        }

    }

    private static char[][] createTable(char[] alphabet) {
        char[][] table = new char[alphabet.length][alphabet.length];
        int a;
        for (int row = 0; row < alphabet.length; row++) {
            for (int col = 0; col < alphabet.length; col++) {
                a = row + col;
                if (a >= alphabet.length) {
                    a = a - alphabet.length;
                }
                table[row][col] = alphabet[a];
            }
        }
        return table;
        // from
        // https://www.daniweb.com/programming/software-development/threads/269840/2d-char-array-vigenere-cipher
    }// createTable

    private static void printTable(char[][] table, char[] alpha) {
        /*
         * Task 2 (30%):
         * - Complete the printTable() function so it properly prints out the Vigenere
         * - It must include the top and side titles/headings in a different color.
         */
        System.out.print("  ");
        // Loop through the row and output all alphabet letters
        for (int r = 0; r < alpha.length; r++) {
            System.out.print(Library.TEXT_RED + alpha[r] + Library.TEXT_RESET + " ");
        }
        System.out.println();
        // Loop through row --> column and output letters
        for (int r = 0; r < alpha.length; r++) {
            System.out.print(Library.TEXT_BLUE + alpha[r] + Library.TEXT_RESET + " ");
            for (int c = 0; c < alpha.length; c++) {
                System.out.print(table[r][c] + " ");
            }
            System.out.println();
        }

    }// end printTable

    public static char getChar(int rowNum, int colNum, char[][] arr) {
        return arr[rowNum][colNum];
    }

    public static int linearSearch(char[] arr, char searchTerm) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchTerm) {
                return i;
            }
        }
        return -1;
    }

    public static void searchAnyNum(char[][] array) {
        /*
         * Task 3 (30%):
         * - getChar method that takes in a 2D Array, a row number and a column number
         * - Returns the character in that space
         */
        System.out.println();
        // Get Row and Col numbers from user
        System.out.println("Find any number: ");
        System.out.print("Row Number: ");
        int rowNum = Library.input.nextInt();
        Library.input.nextLine();
        System.out.print("Column Number: ");
        int colNum = Library.input.nextInt();
        Library.input.nextLine();
        // Get the characters and output them
        char coolChar = getChar(rowNum, colNum, array);
        System.out.println();
        System.out.println("The character at Row " + rowNum + " and Column " + colNum + " is: " + coolChar);

    }

    public static void encrypt(char[][] array, String message, String keystream, char[] alphabet) {
        /*
         * Task 6 (Bonus 10%)
         * Create the Encryption method that will take any keyword and encrypt a message
         * using the Vigenere Cipher
         */
        // Loop through the keystream
        System.out.println();
        System.out.print(Library.TEXT_BLUE + "The encrypted message is: ");
        for (int i = 0; i < keystream.length(); i++) {
            // Access the letter from the keystream in the square
            char rowLetter = keystream.charAt(i);
            char colLetter = message.charAt(i);
            // Get the letter at the row and column
            int rowPos = linearSearch(alphabet, rowLetter);
            int colPos = linearSearch(alphabet, colLetter);
            char encryptedLetter = array[rowPos][colPos];
            // Get the character in the alphabet at this position
            System.out.print(encryptedLetter);
        }
        System.out.println(Library.TEXT_RESET);

    }

    public static void decrypt(char[][] array, String message, String keystream, char[] alphabet) {
        /*
         * Task 4 (30%):
         * Your goal is to build a program that will decrypt messages using the keyword
         * Scona. Three messages are provided for you and/or you can create your own at
         * the Black Chamber Website
         */
        System.out.println();

        System.out.print(Library.TEXT_BLUE + "The decrypted message is: ");
        // Loop through every character of the keystream
        for (int i = 0; i < keystream.length(); i++) {
            // Access the letter from the keystream in the square
            char rowLetter = keystream.charAt(i);
            char searchChar = message.charAt(i);

            // Get row and col positions
            int rowPos = linearSearch(alphabet, rowLetter);
            int colPos = linearSearch(array[rowPos], searchChar);

            // Get the character in the alphabet at this position
            System.out.print(alphabet[colPos]);
        }
        System.out.println(Library.TEXT_RESET);
    }

    public static String generateKeystream(String message, String key) {
        // Essentially repeat the key as many times as the message
        int keystreamLength = message.length() / key.length();
        int keystreamExtraLength = message.length() % key.length();
        // Initialize it
        String keystream = "";
        // Add all the wholes
        for (int i = 0; i < keystreamLength; i++) {
            keystream += key;
        }
        // The remaining "decimal" is less than key.length, so just add them in
        for (int i = 0; i < keystreamExtraLength; i++) {
            keystream += key.charAt(i);
        }
        return keystream;
    }
}// end class

// An alternative way to print it,using only the alphabet
/*
 * System.out.print("  ");
 * for (int r = 0; r < alpha.length; r++) {
 * System.out.print(Library.TEXT_RED + alpha[r] + Library.TEXT_RESET + " ");
 * }
 * System.out.println();
 * for (int i = 0; i < alpha.length; i++) {
 * System.out.print(Library.TEXT_BLUE + alpha[i] + Library.TEXT_RESET + " ");
 * for (int r = i; r < alpha.length; r++) {
 * System.out.print(alpha[r] + " ");
 * }
 * for (int r = 0; r < i; r++) {
 * System.out.print(alpha[r] + " ");
 * }
 * System.out.println();
 * }
 */