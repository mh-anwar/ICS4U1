import java.text.DecimalFormat;
class Act1_Warehouse {
    // Forgot to do management warning message
    public static void run(){
        // Print out introduction statements
		System.out.println();
        System.out.println(Library.RED_UNDERLINED + "Mohammad's Quality Fruits'" + Library.RESET);
		System.out.println();
        System.out.println(Library.BLACK_BOLD + "Inventory Tracking System" + Library.RESET);
        
        // Declare decimal format
        DecimalFormat df = new DecimalFormat("#.00");
        
        // Declare intiial variables
        Boolean enterAnotherProduct = true;
        String productType;
        double cost;
        String brandName;
        int numberInShipment;
        double contValue;
        final String SALE_ITEM = "Banana";            
        double markup;

        
        // Loop while the user wants to enter another product
        while (enterAnotherProduct == true){
            // Ask for the productType
    		System.out.println();
    		System.out.println("Please enter the type of product received:");
    		productType = Library.input.nextLine();
            
            // Check if the product is on sale and output if it is
            System.out.println();
            if(productType.equalsIgnoreCase(SALE_ITEM)){
                System.out.println("This month's sale: " + Library.CYAN + SALE_ITEM + Library.RESET );    
            }
            
            // Get the cost of the productType
            System.out.println();
    		System.out.println("Please enter the cost to us for each " + Library.CYAN + productType + Library.RESET + ":");
    		cost = Library.input.nextDouble();
            Library.input.nextLine();

            // Get the brand of productType
            System.out.println();
    		System.out.println("Please enter the brand of " + Library.CYAN + productType + Library.RESET + ":");
    		brandName = Library.input.nextLine();
           
            // Get the number of productType
            System.out.println();
    		System.out.println("Please enter the number of " + Library.CYAN + productType + Library.RESET +" received:");
    		numberInShipment = Library.input.nextInt();
            Library.input.nextLine();

            // Back order warning logic
            System.out.println();
            if (numberInShipment < 10 && numberInShipment > 5){
                System.out.println("Back order warning - Watch inventory level carefully" );
            } else{
                System.out.println("Back order warning - Order from different supplier.");
            }
            System.out.println();
            
            // Calculate item price based on it's price
            if (cost < 50){
                markup = 2.0 ;
            } else {
                markup = 1.5;
            }
            String formattedItemPrice = df.format(markup * cost);

            // Calculate value and format it
            contValue = cost * numberInShipment * markup;
            String formattedContValue = df.format(contValue);

            // Output shipment container value
            System.out.println(Library.YELLOW_BOLD + "Shipment Container Summary:" + Library.RESET);
            System.out.println("The new product is " + Library.CYAN + productType + Library.RESET);
            System.out.println("The shipment included " + Library.BLUE + numberInShipment + Library.RESET+ " " + Library.CYAN + productType + Library.RESET + " from " + Library.GREEN + brandName + Library.RESET);
            System.out.println("The value of this container is $" + Library.GREEN + formattedContValue + Library.RESET);
            System.out.println("Each " + Library.CYAN + productType + Library.RESET + " should be priced at $" + Library.GREEN + formattedItemPrice + Library.RESET);

            // Confirm with user whether they would like to add another product or simply end the program
            System.out.println();
            System.out.println("Would you like to add another product (y/n):");
            String continueProgram = Library.input.nextLine();
            // End program based on user input
            if(continueProgram.equalsIgnoreCase("n")){ 
                // if the input is no, set the condition for the loop to be false
                enterAnotherProduct = false;
            }
        }
    }//end run

}//end class


