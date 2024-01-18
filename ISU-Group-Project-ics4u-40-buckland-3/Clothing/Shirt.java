/*
Made by: Mohammad, Charlie
class Shirt:
    The Shirt class extends the clothing class and provides specific variables related to shirts such as their size, whether they are long sleeved and their neckline.
Constructors:
    Shirt(String name, String material, String type, String size, boolean longSleeve, String necklineType)
Methods:
    toString()
*/
package Clothing;

import Root.Library;

public class Shirt extends Clothing {
    public String size;
    public boolean longSleeve;
    public String necklineType;

    public Shirt(String name, String material, String type, String size, boolean longSleeve, String necklineType) {
        super(name, material, type);
        this.size = size;
        this.longSleeve = longSleeve;
        this.necklineType = necklineType;
    }

    public String toString() {
        return "Shirt (" + name + ") | Material: " + material + " | Type: " + type + " | Size: " + size
                + " | Is Long Sleeve: " + longSleeve + " | Neckline Type: " + necklineType;
    }
}