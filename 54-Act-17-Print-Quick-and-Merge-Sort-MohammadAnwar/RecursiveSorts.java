import java.util.ArrayList;

class RecursiveSorts {
    public static int level = 0;

    // Complete the Quick sorts for Strings, Doubles and Integers
    public static void QuickSortIntegers(ArrayList<Integer> list, int low, int high) {
        if (low < high) {
            level += 1;
            int pivot = PartitionIntegers(list, low, high);
            System.out.println("Array after swaps: " + Library.TEXT_PURPLE + list + Library.TEXT_RESET);
            System.out.println();
            QuickSortIntegers(list, low, pivot);
            QuickSortIntegers(list, pivot + 1, high);

        }
    }

    public static int PartitionIntegers(ArrayList<Integer> list, int low, int high) {
        int pivot = list.get(low);
        int leftwall = low;

        ArrayList<Integer> firstSwitch = new ArrayList<Integer>();
        ArrayList<Integer> secondSwitch = new ArrayList<Integer>();

        System.out.println(
                "Level " + Library.TEXT_CYAN + level + Library.TEXT_RESET + " at Pivot: "
                        + Library.TEXT_CYAN + pivot + Library.TEXT_RESET);
        System.out.println("- Initial list: " + Library.TEXT_GREEN + list + Library.TEXT_RESET);

        System.out.print("- The list is: [");

        for (int i = low + 1; i < high; i++) {
            if (list.get(i) < pivot) {
                System.out.print(Library.TEXT_BLUE + list.get(i) + Library.TEXT_RESET + ",");
                leftwall += 1;
                int temp = list.get(i);

                firstSwitch.add(temp);
                secondSwitch.add(list.get(leftwall));

                list.set(i, list.get(leftwall));
                list.set(leftwall, temp);
            } else {
                System.out.print(Library.TEXT_BLUE + list.get(i) + Library.TEXT_RESET + ",");
            }

        }
        System.out.print("]");
        System.out.println();
        for (int i = 0; i < firstSwitch.size(); i++) {
            System.out.println(
                    "- Swap: " + firstSwitch.get(i) + " and " + secondSwitch.get(i) + " based on pivot " + pivot);
        }

        System.out.println();

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
        System.out.println();
        System.out.println("Initial List: " + Library.TEXT_GREEN + list + Library.TEXT_RESET);
        for (int i = 0; i < list.size() / 2; i++) {
            arr1.add(list.get(i));
        }

        for (int i = list.size() - 1; i >= list.size() / 2; i--) {
            arr2.add(list.get(i));
        }
        System.out.println("- Split into: " + Library.TEXT_RED + arr1 + Library.TEXT_RESET + " " + Library.TEXT_RED
                + arr2 + Library.TEXT_RESET);
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
        // The e is on purpose
        System.out.println("- Sorte into: " + Library.TEXT_BLUE + c + Library.TEXT_RESET);
        return c;
    }

}