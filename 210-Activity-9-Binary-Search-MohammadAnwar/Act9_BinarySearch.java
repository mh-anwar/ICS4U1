import java.util.ArrayList;

class Act9_BinarySearch{
    public static void run(){
        // 4. Load all three lists into their own ArrayLists.
        ArrayList<String> allCreatures = Files.loadStringList("data/animals.txt");
        ArrayList<String> allCategories = Files.loadStringList("data/categories.txt");
        ArrayList<Double> allWeights = Files.loadDoubleList("data/weights.txt");
        // Have a variable store whether user is exiting or not
        boolean userExit = false;
        // Instead of asking if the user wants to search again, add a while loop so that automatically loops back up and asks for the next sea creature.  
        while(userExit == false){
            System.out.println();
            System.out.println("A list of all the creatures: ");
            // 5. Print out the first list only (just the creature's names).
            for(int i = 0; i < allCreatures.size(); i++){
                System.out.println(i+1 + ". " + allCreatures.get(i));
            }
            // 6. Ask the user to enter a creature from your first list.
            System.out.println();
            System.out.print("Enter a creature from the list: ");
            String creatureToFind = Library.input.nextLine();
            
            // If the user enters ‘exit’ instead of a sea creature name, it exits smoothly (without saying not found).  
            if (creatureToFind.equalsIgnoreCase("exit")){
                userExit = true; // This actually has no effect, but if the variable needs to be used later on, it can be used
                return;
            }
            // Sort all three parallel arraylists
            sortByCreatures(allCreatures, allCategories, allWeights);
            
            // 7. Search the creatures ArrayList using the Binary Search method.
            int creatureIndex = Search.binarySearchStrings(allCreatures, creatureToFind);
            
            // If the creature is found (creatureIndex isn't -1), say “I found it.  A _____ is a ____ and its average weight is ______ kg. ”.  
            if(creatureIndex != -1){
                // Get all properties of this animal
                String animal = allCreatures.get(creatureIndex);
                String animalCategory = allCategories.get(creatureIndex);
                Double animalWeight = allWeights.get(creatureIndex);
                
                // You need to check if the animal starts with a vowel.  If it does, it should say “An Orca” and if it doesn’t it should say “A Tiger”.
                Character animalFirstLetter = Character.toLowerCase(animal.charAt(0));
                if(animalFirstLetter == 'a' || animalFirstLetter == 'e' || animalFirstLetter == 'i' || animalFirstLetter == 'o' || animalFirstLetter == 'u'){
                    System.out.println("I found it. An " + animal + " is a " + animalCategory + " and its average weight is " + animalWeight + " kg");
                } else {
                    System.out.println("I found it. A " + animal + " is a " + animalCategory + " and its average weight is " + animalWeight + " kg");
                }
            } else {
                // If not found, output appropriate message
                System.out.println("I am sorry this creature is not in our list.  Please try again later");
            }
        }

    }//run
  public static void sortByCreatures(ArrayList<String> allCreatures, ArrayList<String> allCategories, ArrayList<Double> allWeights) {
        // Hold swap 
        boolean swap = true;
        while (swap){
            swap = false;
            // Loop through the first arraylist
            for(int i = 0; i < allCreatures.size() - 1; i++){
                // If the current index is greater than the next index (in alphabetical order)
                if(allCreatures.get(i).compareToIgnoreCase(allCreatures.get(i+1)) > 0){
                    swap = true;
                    // Switch places of the current and next index in all three arrays
                    String creatureTemp = allCreatures.get(i);
                    allCreatures.set(i,  allCreatures.get(i+1));
                    allCreatures.set(i+1, creatureTemp); 
                    
                    String categoryTemp = allCategories.get(i);
                    allCategories.set(i,  allCategories.get(i+1));
                    allCategories.set(i+1, categoryTemp); 
                    
                    Double weightTemp = allWeights.get(i);
                    allWeights.set(i, allWeights.get(i+1));
                    allWeights.set(i+1, weightTemp);                    
                }            
            }//for         
        }//while
    }
}//class
