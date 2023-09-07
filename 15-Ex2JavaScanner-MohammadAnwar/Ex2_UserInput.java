
class Ex2_UserInput {

    public static void run() {

        // Note also the new IMPORT line at the top of this file

        // +++++++++++ Part 1 Scanning Integers +++++++++++
        int time1;
        int time2;
        int time3;
        double average;

        System.out.println(Library.TEXT_RED + "What is the time for runner 1?" + Library.TEXT_RESET);
        time1 = Library.input.nextInt();
        Library.input.nextLine();
        // required to flush out the ENTER key that is pressed at the end of integer
        // (and any number) input

        System.out.println(Library.TEXT_YELLOW + "What is the time for runner 2?" + Library.TEXT_RESET);
        time2 = Library.input.nextInt();
        Library.input.nextLine();

        System.out.println(Library.TEXT_CYAN + "What is the time for runner 3?" + Library.TEXT_RESET);
        time3 = Library.input.nextInt();
        Library.input.nextLine();

        average = (time1 + time2 + time3) / 3;
        System.out.println(Library.TEXT_PURPLE+"Team finished with an average " + average + " seconds" + Library.TEXT_RESET);
        // +++++++++++ Part 2 Scanning Strings and Doubles +++++++++++
        String name;
        int numTunes;
        double grade;

        System.out.println(ConsoleColors.RED_UNDERLINED + "Ex1_Datatypes" + Library.TEXT_RESET);
        System.out.println("There are 5 core data types in java");

        System.out.println();
        System.out.println("Welcome!");
        System.out.println("What is your name?");
        name = Library.input.nextLine();
        System.out.println(name + " is a great name!. How old are you?");
        int age = Library.input.nextInt();
        Library.input.nextLine();

        System.out.println("I remember when I was " + age + ", Good times.");

        System.out.println("This is going to be an exciting class. \nWhat mark did you get in the Grade 11 class?");
        grade = Library.input.nextDouble();
        Library.input.nextLine();

        if (grade < 80) {
            System.out.println("You are  going to have work really hard in this class to keep up");
        } else if (grade < 90) {
            System.out.println("Excellent! keep up the hard work!");
        } else {
            System.out.println("Congratulations, you are going to be a star in this class!");
        }
    }// end run
}// end class
