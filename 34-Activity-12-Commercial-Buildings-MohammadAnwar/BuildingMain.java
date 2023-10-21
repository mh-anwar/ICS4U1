import java.util.ArrayList;
import java.util.Arrays;
import java.text.DecimalFormat;

public class BuildingMain {
    // Declare Decimal Format
    static DecimalFormat df = new DecimalFormat("0.00");
    // Declare and initialize all buildings
    public static ArrayList<Building> allBuildings = new ArrayList<Building>(
            Arrays.asList(
                    new Building("Urban Outfitters", 12000, "downtown"),
                    new Building("Kumon", 8000, "rural"),
                    new Building("Hudson's Bay", 12000, "downtown"),
                    new Building("Turquoise Boutique", 3000, "rural"),
                    new Building("Amazon", 29000, "industrial"),
                    new Building("Speedy Glass Whitby", 8000, "industrial")));

    public static void run() {
        // Print out rental summary for January
        System.out.println(Library.TEXT_GREEN + "Rental Summary - January 1st" + Library.TEXT_RESET);
        System.out.println();
        // Print all buildings, charge rent and reprint buildings
        printAllBuildings();
        chargeAllBuildingsRent();
        System.out.println();
        printAllBuildings();
        // Print out rental summary for February
        System.out.println();
        System.out.println(Library.TEXT_GREEN + "Rental Summary - February 1st" + Library.TEXT_RESET);
        System.out.println();
        // Set tenant to coup industries, charge all buildings rent
        allBuildings.get(1).setTenant("Coup Industries 3000");
        chargeAllBuildingsRent();
        System.out.println();
        // Print out rental summary for March
        System.out.println(Library.TEXT_GREEN + "Rental Summary - March 1st" + Library.TEXT_RESET);
        System.out.println();
        // Print all buildings
        printAllBuildings();
        // Output total years rent
        System.out.println();
        outputTotalRent();
    }

    protected static void outputTotalRent() {
        // Hold total rent
        int totalRent = 0;
        // Loop through all buildings, get their rent and add it up
        for (int i = 0; i < allBuildings.size(); i++) {
            totalRent += allBuildings.get(i).getThisYearsRent();
        }
        // Output total rent
        System.out.println(
                "This year's rents total to: " + Library.TEXT_BLUE + "$" + df.format(totalRent) + Library.TEXT_RESET);
    }

    protected static void printAllBuildings() {
        // Loop through all buildings, call .toString on them and output them
        for (int i = 0; i < allBuildings.size(); i++) {
            System.out.println(allBuildings.get(i).toString());
        }
    }

    protected static void chargeAllBuildingsRent() {
        // Output that you are charging people rent, then charge them rent
        System.out.println(Library.TEXT_PURPLE + "Charging all building's rent" + Library.TEXT_RESET);
        for (int i = 0; i < allBuildings.size(); i++) {
            allBuildings.get(i).chargeRent();
        }
    }
}