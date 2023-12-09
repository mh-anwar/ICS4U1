
//****incomplete*****//
import java.util.Scanner;

public class Part1 {
    public static void run() {

        Scanner UserInput = new Scanner(System.in);

        // Jam objects are created and assigned the initial value amount
        ExpirationDate date1 = new ExpirationDate(05, 12, 2023, 100);
        Jam strawberry = new Jam("Strawberry", date1, 120);
        Jam raspberry = new Jam("Raspberry", "09122023", 80);
        Jam cherry = new Jam("Cherry", "10112023", 160);

        boolean userExit = false;
        while (!userExit) {
            System.out.println(Library.TEXT_GREEN);

            System.out.println("The jams are:");
            System.out.println(strawberry);
            System.out.println(raspberry);
            System.out.println(cherry);
            System.out.println(Library.TEXT_RESET);

            System.out.println();
            System.out.print("Enter your selection (1, 2, or 3 (-1)): ");
            int selectionInput = Library.input.nextInt();
            Library.input.nextLine();

            if (selectionInput == -1) {
                System.out.println("Good-by");
                return;
            } else if (selectionInput < 1 | selectionInput > 3) {
                System.out.println("Sorry...that selection doesn't exist");

            } else {
                System.out.print("Enter amount to spread: ");
                int spreadInput = Library.input.nextInt();
                Library.input.nextLine();
                System.out.println(Library.TEXT_BLUE);
                if (selectionInput == 1) {
                    strawberry.spread(spreadInput);
                } else if (selectionInput == 2) {
                    raspberry.spread(spreadInput);
                } else if (selectionInput == 3) {
                    cherry.spread(spreadInput);
                }

            }

            System.out.println(Library.TEXT_RESET);

        }
    }
}