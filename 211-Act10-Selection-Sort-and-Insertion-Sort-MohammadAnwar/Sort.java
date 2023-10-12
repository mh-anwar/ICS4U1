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
                if(list.get(i) > list.get(i+1)){
                    swap = true;
                    Integer temp = list.get(i);
                    list.set(i,  list.get(i+1)  );
                    list.set(i+1, temp);                  
                }            
            }//for         
        }//while
    }// end bubbleSortIntegers

//Add Selection sorts for strings, doubles and integers
    public static void selectionSortStrings(ArrayList<String> list) {
        int size = list.size();
        for (int i = 0; i < size - 1; i ++ ){
            int firstMin = i;
            for(int j = i + 1; j < size;  j++){
                if(list.get(j).compareToIgnoreCase(list.get(firstMin)) < 0){
                    firstMin = j;
                }
            }
            if(firstMin != i){
                String temp = list.get(i);
                list.set(i,  list.get(firstMin));
                list.set(firstMin, temp);     
            }
        }
    }// end selectionSortStrings
    
    public static void selectionSortDoubles(ArrayList<Double> list) {
        int size = list.size();
        for (int i = 0; i < size - 1; i ++ ){
            int firstMin = i;
            for(int j = i + 1; j < size;  j++){
                if(list.get(j) < list.get(firstMin)){
                    firstMin = j;
                }
            }
            if(firstMin != i){
                Double temp = list.get(i);
                list.set(i,  list.get(firstMin));
                list.set(firstMin, temp);     
            }
        }
    }// end selectionSortDoubles
    public static void selectionSortIntegers(ArrayList<Integer> list) {
        int size = list.size();
        for (int i = 0; i < size - 1; i ++ ){
            int firstMin = i;
            for(int j = i + 1; j < size;  j++){
                if(list.get(j) < list.get(firstMin)){
                    firstMin = j;
                }
            }
            if(firstMin != i){
                Integer temp = list.get(i);
                list.set(i,  list.get(firstMin));
                list.set(firstMin, temp);     
            }
        }
    }// end selectionSortIntegers

    
//Add Insertion sorts for strings, doubles and integers
    public static void insertionSortStrings(ArrayList<String> list) {
        int size = list.size();
        for(int i = 1; i < size ; i ++){
            int pointerOne = i;
            while(pointerOne > 0 && list.get(pointerOne - 1).compareToIgnoreCase(list.get(pointerOne)) > 0){
                String temp = list.get(pointerOne);
                list.set(pointerOne,  list.get(pointerOne -1));
                list.set(pointerOne - 1, temp);
                pointerOne -= 1;
            }
        }
    }// end selectionSortStrings
    public static void insertionSortDoubles(ArrayList<Double> list) {
        int size = list.size();
        for(int i = 1; i < size ; i ++){
            int pointerOne = i;
            while(pointerOne > 0 && list.get(pointerOne - 1) > list.get(pointerOne)){
                Double temp = list.get(pointerOne);
                list.set(pointerOne,  list.get(pointerOne -1));
                list.set(pointerOne - 1, temp);
                pointerOne -= 1;
            }
        }
    }// end selectionSortDoubles
    public static void insertionSortIntegers(ArrayList<Integer> list) {
        int size = list.size();
        for(int i = 1; i < size ; i ++){
            int pointerOne = i;
            while(pointerOne > 0 && list.get(pointerOne - 1) > list.get(pointerOne)){
                Integer temp = list.get(pointerOne);
                list.set(pointerOne,  list.get(pointerOne -1));
                list.set(pointerOne - 1, temp);
                pointerOne -= 1;
            }
        }
    }// end selectionSortIntegers
}//end Sort Class
