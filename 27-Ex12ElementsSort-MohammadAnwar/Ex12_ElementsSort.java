import java.util.ArrayList;

class Ex12_ElementsSort{
    public static void run(){
        ArrayList<String> sciTeachers = new ArrayList();
        sciTeachers.add("Chan");
        sciTeachers.add("Foshay");
        sciTeachers.add("Feddema");
        sciTeachers.add("Snowden");
        sciTeachers.add("May");
        
        System.out.println(sciTeachers);
        Sort.bubbleSortStrings(sciTeachers);
        System.out.println(sciTeachers);


        ArrayList<String> elements = Files.loadStringList("data/enames.txt");
        // System.out.println(elements);
        ArrayList<Double> weights  = Files.loadDoubleList("data/weights.txt");

        System.out.println("Sorted by name");

        bubbleSortByName(elements, weights);
        for(int i=0; i<elements.size(); i++){
            System.out.println( elements.get(i) + "  " + weights.get(i)  );
			//Something has gone wrong with the sorting...
			
        }//end forLoop

    }//run

    public static void bubbleSortByName(ArrayList<String> elements, ArrayList<Double> weights) {
        boolean swap = true;
        while (swap == true) {
            swap = false;
            for (int i = 0; i < elements.size() - 1; i++) {
                if (elements.get(i).compareToIgnoreCase(elements.get(i + 1)) > 0) {
                    swap = true;
                    String temp = elements.get(i);
                    elements.set(i, elements.get(i + 1));
                    elements.set(i + 1, temp);
                    
                    Double temp2 = weights.get(i);
                    weights.set(i, weights.get(i + 1));
                    weights.set(i + 1, temp2);
                }
            }
        }
    }// end bubbleSortStrings
    

    
}//class
