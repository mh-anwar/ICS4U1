public class ForestTester {
    public static void run() {
        System.out.println("\n\n------------Forest Tester------------");

        Forest myForest = new Forest(); // default constructor

        Tree tree = new Tree(1.0, 2.0, 8.0, 10.0, 1.0, 2.0, 3.0);
        myForest.setTree(tree);

        tree = new Tree(1.4, 3.8, 7.6, 12.5, 2.0, 3.0, 4.0);
        myForest.setTree(tree);

        System.out.println(myForest);

        myForest.getTree(0).getBranches().setRadius(35);
        System.out.println(myForest);

    }
}