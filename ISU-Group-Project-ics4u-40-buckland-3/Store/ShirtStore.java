//Made by sarah
// Class ShirtStore :
// The Shirt store class extends the Store class and provides specific variables related to shirts such as the style and size
// Methods
// add shirt style
// add shirt size
// remove shirt style
// remove shirt size

package Store;

import java.util.ArrayList;

public class ShirtStore extends Store {

    protected ArrayList<String> shirtStyle = new ArrayList<String>();
    protected ArrayList<Double> shirtSizes = new ArrayList<Double>();

    public ShirtStore(String name, String location) {
        super(name, location);
    }

    public String toString() {
        return "FINISH ME PLEASE!";
    }

    // GETTERS
    public ArrayList<String> getShirtStyle() {
        return shirtStyle;
    }

    public ArrayList<Double> getShirtSizes() {
        return shirtSizes;
    }

    // METHODS
    public void addShirtStyle(String newShirtStyle) {
        shirtStyle.add(newShirtStyle);
    }

    public void addShirtSize(Double newShirtSize) {
        shirtSizes.add(newShirtSize);
    }

    public void removeShirtSize(Double newShirtSize) {
        shirtSizes.remove(newShirtSize);
    }

    public void removeShirtStlye(String newShirtStyle) {
        shirtStyle.remove(newShirtStyle);
    }

}// end class