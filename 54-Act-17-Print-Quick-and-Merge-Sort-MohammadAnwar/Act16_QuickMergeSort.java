import java.util.ArrayList;
import java.util.Arrays;

class Act16_QuickMergeSort {
    public static void run() {
        ArrayList<Integer> integers = new ArrayList();
        integers.addAll(Arrays.asList(9, 2, 3, 1, 11, 5, 8, 6, 4, 15, 0, 1111, -18, 90));
        ArrayList<Integer> intMergeSorted = RecursiveSorts.MergeSortIntegers(integers);
        System.out.println("Merge Sorted Integers: " + intMergeSorted);

        ArrayList<Integer> integers2 = new ArrayList();
        integers2.addAll(Arrays.asList(9, 2, 3, 1, 11, 5, 8, 6, 4, 15, 0, 1111, -18, 90));
        RecursiveSorts.QuickSortIntegers(integers2, 0, integers.size());
        System.out.println("Quick Sorted Integers: " + integers2);

    }
}