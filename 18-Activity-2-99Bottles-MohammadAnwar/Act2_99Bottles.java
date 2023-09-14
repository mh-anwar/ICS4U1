import java.util.Arrays;
import java.util.ArrayList;
class Act2_99Bottles {
    public static void run() {
        // This is extremely repetitive code, I could probably optimize it....
        
        // Initialize arraylists
        final ArrayList<String> FRIENDS_NAMES = new ArrayList<>(
                              Arrays.asList("mo", "reese", "dave", "ryan", "sharvesh"));                      
        final ArrayList<String> FRIENDS_DRINKS = new ArrayList<>(
                              Arrays.asList("gingerale", "coke", "crush", "sprite", "fanta"));
        // Initialize friend name and their drink
        String friendName = "";
        String userDrink = "";
        
        // Name verification system
        System.out.println("What's your name?");
        String name = Library.input.nextLine().toLowerCase();
        // Age verification system
        System.out.println("How old are you?");
        int age = Library.input.nextInt();
        Library.input.nextLine();

        // Process name and age to get drink
        if(FRIENDS_NAMES.indexOf(name) != -1){
            // If the user is a friend, set it based on their preferred drink
            int friendIndex = FRIENDS_NAMES.indexOf(name);
            friendName = name;
            userDrink = FRIENDS_DRINKS.get(friendIndex);
        } else{
            // Set item based on age, if user is not friend
    		if (age >= 18 ){
                // Ask them whether they like pop or beer
    			System.out.println("Would you like pop or beer? (p/b)");
            	String option = Library.input.nextLine();
                // Set their drink based on their input
    			if (option.equalsIgnoreCase("p")){
    				userDrink = "pop";
    			} else {
    				userDrink = "beer";
    			}
    		} else {
                // If they are younger than 10 or not, set their drink
    			userDrink = age <= 10 ? "vegan milk": "pop";
    		}
        }
        // If the friendName is existent
        if (friendName != ""){
            // Output their favorite drink
            System.out.println(friendName + "favorite pop is " + userDrink);

            // Output friend lyrucs
            for (int bottles = 99; bottles > 1; bottles--) {
                System.out.println(bottles + " bottles of " + userDrink + " on the wall");
                System.out.println("If " + friendName + " should drink one of those bottles of "  + userDrink + "...");
                System.out.println();
            }
        } else{
            // Output normal lyrics
            for (int bottles = 99; bottles > 1; bottles--) {
                System.out.println(bottles + " bottles of " + userDrink + " on the wall, " + bottles + " bottles of " + userDrink + ".");
                System.out.println("Take one down and pass it around, " + bottles + " bottles of " + userDrink + " on the wall.");
                System.out.println();
            }
        }
        // Output the final, 1 bottle and 0 bottles text
        System.out.println("1 bottle of " + userDrink + " on the wall, 1 bottle of " + userDrink + ".");
		System.out.println("Take one down and pass it around, 1 bottle of " + userDrink + " on the wall.");
		System.out.println();
		
        System.out.println(
                "No more bottles of  " + userDrink + " on the wall, no more bottles of " + userDrink + ".\nGo to the store and buy some more, 99 bottles of " + userDrink + " on the wall.");

    }// end run

}// end class