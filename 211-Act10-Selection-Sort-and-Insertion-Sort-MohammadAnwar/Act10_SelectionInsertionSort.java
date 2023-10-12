import java.util.ArrayList;
import java.util.Arrays;

class Act10_SelectionInsertionSort {
    public static void run() {
        ArrayList intsTest1 = new ArrayList<Integer>(
                Arrays.asList(2, 4, 9, 0, 1231, -5, 5, 2,  7)
        );
        ArrayList doublesTest1 = new ArrayList<Double>(
                Arrays.asList(3.6, 9.2, -2.1, -0.1, 0.1, 0.0, 3.1, 4.9, 3.6, 1.2, 10.5)
        );
        ArrayList stringsTest1 = new ArrayList<String>(
                Arrays.asList("bo", "nonk", "yonder", "asdas", "grsfg", "bo", "hgf", "gong", "0", " ")
        );
        System.out.println("Selection Sort");
        Sort.selectionSortIntegers(intsTest1);
        System.out.println(intsTest1);

        Sort.selectionSortDoubles(doublesTest1);
        System.out.println(doublesTest1);

        Sort.selectionSortStrings(stringsTest1);
        System.out.println(stringsTest1);
        
        // Reset arrays
        intsTest1 = new ArrayList<Integer>(
                Arrays.asList(2, 4, 9, 0, 1231, -5, 5, 2,  7)
        );
        doublesTest1 = new ArrayList<Double>(
                Arrays.asList(3.6, 9.2, -2.1, -0.1, 0.1, 0.0, 3.1, 4.9, 3.6, 1.2, 10.5)
        );
        stringsTest1 = new ArrayList<String>(
                Arrays.asList("bo", "nonk", "yonder", "asdas", "grsfg", "bo", "hgf", "gong", "0", " ")
        );
        System.out.println();
        System.out.println("Insertion Sort");
        Sort.insertionSortIntegers(intsTest1);
        System.out.println(intsTest1);
        
        Sort.insertionSortDoubles(doublesTest1);
        System.out.println(doublesTest1);

        Sort.insertionSortStrings(stringsTest1);
        System.out.println(stringsTest1);

    }// run

}// class
