import java.util.Scanner;

class Library {

	public static Scanner input = new Scanner(System.in);

	// ***** Text Colors for the Console *****************//
	public static final String TEXT_RESET = "\u001B[0m";
	public static final String TEXT_BLACK = "\u001B[30m";
	public static final String TEXT_RED = "\u001B[31m";
	public static final String TEXT_GREEN = "\u001B[32m";
	public static final String TEXT_YELLOW = "\u001B[33m";
	public static final String TEXT_BLUE = "\u001B[34m";
	public static final String TEXT_PURPLE = "\u001B[35m";
	public static final String TEXT_CYAN = "\u001B[36m";

	// Bold
	public static final String BLACK_BOLD = "\033[1;30m";  // BLACK
	public static final String RED_BOLD = "\033[1;31m";    // RED
	public static final String GREEN_BOLD = "\033[1;32m";  // GREEN
	public static final String YELLOW_BOLD = "\033[1;33m"; // YELLOW
	public static final String BLUE_BOLD = "\033[1;34m";   // BLUE
	public static final String PURPLE_BOLD = "\033[1;35m"; // PURPLE
	public static final String CYAN_BOLD = "\033[1;36m";   // CYAN
	public static final String WHITE_BOLD = "\033[1;37m";  // WHITE
	
	// Underline
	public static final String BLACK_UNDERLINED = "\033[4;30m";  // BLACK
	public static final String RED_UNDERLINED = "\033[4;31m";    // RED
	public static final String GREEN_UNDERLINED = "\033[4;32m";  // GREEN
	public static final String YELLOW_UNDERLINED = "\033[4;33m"; // YELLOW
	public static final String BLUE_UNDERLINED = "\033[4;34m";   // BLUE
	public static final String PURPLE_UNDERLINED = "\033[4;35m"; // PURPLE
	public static final String CYAN_UNDERLINED = "\033[4;36m";   // CYAN
	public static final String WHITE_UNDERLINED = "\033[4;37m";  // WHITE

	// Background
	public static final String BLACK_BACKGROUND = "\033[40m";  // BLACK
	public static final String RED_BACKGROUND = "\033[41m";    // RED
	public static final String GREEN_BACKGROUND = "\033[42m";  // GREEN
	public static final String YELLOW_BACKGROUND = "\033[43m"; // YELLOW
	public static final String BLUE_BACKGROUND = "\033[44m";   // BLUE
	public static final String PURPLE_BACKGROUND = "\033[45m"; // PURPLE
	public static final String CYAN_BACKGROUND = "\033[46m";   // CYAN
	public static final String WHITE_BACKGROUND = "\033[47m";  // WHITE

	public static int myRandom(int min, int max){
		//up to 1 less than max
		int temp;
		temp =  (int) (Math.random() * (max-min)     + min  );

		return temp;
	}//myRandom



	public static int stringSearch(String[] arr, String searchTerm) {
		for (int i = 0; i < arr.length; i++) {
			if (searchTerm.equalsIgnoreCase(arr[i])) {
				return i;
			}
		}
		return -1;
	}// stringSearch





}// class