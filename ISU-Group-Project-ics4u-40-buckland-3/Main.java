
//Made by Mohammad
// Class ShoeStore :
// The shoe store class extends the Store class and provides specific variables related to shoes such as the type of shoe, size and color
// Methods
// addShoeSize
// removeShoeSize
// addShoeType
// removeShoeType
// import static org.junit.jupiter.api.Assertions.assertEquals;
// import org.junit.jupiter.api.Test;
import Corporation.Corporation;
import Factory.*;
import Factory.Factory;
import Store.*;
import Root.GptApi;
import Root.Library;

class Main {
    public static void main(String[] args) {
        // Let the games begin
        Library.printf("Welcome to the ICS 4U1 Business Simulation");

        // 1. Let the user set up their company
        Library.printf("Name your corporation:");
        String corpName = Library.input.nextLine();

        Library.printf("What is your name:");
        String ownerName = Library.input.nextLine();

        // Make the corporation
        Corporation userCorp = new Corporation(corpName, ownerName);

        // Make the user create their first factory, and their first store
        PantFactory firstPantFactory = (PantFactory) FactoryBuilder.createFactory("pant");
        userCorp.addPantFactory(firstPantFactory);

        PantStore firstPantStore = (PantStore) StoreBuilder.createStore("pant");
        userCorp.addPantStore(firstPantStore);

        Library.successMsg(
                "Well done! You've built your first factory and store, now you will go through 500 turns and develop your corporation. Your goal is to make around $500,000");
        int turnNumber = 0;
        // 2. Show a menu for them to manage their business
        while (true) {
            Library.warningMsg("Turn Number: " + Integer.toString(turnNumber));

            // Let the turn begin
            System.out.println("Manage " + Library.formatBlue(userCorp.name));
            System.out.println("0. Go to next turn"
                    + "\n1. Manage factories"
                    + "\n2. Manage stores"
                    + "\n3. Manage corporation"
                    + "\n4. Give up on life and jump off a 22 tower building");
            int userChoice = Library.promptInt();
            Library.printBreak();

            // User choice: 1, 2, 3: expose class methods
            if (userChoice == 0) {
                // Throw a random event at user and go to next turn
                // String data = GptApi.prompt(
                // "Generate sample data for a Transaction: Date transactionDate, String
                // recipientName, String recipientEmail, double totalAmount?");
                // System.out.println(data);
                turnNumber++;
                // Update their entire corporation every move (a month)
                userCorp.update();
            } else if (userChoice == 1) {
                System.out.println();
                System.out.println("Manage " + Library.formatBlue(userCorp.name) + " factories");
                System.out.println("1. View all factory information"
                        + "\n2. Hire employees"
                        + "\n3. Sell factory");
                userChoice = Library.promptInt();

                if (userChoice == 1) {
                    userCorp.showAllFacInfo();
                } else if (userChoice == 2) {
                    userCorp.hireFacEmployees();
                } else if (userChoice == 3) {
                    userCorp.sellFac();
                }
            } else if (userChoice == 2) {
                System.out.println();

                System.out.println("Manage " + Library.formatBlue(userCorp.name) + " stores");
                System.out.println("1. View all store information"
                        + "\n2. Hire employees"
                        + "\n3. Sell store");
                userChoice = Library.promptInt();
                // pain
                if (userChoice == 1) {
                    userCorp.showAllStoreInfo();
                } else if (userChoice == 2) {
                    userCorp.hireStoreEmployees();
                } else if (userChoice == 3) {
                    userCorp.sellStore();
                }

            } else if (userChoice == 3) {
                System.out.println();

                System.out.println("1. View all company information"
                        + "\n2. Buy factory"
                        + "\n3. Buy store"
                        + "\n4. View expenses and revenues");
                userChoice = Library.promptInt();

                if (userChoice == 1) {
                    System.out.println(userCorp);
                } else if (userChoice == 2) {
                } else if (userChoice == 3) {
                }

            } else if (userChoice == 4) {
                // Kill the program
                Library.errorMsg("Giving up so easily young one?");
                Library.errorMsg(turnNumber + " - that's the number of turns you WASTED");
                Library.errorMsg("It is too late to return, everything is being burned and destroyed now.");
                Library.errorMsg("Making me write a whole program... just to destroy it?");
                break;
            } else {
                // Just go back up
            }

        } // while loop
    } // main class
}// Main end

// @Test
// void addition() {
// assertEquals(2, 1 + 1);
// }
