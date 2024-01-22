/*
Made by: Mohammad, Sarah
class Corporation:
    The Corporation class is meant to contain all other classes (will be constructed later in user interactions portion).
Constructors:
    Corporation(String name, String companyOwner)
Methods:
    toString()
*/
package Corporation;

import java.util.ArrayList;
import Root.Library;
import Factory.*;
import HumanResources.*;
import Store.*;
import Expense.Expense;
import Revenue.Revenue;

public class Corporation {
    // This contains all the information and data related to a business
    public String name;
    public String companyOwner;
    protected long totalCapital = 50000; // fifty thousand
    // Hold arraylist of factories and stores as well as customers

    // All factories
    public ArrayList<PantFactory> pantFactories = new ArrayList<PantFactory>();
    public ArrayList<ShirtFactory> shirtFactories = new ArrayList<ShirtFactory>();
    public ArrayList<ShoeFactory> shoeFactories = new ArrayList<ShoeFactory>();

    // All stores
    public ArrayList<PantStore> pantStores = new ArrayList<PantStore>();
    public ArrayList<ShirtStore> shirtStores = new ArrayList<ShirtStore>();
    public ArrayList<ShoeStore> shoeStores = new ArrayList<ShoeStore>();

    // All human resources
    public ArrayList<Customer> customers = new ArrayList<Customer>();

    // Expenses und Revenue
    public Expense corpExpense = new Expense(name + " Expenses");
    public Revenue corpRevenue = new Revenue(name + " Revenues");

    public Corporation(String name, String companyOwner) {
        this.name = name;
        this.companyOwner = companyOwner;
    }

    public String toString() {
        String output = "The name of the company is " + this.name + ". The company owner is " + this.companyOwner + ".";
        return output;
    }

    // Without this update method the program will never do anything
    public void update() {
        // Handle general expenses
        double insuranceExpenses = corpExpense.getInsurance();

        int totalRent = 0;
        int totalWages = 0;

        // This is so redundant, but it's fine
        // Loop through all physical assets and manage them
        // 1. Get and total all employee wages
        // 2. Get and total all rents
        for (int i = 0; i < pantFactories.size(); i++) {
            PantFactory fac = pantFactories.get(i);
            totalWages += fac.getTotalWages();
            totalRent += fac.getRent();
        }
        for (int i = 0; i < shirtFactories.size(); i++) {
            ShirtFactory fac = shirtFactories.get(i);
            totalWages += fac.getTotalWages();
            totalRent += fac.getRent();
        }
        for (int i = 0; i < shoeFactories.size(); i++) {
            ShoeFactory fac = shoeFactories.get(i);
            totalWages += fac.getTotalWages();
            totalRent += fac.getRent();
        }
        for (int i = 0; i < pantStores.size(); i++) {
            PantStore stor = pantStores.get(i);
            totalWages += stor.getTotalWages();
            totalRent += stor.getRent();
        }
        for (int i = 0; i < shirtStores.size(); i++) {
            ShirtStore stor = shirtStores.get(i);
            totalWages += stor.getTotalWages();
            totalRent += stor.getRent();
        }
        for (int i = 0; i < shoeStores.size(); i++) {
            ShoeStore stor = shoeStores.get(i);
            totalWages += stor.getTotalWages();
            totalRent += stor.getRent();
        }
        this.totalCapital -= totalRent;
        this.totalCapital -= totalWages;
        // TODO: Every move add int(x) customers
    }

    // Factory types add
    public void addPantFactory(PantFactory newPantFac) {
        pantFactories.add(newPantFac);
    }

    public void addShoeFactory(ShoeFactory newShoeFac) {
        shoeFactories.add(newShoeFac);
    }

    public void addShirtFactory(ShirtFactory newShirtFac) {
        shirtFactories.add(newShirtFac);
    }

    // Store types add
    public void addPantStore(PantStore newPantStore) {
        pantStores.add(newPantStore);
    }

    public void addShoeStore(ShoeStore newShoeStore) {
        shoeStores.add(newShoeStore);
    }

    public void addShirtStore(ShirtStore newShirtStore) {
        shirtStores.add(newShirtStore);
    }

    // Information output
    public void showAllFacInfo() {
        Library.printNiceBreak();
        Library.printf("Factory Information");
        int totalFactories = pantFactories.size() + shirtFactories.size() + shoeFactories.size();
        System.out.println(this.name + " has " + totalFactories + " factories");
        Library.printf("Pant Factories: ");
        for (int i = 0; i < pantFactories.size(); i++) {
            PantFactory pantFac = pantFactories.get(i);
            System.out.println(pantFac);
        }

        Library.printf("Shirt Factories: ");
        for (int i = 0; i < shirtFactories.size(); i++) {
            ShirtFactory shirtFac = shirtFactories.get(i);
            System.out.println(shirtFac);
        }

        Library.printf("Shoe Factories: ");
        for (int i = 0; i < shoeFactories.size(); i++) {
            ShoeFactory shoeFac = shoeFactories.get(i);
            System.out.println(shoeFac);
        }
        Library.printNiceBreak();

    }

    public void showAllStoreInfo() {
        Library.printNiceBreak();

        Library.printf("Store Information");

        int totalStores = pantStores.size() + shirtStores.size() + shoeStores.size();
        System.out.println(this.name + " has " + totalStores + " stores");
        Library.printf("Pant Stores: ");
        for (int i = 0; i < pantStores.size(); i++) {
            PantStore pantStore = pantStores.get(i);
            System.out.println(pantStore);

        }

        Library.printf("Shirt Stores: ");
        for (int i = 0; i < shirtStores.size(); i++) {
            ShirtStore shirtStore = shirtStores.get(i);
            System.out.println(shirtStore);
        }

        Library.printf("Shoe Stores: ");
        for (int i = 0; i < shoeStores.size(); i++) {
            ShoeStore shoeStore = shoeStores.get(i);
            System.out.println(shoeStore);
        }
        Library.printNiceBreak();
    }

    // Employee management
    public void hireStoreEmployees() {

    }

    public void hireFacEmployees() {
    }

    // Asset management
    public void sellFac() {

    }

    public void sellStore() {

    } 
    
    public void crippleFactories() {

    }

    public void crippleStores() {

    }
}
