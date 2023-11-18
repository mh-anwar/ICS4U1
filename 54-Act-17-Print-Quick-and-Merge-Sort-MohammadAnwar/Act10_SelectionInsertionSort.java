    import java.util.ArrayList;
    import java.util.Arrays;

    class Act10_SelectionInsertionSort{
        public static void run(){

          // lists for selection sort
          ArrayList <Integer> integers = new ArrayList();
          ArrayList <Double> doubles = new ArrayList();
          ArrayList <String> strings = new ArrayList();

          integers.addAll(Arrays.asList(9, 2, 3, 1, 11, 5, 8, 6, 4, 15, 0, 1111, -18));
          doubles.addAll(Arrays.asList(0.1, -9.9, 100.2, 5.42, 5.41, 64.3, 0.7, -16.3, 4.4, 6.5, 1200.9, -9.91, 0.0));
          strings.addAll(Arrays.asList("pear", "apple", "banana", "watermelon", "orange", "kiwi", "blueberry", "strawberry", "coconut", "grape", "apple"));

          // lists for insertion sort
          ArrayList <Integer> integers2 = new ArrayList();
          ArrayList <Double> doubles2 = new ArrayList();
          ArrayList <String> strings2 = new ArrayList();

          integers2.addAll(Arrays.asList(9, 2, 3, 1, 11, 5, 8, 6, 4, 15, 0, 1111, -18));
          doubles2.addAll(Arrays.asList(0.1, -9.9, 100.2, 5.42, 5.41, 64.3, 0.7, -16.3, 4.4, 6.5, 1200.9, -9.91, 0.0));
          strings2.addAll(Arrays.asList("pear", "apple", "banana", "watermelon", "orange", "kiwi", "blueberry", "strawberry", "coconut", "grape", "apple"));

          // print out selection sorted lists
          System.out.println(Library.TEXT_RED + "\nSelection Sorts:" + Library.TEXT_RESET);
          System.out.println(Library.TEXT_BLUE + "\nBefore Sort:" + Library.TEXT_RESET);
          System.out.println("Integers: " + integers);
          System.out.println("Doubles: " + doubles);
          System.out.println("Strings: " + strings);

          // selection sorts
          Sort.selectionSortIntegers(integers);
          Sort.selectionSortDoubles(doubles);
          Sort.selectionSortStrings(strings);

          System.out.println(Library.TEXT_PURPLE + "\nAfter Sort:" + Library.TEXT_RESET);
          System.out.println("Integers: " + integers);
          System.out.println("Doubles: " + doubles);
          System.out.println("Strings: " + strings);



          // print out insertion sorted lists
          System.out.println(Library.TEXT_RED + "\nInsertion Sorts:" + Library.TEXT_RESET);
          System.out.println(Library.TEXT_BLUE + "\nBefore Sort:" + Library.TEXT_RESET);
          System.out.println("Integers: " + integers2);
          System.out.println("Doubles: " + doubles2);
          System.out.println("Strings: " + strings2);

          // insertion sorts
          Sort.insertionSortIntegers(integers2);
          Sort.insertionSortDoubles(doubles2);
          Sort.insertionSortStrings(strings2);

          System.out.println(Library.TEXT_PURPLE + "\nAfter Sort:" + Library.TEXT_RESET);
          System.out.println("Integers: " + integers2);
          System.out.println("Doubles: " + doubles2);
          System.out.println("Strings: " + strings2);
        }//run


    }//class


