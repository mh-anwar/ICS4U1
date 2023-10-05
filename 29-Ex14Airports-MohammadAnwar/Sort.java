import java.util.ArrayList;

class Sort {
 
    public static void bubbleSortStrings(ArrayList<String> list) {
        boolean swap = true;
        while (swap){
            swap = false;
            for(int i=0; i<list.size()-1; i++  ){
                if( list.get(i).compareToIgnoreCase( list.get(i+1) )   > 0     ){
                    swap = true;
                    String temp = list.get(i);
                    list.set(i,  list.get(i+1)  );
                    list.set(i+1, temp);   



                    
                }            
            }//for         
        }//while
    }// end bubbleSortStrings

    public static void bubbleSortDoubles(ArrayList<Double> list) {
        boolean swap = true;
        while (swap){
            swap = false;
            for(int i=0; i<list.size()-1; i++  ){
                if( list.get(i) > list.get(i+1)   ){
                    swap = true;
                    Double temp = list.get(i);
                    list.set(i,  list.get(i+1)  );
                    list.set(i+1, temp);                  
                }            
            }//for         
        }//while
    }// end bubbleSortDoubles

    public static void bubbleSortIntegers(ArrayList<Integer> list) {
        boolean swap = true;
        while (swap){
            swap = false;
            for(int i=0; i<list.size()-1; i++  ){
                if( list.get(i) > list.get(i+1)   ){
                    swap = true;
                    Integer temp = list.get(i);
                    list.set(i,  list.get(i+1)  );
                    list.set(i+1, temp);                  
                }            
            }//for         
        }//while
    }// end bubbleSortIntegers
}//end Sort Class
