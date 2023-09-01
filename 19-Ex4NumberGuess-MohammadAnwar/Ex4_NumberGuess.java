class Ex4_NumberGuess {
	public static void run() {

		int compNum = Library.myRandom(1, 100);
		System.out.println(compNum);
		int userNum = -1;

      	while (userNum != compNum) {
	        System.out.println("What is your guess?");
	        userNum = Library.input.nextInt();
	        Library.input.nextLine();
	        if (userNum > compNum) {
	          	System.out.println(userNum + " is too high.");
	        } else if (userNum < compNum) {
	          	System.out.println(userNum + " is too low.");
	        }
	      } // inner loop
      System.out.println("You win!");
	}
}
