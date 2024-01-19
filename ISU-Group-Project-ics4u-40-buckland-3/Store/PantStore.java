/*
Made by: Charlie, Ryan
class pants store:
    The PantsStore is an abstract class that provides 
   sizes for pants and the price of the pants.
Constructors:
    public class PantStore extends Store
Methods:
        addPantType
        addWaistSize
        addInseamLength
        addWaistSize
        removePantType
        removeInseamLength
*/

package Store;

import java.util.ArrayList;

public class PantStore extends Store {
    protected ArrayList<String> pantTypes = new ArrayList<String>();
    protected ArrayList<Double> waistSizes = new ArrayList<Double>();
    protected ArrayList<Double> inseamLengths = new ArrayList<Double>();

    public PantStore(String name, String location) {
        super(name, location);
    }

    public String toString() {
        return "FINISH ME PLEASE!";
    }

    // GETTERS
    public ArrayList<String> getPantTypes() {
        return pantTypes;
    }

    public ArrayList<Double> getWaistSizes() {
        return waistSizes;
    }

    public ArrayList<Double> getInseamLengths() {
        return inseamLengths;
    }

    // METHODS

    public void addPantType(String pantType) {
        pantTypes.add(pantType);
    }

    public void addWaistSize(Double waistSize) {
        waistSizes.add(waistSize);
    }

    public void addInseamLength(Double inseamLength) {
        inseamLengths.add(inseamLength);
    }

    public void removePantType(String pantType) {
        pantTypes.remove(pantType);
    }

    public void removeWaistSize(String waistSize) {
        waistSizes.remove(waistSize);
    }

    public void removeInseamLength(Double inseamLength) {
        inseamLengths.remove(inseamLength);
    }

}