import java.util.ArrayList;
import java.util.Arrays;

class RecursiveSorts {

    // Complete the Quick sorts for Strings, Doubles and Integers
    public static void QuickSortIntegers(ArrayList<Integer> list, int low, int high) {
        if (low < high) {
            int pivot = PartitionIntegers(list, low, high);
            QuickSortIntegers(list, low, pivot);
            QuickSortIntegers(list, pivot + 1, high);
        }
    }

    public static int PartitionIntegers(ArrayList<Integer> list, int low, int high) {
        int pivot = list.get(low);
        int leftwall = low;

        for (int i = low + 1; i < high; i++) {

            if (list.get(i) < pivot) {
                leftwall += 1;

                int temp = list.get(i);
                list.set(i, list.get(leftwall));
                list.set(leftwall, temp);
            }
        }
        list.set(low, list.get(leftwall));
        list.set(leftwall, pivot);
        return leftwall;
    }

    public static void QuickSortDoubles(ArrayList<Double> list, int low, int high) {
        if (low < high) {
            int pivot = PartitionDoubles(list, low, high);
            QuickSortDoubles(list, low, pivot);
            QuickSortDoubles(list, pivot + 1, high);
        }
    }

    public static int PartitionDoubles(ArrayList<Double> list, int low, int high) {
        double pivot = list.get(low);
        int leftwall = low;

        for (int i = low + 1; i < high; i++) {

            if (list.get(i) < pivot) {
                leftwall += 1;

                double temp = list.get(i);
                list.set(i, list.get(leftwall));
                list.set(leftwall, temp);
            }
        }
        list.set(low, list.get(leftwall));
        list.set(leftwall, pivot);
        return leftwall;
    }

    public static void QuickSortStrings(ArrayList<String> list, int low, int high) {
        if (low < high) {
            int pivot = PartitionStrings(list, low, high);
            QuickSortStrings(list, low, pivot);
            QuickSortStrings(list, pivot + 1, high);
        }
    }

    public static int PartitionStrings(ArrayList<String> list, int low, int high) {
        String pivot = list.get(low);
        int leftwall = low;

        for (int i = low + 1; i < high; i++) {

            if (list.get(i).compareToIgnoreCase(pivot) < 0) {
                leftwall += 1;

                String temp = list.get(i);
                list.set(i, list.get(leftwall));
                list.set(leftwall, temp);
            }
        }
        list.set(low, list.get(leftwall));
        list.set(leftwall, pivot);
        return leftwall;
    }

    // Complete the Merge sorts for Strings, Doubles and Integers
    public static ArrayList<Integer> MergeSortIntegers(ArrayList<Integer> list) {
        int n = list.size();

        if (n <= 1) {
            // It has been sorted
            return list;
        }
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        for (int i = 0; i < list.size() / 2; i++) {
            arr1.add(list.get(i));
        }

        for (int i = list.size() - 1; i >= list.size() / 2; i--) {
            arr2.add(list.get(i));
        }
        arr1 = MergeSortIntegers(arr1);
        arr2 = MergeSortIntegers(arr2);

        return MergeIntegers(arr1, arr2);
    }

    public static ArrayList<Integer> MergeIntegers(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> c = new ArrayList<Integer>();

        while (a.size() > 0 && b.size() > 0) {
            if (a.get(0) > b.get(0)) {
                c.add(b.get(0));
                b.remove(b.get(0));
            } else {
                c.add(a.get(0));
                a.remove(a.get(0));
            }
        }

        while (a.size() > 0) {
            c.add(a.get(0));
            a.remove(a.get(0));
        }

        while (b.size() > 0) {
            c.add(b.get(0));
            b.remove(b.get(0));
        }

        return c;
    }

    public static ArrayList<Double> MergeSortDoubles(ArrayList<Double> list) {
        int n = list.size();

        if (n <= 1) {
            // It has been sorted
            return list;
        }
        ArrayList<Double> arr1 = new ArrayList<Double>();
        ArrayList<Double> arr2 = new ArrayList<Double>();
        for (int i = 0; i < list.size() / 2; i++) {
            arr1.add(list.get(i));
        }

        for (int i = list.size() - 1; i >= list.size() / 2; i--) {
            arr2.add(list.get(i));
        }
        arr1 = MergeSortDoubles(arr1);
        arr2 = MergeSortDoubles(arr2);

        return MergeDoubles(arr1, arr2);
    }

    public static ArrayList<Double> MergeDoubles(ArrayList<Double> a, ArrayList<Double> b) {
        ArrayList<Double> c = new ArrayList<Double>();

        while (a.size() > 0 && b.size() > 0) {
            if (a.get(0) > b.get(0)) {
                c.add(b.get(0));
                b.remove(b.get(0));
            } else {
                c.add(a.get(0));
                a.remove(a.get(0));
            }
        }

        while (a.size() > 0) {
            c.add(a.get(0));
            a.remove(a.get(0));
        }

        while (b.size() > 0) {
            c.add(b.get(0));
            b.remove(b.get(0));
        }

        return c;
    }

    public static ArrayList<String> MergeSortStrings(ArrayList<String> list) {
        int n = list.size();

        if (n <= 1) {
            // It has been sorted
            return list;
        }
        ArrayList<String> arr1 = new ArrayList<String>();
        ArrayList<String> arr2 = new ArrayList<String>();
        for (int i = 0; i < list.size() / 2; i++) {
            arr1.add(list.get(i));
        }

        for (int i = list.size() - 1; i >= list.size() / 2; i--) {
            arr2.add(list.get(i));
        }
        arr1 = MergeSortStrings(arr1);
        arr2 = MergeSortStrings(arr2);

        return MergeStrings(arr1, arr2);
    }

    public static ArrayList<String> MergeStrings(ArrayList<String> a, ArrayList<String> b) {
        ArrayList<String> c = new ArrayList<String>();

        while (a.size() > 0 && b.size() > 0) {
            if (a.get(0).compareToIgnoreCase(b.get(0)) > 0) {
                c.add(b.get(0));
                b.remove(b.get(0));
            } else {
                c.add(a.get(0));
                a.remove(a.get(0));
            }
        }

        while (a.size() > 0) {
            c.add(a.get(0));
            a.remove(a.get(0));
        }

        while (b.size() > 0) {
            c.add(b.get(0));
            b.remove(b.get(0));
        }

        return c;
    }

}