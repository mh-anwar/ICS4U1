class Ex19_Sudoku {
    public static void run() {

        //manually create a valid 3x3 square and check it
        int[][] square1 = {{1,2,3}, {4,5,6}, {7,8,9}};
        print2dint(square1);
        System.out.println("Square 1 is legit: " + testSquare(square1));
        // int[][] square2 = {{1,2,3}, new int[3], {7,8,9}};
        // print2dint(square2);
        //manually create an invalid 3x3 square and check it
        int[][] square2 = {{1,2,9}, {4,5,6}, {7,8,9}};
        print2dint(square2);
        System.out.println("Square 2 is legit: " + testSquare(square2));

        //generate random squares and check if valid
        int[][] square3 = generateSquare(3);
        print2dint(square3);
        System.out.println("Square 3 is legit: " + testSquare(square3));
        
        int counter = 0;
        // Continue to generate random squares until legit one is created
        while(testSquare(square3) == false){
            counter ++;
            square3 = generateSquare(3);
            print2dint(square3);
            System.out.println("Square 3 is legit: " + testSquare(square3));
        }
        System.out.println("took " + counter + " tries");
        // Create blanks in legit square
        int[][] square4 = createBlanks(3, square3);
        print2dint(square4);
        System.out.println("Square 3 is legit: " + testSquare(square3));
        
    }// run


    
    //Generate square of any size
    public static int[][] generateSquare(int size){
        int[][] arr = new int[size][size];
        int max = (int)Math.pow(size, 2);

        for(int r = 0; r < arr.length; r++){
            for(int c = 0; c < arr[r].length; c++){
                arr[r][c] = (int) (Math.random() * max +1);    
            }
        }
        return arr;
    }
    //Challenge create a testSquare method
    public static boolean testSquare(int[][]arr){
        for(int i = 1; i < 10; i++){
            int counter = 0;
            for (int r = 0; r < arr.length; r++){
                for(int c = 0; c < arr[r].length; c++){
                    if(arr[r][c] == i){
                        counter++;
                    }
                }
            }
            if (counter > 1){
                return false;
            }
        }
        return true;
    }
    //print 2d array
    public static void print2dint(int[][] arr){
        for (int r = 0; r < arr.length; r++){
            for(int c = 0; c < arr[r].length; c++){
                System.out.print(arr[r][c] + "   ");
            }        
            System.out.println();
        }
    }
    //create Blanks in 2D array
    public static int[][] createBlanks(int num, int[][] arr){
        for (int i = 0; i < num; i ++){
            int r = Library.myRandom(0,3);
            int c = Library.myRandom(0,3);
            arr[r][c] = 0;
        }
        return arr;
    }

}// class