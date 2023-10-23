import java.util.ArrayList;
import java.io.*;

class LawnMain {
    public static void run() {
        ArrayList<LawnClient> allClients = new ArrayList();

        allClients.add(new LawnClient("Mr. Buckland", "666 Maple Lane", 20, false));
        allClients.add(new LawnClient("Grogu", "444 Galaxy far far away", 10, true));
        allClients.add(new LawnClient("Luke", "35 Tatoinne Drive", 100, false));
        allClients.add(new LawnClient("Queen Amidala", "5 Naboo Street", 200, true));

        // Get new client file from previous company
        loadFile("lawn.csv", allClients);

        while (true) {
            System.out.println();
            System.out.println("What would you like to do?");
            System.out.println("1.  Print all addresses");
            System.out.println("2.  Mow all lawns");
            System.out.println("3.  Recieve Payment");
            System.out.println("4.  Add new client");
            System.out.println("5.  Delinquent Payments");
            System.out.println("6.  Save and Exit");

            int choice = Library.input.nextInt();
            Library.input.nextLine();
            if (choice == 1) {
                printAllClients(allClients);
            } else if (choice == 2) {

            } else if (choice == 3) {

            } else if (choice == 4) {

            } else if (choice == 5) {

            } else {

            }
        } // while

    }// run

    public static void printAllClients(ArrayList<LawnClient> list) {
		for (int i = 0;i < list.size(); i ++){
			System.out.println(list.get(i).address + " Owner: " + list.get(i).name + " Current owing: $" + list.get(i).outstandingFees);
		}
    }// printAllClients

    public static int searchByName(ArrayList<LawnClient> list, String searchTerm) {
        return -1;
    }// end search

    public static void loadFile(String filename, ArrayList<LawnClient> list) {

    }// end loadFile

    public static void saveFile(String filename, ArrayList<LawnClient> tempList) {

    }// end saveFile

}// class