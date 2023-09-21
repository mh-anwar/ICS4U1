import java.text.DecimalFormat;
class Act3_Airfare{
    public static void run(){
        // Initialize program variables
        int numTravelers;
        boolean isMember;
        String city;
        String ticketclass;
        String travelDay;
        int age;
        double ticketDiscount = 0;
        double eachTicket = 0;
        double totalPrice;
        DecimalFormat df = new DecimalFormat("#.00");
        
        // get number of travellers in users' party
        System.out.println("How many travelers in your party?");
        numTravelers = Library.input.nextInt();
        Library.input.nextLine();
        // find out if user is part of bucklandair, apply appropriate discount
        System.out.println();
        System.out.println("Are you a member of BucklandAir? (true or false)");
        isMember = Library.input.nextBoolean();
        Library.input.nextLine();
        ticketDiscount = isMember(isMember);
        // find out where user is travelling
        System.out.println();
        System.out.println("Where are you travelling?");
        city = Library.input.nextLine();
        // find out what class of ticket the user wants
        System.out.println();
        System.out.println("What class of ticket (first, business, economy)");
        ticketclass = Library.input.nextLine();
        // find out what day of the week the user is going on
        System.out.println();
        System.out.println("What day of the week are you going on?");
        travelDay = Library.input.nextLine();   
        // find out the user's age for the appropriate discount to be applied
        System.out.println();
        System.out.println("How old are you?");
        age = Library.input.nextInt();
        Library.input.nextLine();
        ticketDiscount += seniorDiscount(age);

        // Apply appropraite prices based on destination, ticket class and amount for the day
        eachTicket = destinationAmount(city);
        eachTicket += classAmount(ticketclass);
        eachTicket += dayAmount(travelDay);
        // Apply ticket discount based on membership and seniority
        eachTicket -= ticketDiscount;
        // Calculate total price based on amount of travellers
        totalPrice = eachTicket * numTravelers;

        // Output ticket and total price
        System.out.println();
        System.out.println("Each ticket is $" + df.format(eachTicket) );
        System.out.println("For all the passengers, the total price is: $" + df.format(totalPrice));
        
    }//run

    public static double classAmount(String ticketclass){
        // Return appropriate price based on whether is taking economy or first class
        if (ticketclass.equalsIgnoreCase("Economy")){
            return 100;
        } else if (ticketclass.equalsIgnoreCase("First")){
            return 700;
        } else{
            // If neither class is being taken, then it is business class, return appropriate price
            return 400;
        }
    }//classamount

    public static double destinationAmount( String city ){
        // Initialize parallel arrays with cities and distances from Toronto to them
        String[] destinations = {"Edmonton", "Cancun","Calgary", "Vancouver", "Montreal", "Quebec City", "Whitby"};
        double[] distances = {3297.8, 5261.0, 3239.1, 4206.2, 542.3, 806.4, 56.2};
        // Find the city position in the array
        int distanceIndex = 0;
        // Let's just implement search...sigh
        for (int i = 0; i < destinations.length; i++){
            if(destinations[i].equalsIgnoreCase(city)){
                distanceIndex = i;
                break;
            }
        }
        // Return the element in the `distances` array that corresponds to the index in the destinations array, this return the correct pricing/distance for that city
        return distances[distanceIndex];
    }//destinationAmount

	
	   
 	public static double dayAmount(String travelDay) {
        // Initialize base day price
        double dayPrice = 40;
        // If the day is saturday, sunday or friday apply appropriate prices
       if (travelDay.equalsIgnoreCase("saturday") || travelDay.equalsIgnoreCase("sunday")){
           dayPrice = 100;
       }  else if (travelDay.equalsIgnoreCase("friday")){
           dayPrice = 80;
       }
        // Otherwise return the initialized price
	   return dayPrice; 
    }// end dayAmount

	public static double isMember(Boolean member) {
        // initialize member discount
       double memberDiscount = 0;
        if (member){
            // If the user is a member > set member discount
           memberDiscount = 100;
       } else {
            // If user is not member, ask them if they would like to be
            System.out.println("Would you like to be a member? (y/n)");
            String wantToBeMember = Library.input.nextLine();
            // If the user wants to be a member set their discount to $50 or else do not change the member discount
            if(wantToBeMember.equalsIgnoreCase("y")){
                System.out.println("Danke! We appreciate your sign up?");
                memberDiscount = 50;
            }
       }
	   return memberDiscount;
    }// end dayAmount

    public static double seniorDiscount(int age){
        // initialize seniority discount
        double seniorityDiscount = 0;
        // Based on the user's age, greater than 80, 70, or 60 apply the appropraite discount
        if (age > 80){
            seniorityDiscount = 150;
        } else if (age > 70){
            seniorityDiscount = 50;
        } else if (age > 60){
            seniorityDiscount = 25;
        }
        return seniorityDiscount;
        
    }
}//end class