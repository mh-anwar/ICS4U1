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