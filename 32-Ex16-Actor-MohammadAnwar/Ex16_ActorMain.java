import java.util.ArrayList;
import java.io.*;

public class Ex16_ActorMain {

    public static void run() {

        ArrayList<Ex16_Actor> allActors = new ArrayList();

        allActors.add(new Ex16_Actor("Smith", true));
        allActors.add(new Ex16_Actor("Buckland", true));
        allActors.add(new Ex16_Actor("Robinson", false));
        allActors.add(new Ex16_Actor("Chodin", false));
        allActors.add(new Ex16_Actor("Lei", true));
        allActors.add(new Ex16_Actor("Kinasevich", false));

        allActors.get(0).setRole("Juliet");
        allActors.get(1).setRole("Romeo");
        allActors.get(2).setRole("Friar Lawrence");
        allActors.get(3).setRole("Mercutio");
        allActors.get(4).setRole("Lady Monague");
        allActors.get(5).setRole("Tybalt");

        /*
         * allActors.get(0).addSales(200);
         * allActors.get(2).addSales(100);
         * allActors.get(1).addSales(150);
         * allActors.get(0).addSales(75);
         * 
         * System.out.println("");
         * for (int i = 0; i < allActors.size(); i++) {
         * System.out.println(allActors.get(i));
         * }
         * 
         * double totalSales = 0;
         * for (int i = 0; i < allActors.size(); i++) {
         * totalSales += allActors.get(i).getSales();
         * }
         * 
         * System.out.println("Total Ticket Sales: $" + totalSales);
         */
        // saveFile("data/Ex16_Actors.csv", allActors);
        while (true) {
            System.out.println("What would you like to do?");
            System.out.println("1. Print all");
            System.out.println("2. Add Sales");
            System.out.println("3. Pay actors");
            System.out.println("4. Exit");

            int choice = Library.input.nextInt();
            Library.input.nextLine();
            if (choice == 1) {
                for (int i = 0; i < allActors.size(); i++) {
                    System.out.println(allActors.get(i));
                }
            } else if (choice == 2) {
                System.out.println("Which actor is selling tickets?");
                String name = Library.input.nextLine();
                System.out.println("How many tickets did we sell?");
                int tix = Library.input.nextInt();
                Library.input.nextLine();

                int foundIndex = searchByName(allActors, name);
                if (foundIndex == -1) {
                    System.out.println("Name not found");
                } else {
                    allActors.get(foundIndex).sellTix(tix);
                }

            } else if (choice == 3) {
                double totalPay = 0;
                for (int i = 0; i < allActors.size(); i++) {
                    totalPay += allActors.get(i).pay();
                }
                System.out.println("Total Payroll: $" + totalPay);
            } else {
                return;
            }
        }
    }// run

    public static int searchByName(ArrayList<Ex16_Actor> list, String searchName) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).name.equalsIgnoreCase(searchName)) {
                return i;
            }
        }
        return -1;
    }

    /*
     * 
     * public static void loadFile(String filename, ArrayList<Ex16_Actor> list) {
     * 
     * try {
     * BufferedReader file = new BufferedReader(new FileReader(filename));
     * 
     * String dataToRead;
     * while (file.ready()) {
     * dataToRead = file.readLine();
     * 
     * String tempArray[] = dataToRead.split(",");
     * 
     * list.add(new Ex16_Actor(tempArray[0], Boolean.parseBoolean(tempArray[1]),
     * tempArray[2],
     * Double.parseDouble(tempArray[3])));
     * 
     * }
     * } catch (IOException e) {
     * System.out.println(e);
     * }
     * }// end loadFile
     * 
     * public static void saveFile(String filename, ArrayList<Ex16_Actor> tempList)
     * {
     * try {
     * PrintWriter file = new PrintWriter(new FileWriter(filename));
     * 
     * for (int i = 0; i < tempList.size(); i++) {
     * // the next lines are customized for whatever data you are getting.
     * String toSave = "";
     * toSave = tempList.get(i).name;
     * toSave += "," + tempList.get(i).isPro;
     * toSave += "," + tempList.get(i).role;
     * toSave += "," + tempList.get(i).sales;
     * 
     * 
     * // The above 6 lines could be replaced by a call to a carefully made
     * toString()
     * // function
     * 
     * file.println(toSave);
     * 
     * }
     * file.close();
     * } catch (IOException ex) {
     * System.out.println(ex.toString());
     * }
     * 
     * }// end saveFile
     * 
     * 
     */
}// actorMain