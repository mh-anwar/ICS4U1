/*
Made by: Mohammad, Charlie
class Shoe:
    The Shoe class extends the clothing class and provides specific variables related to shoes such as their size, whether they have sole support and whether they are waterproof.
Constructors:
    Shoe(String name, String material, String type, int size, boolean hasSoleSupport, boolean isWaterproof)
Methods:
    toString()
    getNumWornBy
    setNumWornBy
*/

package Clothing;

import Root.Library;

public class Shoe extends Clothing {
    public int size;
    public boolean hasSoleSupport;
    public boolean isWaterproof;
    protected int numWornBy = 0; // track how many ppl tried to wear the shoe 💀

    public Shoe(String name, String material, String type, int size, boolean hasSoleSupport, boolean isWaterproof) {
        super(name, material, type);
        this.size = size;
        this.hasSoleSupport = hasSoleSupport;
        this.isWaterproof = isWaterproof;
    }

    public String toString() {
        return "Shoe (" + name + ") | Material: " + material + " | Type: " + type + " | Size: " + size
                + " | Has Sole Support: " + hasSoleSupport + " | Is Waterproof: " + isWaterproof;
    }

    // GETTERS
    public int getNumWornBy() {
        return numWornBy;
    }

    // METHODS
    public void increaseNumWornBy() {
        numWornBy++;
    }

}