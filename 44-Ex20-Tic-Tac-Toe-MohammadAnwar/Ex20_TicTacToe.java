public class Ex20_TicTacToe {
    static boolean noWinner = true;

    public static void run() {
        // create double array for Tic Tac Toe Board
        String[][] tictactoe = new String[3][3];
        // create board with numbered spots
        setupBoard(tictactoe);
        // print board
        print2DString(tictactoe);
        String player;
        String spot;

        while (noWinner) {
            player = "X";
            System.out.println("Player 1, select a number:");
            spot = Library.input.nextLine();
            addPlay(tictactoe, spot, player);
            print2DString(tictactoe);

            noWinner = checkWinner(tictactoe);

            if (noWinner == false) {
                System.out.println("Winner is player 1");
                return;
            }

            player = "0";
            System.out.println("Player 2, select a number:");
            spot = Library.input.nextLine();
            addPlay(tictactoe, spot, player);
            print2DString(tictactoe);

            noWinner = checkWinner(tictactoe);

            if (noWinner == false) {
                System.out.println("Winner is player 2");
                return;
            }
        }
    }// end run

    public static boolean checkWinner(String[][] tictactoe) {
        // use a for loop to check if a row is a winner
        for (int i = 0; i < tictactoe.length; i++) {
            if (tictactoe[0][i].equals(tictactoe[i][0]) && tictactoe[i][0].equals(tictactoe[i][2])) {
                noWinner = false;
                return false;
            }
        }
        // use a for loop to check columns
        for (int c = 0; c < tictactoe.length; c++) {
            if (tictactoe[0][c].equals(tictactoe[1][c]) && tictactoe[0][c].equals(tictactoe[2][c])) {
                noWinner = false;
                return false;
            }
        }
        // check both diagonals
        if (tictactoe[0][0].equals(tictactoe[1][1]) && tictactoe[0][0].equals(tictactoe[2][2])) {
            noWinner = false;
            return false;
        }
        if (tictactoe[0][2].equals(tictactoe[1][1]) && tictactoe[0][2].equals(tictactoe[2][0])) {
            noWinner = false;
            return false;
        }

        return true;
    }

    public static void print2DString(String[][] arr) {
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                System.out.print(" | " + arr[r][c]);
            }
            System.out.println(" |");
        }
    }// end print2dString
     // fill board with numbers from 1 to 9 consecutively
     // fill board with numbers from 1 to 9 consecutively

    public static void setupBoard(String[][] tictactoe) {
        int space = 0;
        for (int r = 0; r < tictactoe.length; r++) {
            for (int c = 0; c < tictactoe[r].length; c++) {
                space += 1;
                tictactoe[r][c] = String.valueOf(space);
            }
        }
    }// end setupBoard

    public static void addPlay(String[][] tictactoe, String spot, String player) {
        for (int r = 0; r < tictactoe.length; r++) {
            for (int c = 0; c < tictactoe.length; c++) {
                if (tictactoe[r][c].equals(spot)) {
                    tictactoe[r][c] = player;
                }
            }
        }
    }// end addPlay
}// end class
