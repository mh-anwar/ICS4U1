class Ex18_Golf2D {
    public static void run() {

        // String[] names = new String[4];
        String[] names = { "Serena", "Diane", "Stu", "Tiger" };

        int[][] scorecard = new int[4][18]; // [rows][columns]
        // Hole 1: 3 , 5, 5, 2
        scorecard[0][0] = 3;
        scorecard[1][0] = 5;
        scorecard[2][0] = 5;
        scorecard[3][0] = 2;

        // Hole 2: 4 , 4, 4, 4
        scorecard[0][1] = 4;
        scorecard[1][1] = 4;
        scorecard[2][1] = 4;
        scorecard[3][1] = 4;

        // randomize all remaining scores to be between 3 and 8
        for (int row = 0; row < scorecard.length; row++) {
            for (int col = 2; col < scorecard[row].length; col++){  
                scorecard[row][col] = Library.myRandom(3, 9);
            }
        }
        // Print out array
        
        for (int name = 0; name < names.length; name++) {
            System.out.print(names[name] + ":\t");
            for (int holes = 0; holes < scorecard[name].length; holes++) {
                    System.out.print(scorecard[name][holes] + "   ");
            }
            System.out.println();
        }
        // Calculate and print their total score at the end of each row
        System.out.println();
        
        for (int name = 0; name < names.length; name++) {
            int total = 0;
            System.out.print(names[name] + ":\t");
            for (int holes = 0; holes < scorecard[name].length; holes++) {
                    total += scorecard[name][holes];
                    System.out.print(scorecard[name][holes] + "   ");
            }
            System.out.println("Total: " + total);
        }
    }// run

}// class