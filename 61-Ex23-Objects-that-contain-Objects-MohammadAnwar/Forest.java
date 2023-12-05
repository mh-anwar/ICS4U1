import java.util.ArrayList;

public class Forest {
    // instance variable
    private ArrayList<Tree> trees = new ArrayList<Tree>();

    // default constructor supplied automatically
    public String toString() {
        if (trees.isEmpty()) {
            return "No trees";
        } else {
            String allTrees = "Forest: \n";
            for (int i = 0; i < trees.size(); i++) {
                allTrees += " Tree" + i + ": " + trees.get(i) + " \n";
            }
            return allTrees;
        }
    }

    public void setTree(Tree tree) {
        trees.add(tree);
    }

    public Tree getTree(int treeNum) {
        return trees.get(treeNum);
    }
}