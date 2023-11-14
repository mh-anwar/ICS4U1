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

//Add Selection sorts for strings, doubles and integers
    public static void selectionSortStrings(ArrayList<String> list) {

      for (int i = 0; i < list.size() - 1; i++) {
          int minIndex = i;
          for (int j = i + 1; j < list.size(); j++) {
              if (list.get(j).compareToIgnoreCase(list.get(minIndex)) < 0) {
                  minIndex = j;
              }
          }
          if (minIndex != i) {
              String temp = list.get(i);
              list.set(i, list.get(minIndex));
              list.set(minIndex, temp);
          }
      }

    }// end selectionSortStrings
    public static void selectionSortDoubles(ArrayList<Double> list) {

      for (int i = 0; i < list.size() - 1; i++) {
          int minIndex = i;
          for (int j = i + 1; j < list.size(); j++) {
              if (list.get(j) < list.get(minIndex)) {
                  minIndex = j;
              }
          }
          if (minIndex != i) {
              Double temp = list.get(i);
              list.set(i, list.get(minIndex));
              list.set(minIndex, temp);
          }
      }

    }// end selectionSortDoubles
    public static void selectionSortIntegers(ArrayList<Integer> list) {

      for (int i = 0; i < list.size() - 1; i++) {
          int minIndex = i;
          for (int j = i + 1; j < list.size(); j++) {
              if (list.get(j) < list.get(minIndex)) {
                  minIndex = j;
              }
          }
          if (minIndex != i) {
              Integer temp = list.get(i);
              list.set(i, list.get(minIndex));
              list.set(minIndex, temp);
          }
      }

    }// end selectionSortIntegers


//Add Insertion sorts for strings, doubles and integers
    public static void insertionSortStrings(ArrayList<String> list) {

      for (int i = 1; i < list.size(); i++) {
          String key = list.get(i);
          int j = i - 1;
          while (j >= 0 && key.compareToIgnoreCase(list.get(j)) < 0) {
              list.set(j + 1, list.get(j));
              j--;
          }
          list.set(j + 1, key);
      }

    }// end selectionSortStrings
    public static void insertionSortDoubles(ArrayList<Double> list) {

      for (int i = 1; i < list.size(); i++) {
          Double key = list.get(i);
          int j = i - 1;
          while (j >= 0 && key < list.get(j)) {
              list.set(j + 1, list.get(j));
              j--;
          }
          list.set(j + 1, key);
      }

    }// end selectionSortDoubles
    public static void insertionSortIntegers(ArrayList<Integer> list) {

      for (int i = 1; i < list.size(); i++) {
              Integer key = list.get(i);
              int j = i - 1;
              while (j >= 0 && key < list.get(j)) {
                  list.set(j + 1, list.get(j));
                  j--;
              }
              list.set(j + 1, key);
          }

    }// end selectionSortIntegers
}//end Sort Class
