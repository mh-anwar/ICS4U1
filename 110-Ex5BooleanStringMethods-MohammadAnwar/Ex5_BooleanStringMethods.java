class Ex5_BooleanStringMethods {
  public static void run() {

    while (true) {
      int score = 0;

      System.out.println("Computer Science Quiz");

      System.out.println("Who is invented the Enigma?");
      String answer1 = Library.input.nextLine().toLowerCase();
      if (answer1.startsWith("ala") || answer1.startsWith("tur")) {
        System.out.println("Correct");
        score++;
      } else {
        System.out.println("...!  :-)  ");
      }	

      System.out.println("What is the best text editor?");
      answer1 = Library.input.nextLine().toLowerCase();
      // discuss that it would be more memory efficient to use the first answer
      // variable every time we want to Scan strings. But for simplicity of
      // understanding, we will use a new one instead.
      if (answer1.contains("lunar") && (answer1.contains("vim") || answer1.contains("vi"))) {
        System.out.println("Correct for 2 points");
        score += 2;
      } else if (answer1.contains("lunar") || answer1.contains("vi")) {
        System.out.println("Correct for 1 point");
        score += 1;
      }

      System.out.println("How many people have worked on Linux?");
      double numPeople = Library.input.nextDouble();
      Library.input.nextLine();
      if (numPeople == 15600) {
        System.out.println("Correct for 1 point");
        score += 1;
      } else if (numPeople > 15000) {
        System.out.println("Warm- warm- warm!");
      }

      System.out.println("Your score is: " + score);
    } // while loop

  }// run

}// end class

