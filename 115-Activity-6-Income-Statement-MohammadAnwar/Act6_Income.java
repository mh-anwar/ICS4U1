class Act6_Income{
	public static void run(){
		// Initialize program arrays
		String[] revNames = {"Meat Department", "Deli Department", "Clothing Department", "Baby Department", "Medical Department"};
		String[] expNames = {"Rent", "Gasoline", "Cleaning", "Marketing", "Electricity"};
		// Revenue should actually be in some double-long format...
		// Yes, baby dept. makes more than clothing dept. baby food is expensive
		double[] revDollars = {50573.97, 27953.67, 16983.35, 22978.21, 29060.43};
		double[] expDollars = {10060.45, 7089.27, 2008.34, 5560.90, 9870.6};
		
		final double TAX_RATE = 0.122;

		// Beginning of program output
		// Get the revenue the user wants to update
		System.out.println(Library.TEXT_PURPLE + "What revenue would you like to update?"+ Library.TEXT_RESET);
        String revItem = Library.input.nextLine();
		
		// Get the index in the revNames array and get the item revenue from the revDollars array
		int revItemIndex = Library.stringSearch(revNames, revItem);
        double revItemSales = revDollars[revItemIndex];
		
		System.out.println();
		// Output the current item revenue and ask what the new value is
		System.out.println(Library.TEXT_BLUE + "The current value of " + revItem + " is: $" + revItemSales+ Library.TEXT_RESET);
		System.out.println(Library.TEXT_PURPLE + "What are the new sales of " + revItem + " to?"+ Library.TEXT_RESET);
        double updatedRevenueValue = Library.input.nextDouble();
        Library.input.nextLine();
		
		// Actually update the revenue of that item
		revDollars[revItemIndex] += updatedRevenueValue;
		System.out.println(Library.TEXT_YELLOW + "Income Statment for Mohammad's Average Grocery:" + Library.TEXT_RESET);
		// Loop through revNames array, print revNames:revDollars
		System.out.println(Library.TEXT_YELLOW + "Revenues for this Year:" + Library.TEXT_RESET );
		for(int i = 0; i < revNames.length; i ++){	
			// Depending on how high the revenue is, change the color
			if(revDollars[i] > 10000){
				System.out.println(Library.TEXT_GREEN + revNames[i] + " : $" + revDollars[i] + Library.TEXT_RESET);
			} else {
				System.out.println(Library.TEXT_RED + revNames[i] + " : $" + revDollars[i]+ Library.TEXT_RESET);
			}
		}
		// Get the total revenue and output it
		double totalRevenue = totalArray(revDollars);
		System.out.println(Library.TEXT_GREEN + "Total Revenue for this year: $" + Library.myRound(totalRevenue, 2) + Library.TEXT_RESET);
		System.out.println();
		
		// Loop through expNames array, print expNames:expDollars
		System.out.println(Library.TEXT_YELLOW + "Expenses for this Year:"+ Library.TEXT_RESET);
		for(int i = 0; i < expNames.length; i ++){
			// Depending on how high the expense is, change the color
			if(expDollars[i] > 20000){
				System.out.println(Library.TEXT_GREEN + expNames[i] + " : $" + expDollars[i]+ Library.TEXT_RESET);
			} else {
				System.out.println(Library.TEXT_RED + expNames[i] + " : $" + expDollars[i]+ Library.TEXT_RESET);
			}
		}
		// Total the expenses and output it
		double totalExpenses = totalArray(expDollars);
		System.out.println(Library.TEXT_YELLOW + "Total Expenses for this year: $" + Library.myRound(totalExpenses, 2) + Library.TEXT_RESET);
		
		System.out.println();
		
		// Output net income
		double netIncome = totalRevenue - totalExpenses;
		System.out.println(Library.TEXT_BLUE + "Net Income: $" + Library.myRound(netIncome, 2)+ Library.TEXT_RESET);
		// Calculate and output calculated taxes on income
		double calculatedTaxes = netIncome * TAX_RATE; //12.2% taxes (prov + fed)
		System.out.println(Library.TEXT_RED +"Taxes (" + TAX_RATE * 100 + "%): $" + Library.myRound(calculatedTaxes, 2)+ Library.TEXT_RESET);
		// Calculate and output the total profit
		double taxedProfit = netIncome - calculatedTaxes;
		System.out.println(Library.TEXT_BLUE +"Profit after taxes: $" + Library.myRound(taxedProfit, 2)+ Library.TEXT_RESET);

	}//end run


	public static double totalArray (double[] arr){
		double total = 0;
		// just loop thru the array and add each double
		for(int i = 0; i < arr.length; i ++){
			total += arr[i];
		}
		return total;
	}//totalArray

}//end class