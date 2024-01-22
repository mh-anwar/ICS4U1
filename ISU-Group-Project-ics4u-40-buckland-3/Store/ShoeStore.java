//Made by sarah
// Class ShoeStore :
// The shoe store class extends the Store class and provides specific variables related to shoes such as the type of shoe, size and color
// Methods
// addShoeSize
// removeShoeSize
// addShoeType
// removeShoeType

package Store;

import java.awt.Color;
import java.util.ArrayList;

import Clothing.Shoe;

public class ShoeStore extends Store {

    protected ArrayList<String> shoeTypes = new ArrayList<String>();
    protected ArrayList<Double> shoeSizes = new ArrayList<Double>();
    protected ArrayList<Color> shoeColors = new ArrayList<Color>();

    public ShoeStore(String name, String location) {
        super(name, location);
    }

    public String toString() {
        return "FINISH ME PLEASE!";
    }

    // GETTERS
    public ArrayList<String> getShoeTypes() {
        return shoeTypes;
    }

    public ArrayList<Double> getShoeSizes() {
        return shoeSizes;
    }

    public ArrayList<Color> getShoeColors() {
        return shoeColors;
    }

    // METHODS
    public void addShoeType(String newShoeType) {
        shoeTypes.add(newShoeType);
    }

    public void addShoeSize(Double newShoeSize) {
        shoeSizes.add(newShoeSize);
    }

    public void removeShoeSize(Double newShoeSize) {
        shoeSizes.remove(newShoeSize);
    }

    public void removeShoeType(String newShoeType) {
        shoeTypes.remove(newShoeType);
    }
}// end class