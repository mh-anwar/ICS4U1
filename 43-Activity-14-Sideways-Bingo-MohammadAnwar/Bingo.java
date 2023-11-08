class Bingo {

    public static void run() {
        // Print welcome message
		System.out.println("Welcome to BINGO. Negative numbers are blue.");
		System.out.println();
        // Initialize arrays
        char[] names = { 'b', 'i', 'n', 'g', 'o' };
        int[][] numbers = {
                generateArray(5, 1, 15),
                generateArray(5, 16, 30),
                generateArray(5, 31, 45),
                generateArray(5, 46, 60),
                generateArray(5, 61, 75),
        };
        // Print the bingo
        printBingo(names, numbers);
        // While the user doesn't win, just keep looping back
        Boolean userExit = false;
        while (!userExit) {
            // Wait for user to enter
            System.out.print("Press enter to Bingo: ");
            String enterKey = Library.input.nextLine();
            // If the user presses enter then:
            if (enterKey == "") {
                // Generate a random number
                int randomNum = Library.myRandom(1, 75 + 1);
                System.out.println("The number chosen is: " + randomNum);
                // Find number in the array, if found, mark it as negative
                searchBingo(randomNum, numbers, names);
            }

            System.out.println();
            
            // Check if card is winner
            boolean rowWin = false;
            boolean colWin = false;
            // Loop through each row and check if it is a winner
            for (int r = 0; r < numbers.length; r++) {
                rowWin = checkRow(numbers[r]);
                if (rowWin == true) {
                    break;
                }
            }
            // It's always a square right?
            // Loop thru each column and check if it is a winner
            for (int c = 0; c < numbers.length; c++) {
                colWin = checkColumn(numbers, c);
                if (colWin == true) {
                    break;
                }
            }
            // Check if there is either diagonal
            boolean diagonalWin = checkDiagonal(numbers);
            // If row, col or diagonal wins, print that user won and exit
            if (colWin == true || rowWin == true || diagonalWin == true) {
                break;
            }
        }
        System.out.println("You won!");
    }// end run

    public static int[] generateArray(int arrLength, int min, int max) {
        int[] arr = new int[arrLength];

        for (int r = 0; r < arr.length; r++) {
            // Generate new random num
            int randomNum = Library.myRandom(min, max + 1);
            // While the number exists in the array, generate a new one until it doesn't already exist
            while(search2DBingoArray(randomNum, arr)){
                randomNum = Library.myRandom(min, max + 1);
            }
            // Set the index to be the random number
            arr[r] = randomNum;
        }
        return arr;
    }

    public static boolean search2DBingoArray(int searchNum, int[] intArr) {
        // Loop through the entire row
        for (int r = 0; r < intArr.length; r++) {
            // If the search number is the same as an index, return that it already exists
            if (intArr[r] == searchNum) {
                return true;
            }
        }
        // If the search number doesnt exist, return that it doesn't - duh
        return false;
    }
    
    public static void printBingo(char[] labelArr, int[][] intArr) {
		// Print first row, all 0 values of every array
		for(int i = 0; i < labelArr.length; i++){
			System.out.print(Character.toUpperCase(labelArr[i]) + "\t\t");
		}
		System.out.println();
        // Loop through each column
		for(int c = 0; c < intArr.length; c++){
            // Then loop through each row
			for (int r = 0; r < intArr.length; r++) {
                // Print each unit/tile, if it is less than 0 (negative) then print with a different color
				if (intArr[r][c] < 1) {
					System.out.print(Library.TEXT_BLUE + (-intArr[r][c]) + "\t\t" + Library.TEXT_RESET);
				} else {
					System.out.print(intArr[r][c] + "\t\t");
				}
			}
			System.out.println();
		}
		System.out.println();

    }

    public static void searchBingo(int searchNum, int[][] intArr, char[] charArr) {
        // If the number is found 
        Boolean numFound = false;
        // Loop through each row
        for (int r = 0; r < intArr.length; r++) {
            // Loop through each column
            for (int c = 0; c < intArr[r].length; c++) {
                // If unit/tile is the same as the given searchNum, change it and set that it's been found
                if (intArr[r][c] == searchNum) {
                    numFound = true;
                    intArr[r][c] = -intArr[r][c];
                }
            }
        }
        // If it's not found, print a not found error, else print the new bingo
        if (!numFound) {
            System.out.println("Error 404: Not found");
        } else {
            printBingo(charArr, intArr);
        }
    }

    public static boolean checkRow(int[] row) {
        // Check if all numbers in the row are negative
        for (int i = 0; i < row.length; i++) {
			// If any number is not negative, immediately break and return that the row is not winning-material
            if (row[i] > 0) return false;
        }
		// If not number is greater than 0, than return true, that the row has won
        return true;
    }

    public static boolean checkColumn(int[][] arr, int colNum) {
		// Loop through every row and get the column number we want
        for (int r = 0; r < arr.length; r++) {
			// If any col number is not negative, immediately break and return that col is not valid perfect
            if (arr[r][colNum] > 0) return false;
        }
		// If no number is greater than 0, than return true - the column has won
        return true;
    }

	public static boolean checkDiagonal(int[][] arr){
		// from left to right
        boolean isDiagonalWin1 = true;
        // Print every 0,0 - 1,1 - 2,2 etc
		for(int i = 0; i < arr.length; i ++){
           if(arr[i][i] > 0){
                isDiagonalWin1 = false;
           }
        }
        boolean isDiagonalWin2 = true;
		// from right to left
        // Print from left to right, every 5,1 - 4,2 - 3,3 - etc
        for(int i = 0; i < arr.length; i ++){
           if(arr[i][arr.length - 1 -i] > 0){
               isDiagonalWin2 = false;
           }
        }
        // If either is true, return that a diagonal is true
        boolean isEitherDiagonal = isDiagonalWin1 || isDiagonalWin2;
        return isEitherDiagonal;
	}
}// end class