import java.util.ArrayList;
import java.util.Arrays;

class Act16_QuickMergeSort {
    public static void run() {
        // lists for selection sort
        ArrayList<Integer> integers = new ArrayList();
        ArrayList<Double> doubles = new ArrayList();
        ArrayList<String> strings = new ArrayList();

        integers.addAll(Arrays.asList(9, 2, 3, 1, 11, 5, 8, 6, 4, 15, 0, 1111, -18, 90));
        doubles.addAll(Arrays.asList(0.1, -9.9, 100.2, 5.42, 5.41, 64.3, 0.7, -16.3, 4.4, 6.5, 1200.9, -9.91, 0.0));
        strings.addAll(Arrays.asList("pear", "apple", "banana", "watermelon", "orange", "kiwi", "blueberry",
                "strawberry", "coconut", "grape", "apple"));

        ArrayList<Integer> intMergeSorted = RecursiveSorts.MergeSortIntegers(integers);
        System.out.println("Merge Sorted Integers: " + intMergeSorted);

        ArrayList<Double> doubleMergeSorted = RecursiveSorts.MergeSortDoubles(doubles);
        System.out.println("Merge Sorted Doubles: " + doubleMergeSorted);

        ArrayList<String> stringsMergeSorted = RecursiveSorts.MergeSortStrings(strings);
        System.out.println("Merge Sorted Strings: " + stringsMergeSorted);

        System.out.println();
        // lists for insertion sort
        ArrayList<Integer> integers2 = new ArrayList();
        ArrayList<Double> doubles2 = new ArrayList();
        ArrayList<String> strings2 = new ArrayList();

        integers2.addAll(Arrays.asList(9, 2, 3, 1, 11, 5, 8, 6, 4, 15, 0, 1111, -18, 90));
        doubles2.addAll(Arrays.asList(0.1, -9.9, 100.2, 5.42, 5.41, 64.3, 0.7, -16.3, 4.4, 6.5, 1200.9, -9.91, 0.0));
        strings2.addAll(Arrays.asList("pear", "apple", "banana", "watermelon", "orange", "kiwi", "blueberry",
                "strawberry", "coconut", "grape", "apple"));

        RecursiveSorts.QuickSortIntegers(integers2, 0, integers.size());
        System.out.println("Quick Sorted Integers: " + integers2);

        RecursiveSorts.QuickSortDoubles(doubles2, 0, doubles2.size());
        System.out.println("Quick Sorted Doubles: " + doubles2);

        RecursiveSorts.QuickSortStrings(strings2, 0, strings2.size());
        System.out.println("Quick Sorted Strings: " + strings2);
    }
}