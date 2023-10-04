import java.util.ArrayList;

class Ex14_Airports{
    public static void run(){

        ArrayList<String> allAirports = Files.loadStringList( "data/airport/air.txt"  );
        ArrayList<Integer> allPassengers = Files.loadIntegerList( "data/airport/passengers.txt"  );

        sortByAirportNames(allPassengers, allAirports);
        
        System.out.println("What airport code do you want?");
        String airportToFind = Library.input.nextLine();

        int foundIndex = Search.binarySearchStrings( allAirports, airportToFind  );
        if(foundIndex == -1){
            System.out.println("Not found");
        } else {
            System.out.println( allAirports.get(foundIndex) + " had " + allPassengers.get(foundIndex) + " passengers in 2016");
        }
        
        
    }//run

public static void sortByAirportNames(ArrayList<Integer> passengers, ArrayList<String> names   ) {
        boolean swap = true;
        while (swap){
            swap = false;
            for(int i=0; i<passengers.size()-1; i++  ){
                if( names.get(i).compareToIgnoreCase( names.get(i+1) )   > 0     ){
                    swap = true;
                    Integer temp = passengers.get(i);
                    passengers.set(i,  passengers.get(i+1)  );
                    passengers.set(i+1, temp); 
                    
                    String nameTemp = names.get(i);
                    names.set(i, names.get(i+1));
                    names.set(i+1, nameTemp);                    
                }            
            }//for         
        }//while
    }// end sortByGoals

    
}//class
