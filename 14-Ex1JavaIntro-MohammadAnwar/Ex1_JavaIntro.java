class Ex1_JavaIntro {
  public static void run() {
   //++++++++  Example 1 - Focusing on Java Printing and Datatypes ++++

    System.out.println();
    System.out.println();
    System.out.println("Welcome to Grade 12 Computer Science");
  
    System.out.println();
    System.out.println("\tMean Aunt Java's Big 5 Data Types");
    
    System.out.println("int - for whole numbers");
    int age = 16;
    System.out.println("\tMr. Smith's age is " + age + " years old");
    
    System.out.println("'String' for words (notice the capital S)");
    String course = "ICS4U1";
    System.out.println("\tWe are taking the course called " + course);

    System.out.println("'char' for single characters (not needed often in Java)");
    char goalGrade = 'a';

    System.out.println("'boolean' for true or false");
    boolean metGoal = true;
    if( metGoal ){
      System.out.println("\tCongratulations on earning an " + goalGrade);
    }

    System.out.println("'double' or 'float' for numbers that may contain decimals. \n\tI usually use doubles but floats are more memory efficient.");
    double average = 100.1;
    System.out.println("\tYour average in this class was " + average);
  }// run
}// end class
