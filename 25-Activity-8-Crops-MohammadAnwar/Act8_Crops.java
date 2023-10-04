import java.util.ArrayList;
import java.util.Arrays;
/*
    “Don’t Use a Comment When You Can Use a Function or a Variable”
    ― Robert C. Martin, Clean Code: A Handbook of Agile Software Craftsmanship  
*/

class Act8_Crops{
    // Declare parallel arrays and revenue as _publicly_ used variables
    public static ArrayList <String> allNames = new ArrayList(
        Arrays.asList("Onion", "Apples", "Cotton", "Potato", "Tomato")
    );
    public static ArrayList <Integer> allAcres = new ArrayList(
        Arrays.asList(100, 400, 200, 100, 200)
    );
    public static ArrayList <Double> allYield = new ArrayList(
        Arrays.asList(70.0, 400.0, 990.5, 25050.9, 38000.0)
    );
    public static ArrayList <String> allUnits = new ArrayList(
        Arrays.asList("pounds", "bushels", "pounds", "pounds", "pounds")
    );
    public static ArrayList <Double> allPrices = new ArrayList(
        Arrays.asList(0.75, 45.00, 0.95, 0.70, 1.75)
    );
    public static Double revenue = 0.0;
    
    public static void run(){
        // Set a variable to track program end
        Boolean programEnd = false;
        
        while(programEnd == false){
            // Output Farm Menu
            System.out.println();
            System.out.println("Farm Menu: ");
            System.out.println("1. Farm Summary ");
            System.out.println("2. Search and Harvest");
            System.out.println("3. Calculate Revenue");
            System.out.println("4. Exit");
            // Take input on user option
            System.out.print("(Type option # in): ");
            Integer menuOption = Library.input.nextInt();
            Library.input.nextLine();
            // Call different function based on input, end program, or simply re-loop
            if(menuOption == 1){
                outputFarmSummary();
            } else if(menuOption == 2){
                searchAndHarvest();
            } else if(menuOption == 3){
                outputRevenue();
            } else if(menuOption == 4){
                programEnd = true;
            } else{
                continue;
            }

            System.out.println();
        }

    }//end run
    public static void outputFarmSummary(){
        // Output Farm Sumary
        System.out.println();
        System.out.println("Farm Summary: ");
        
        // Loop through each crop and print out info about it
        for (int i = 0; i < allNames.size(); i ++){
            String name  = allNames.get(i);
            outputCropInfo(name, i);
        }
    }
    
    public static void searchAndHarvest(){
        // Search and Harvest
        System.out.println();
        // Get crop name from user
        System.out.print("Search and Harvest a Crop: ");
        String cropName = Library.input.nextLine();
        // Track whether crop was found or not
        Boolean cropFound = false;
        // Loop through all crops, check if crop matches user-entered crop
        for (int i = 0; i < allNames.size(); i ++){
            String name  = allNames.get(i);
            // If crop matches user entered crop:
            if (cropName.equalsIgnoreCase(name)){
                cropFound = true; // Set crop found value to true
                // Output crop information
                outputCropInfo(name, i);
                // Calculate the value of the crop value, add it to the revenue
                Double cropValue = calculateValue(name, i);
                revenue += cropValue;
                // Format the crop value
                String formattedCropVal = Library.dollarFormat.format(cropValue);
                // Output the crop value
                System.out.println("The value of " + name + " crop is " + formattedCropVal);
                // Set the harvested crops' acres to 0
                allAcres.set(i, 0);
            }
        }
        // If the crop isn't found, output an error
        if(cropFound == false){
            System.out.println("Error 404: Crop not found");
        }
    }
    
    public static void outputRevenue(){
        System.out.println();
        
        // Format the revenue and output it
        String formattedRevenue = Library.dollarFormat.format(revenue);
        System.out.println("Total revenue from all harvested crops: " + formattedRevenue);
    }
    
    public static void outputCropInfo(String name, Integer i){
        // Retrieve all crop information variables
        Integer acres = allAcres.get(i);
        Double yield = allYield.get(i);
        String unit = allUnits.get(i);
        Double price = allPrices.get(i);

        // Format variables
        String formattedAcres = Library.commaFormat.format(acres);
        String formattedYield = Library.commaFormat.format(yield);
        String formattedPrice = Library.commaFormat.format(price);
        
        // Output each variable with revelent textual info
        System.out.println(name + ":");
        System.out.println("- " + formattedAcres + " acres");
        System.out.println("- " + formattedYield + " " + unit + " of " + name + " per acre");
        System.out.println("- Price per " + name + ": $" + formattedPrice + " ");
        System.out.println("•*´¨`*•.¸¸.•*´¨`*•.¸¸.•*´¨`*•.¸¸.•*´¨`*•.¸¸.•");
        System.out.println();
    }

    public static Double calculateValue(String name, Integer i){
        // Get all crop relevent statistics
        Integer acres = allAcres.get(i);
        Double yield = allYield.get(i);
        Double price = allPrices.get(i);
        // Calculate crop value
        Double value = price * yield * acres;
        return value;
    }
}//end class

