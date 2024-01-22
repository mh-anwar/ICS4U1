/*
Made by: Mohammad, Charlie
class Pant:
    The Pant class extends the clothing class and provides specific variables related to pants such as their length, width, size, etc.
Constructors:
    - Pant(String name, String material, String type, String pantSize)
 *     Initializes the Pant with the given name, material, type, and pant size.
Methods:
   String toString()
     Returns a string representation of the Pant object.
    Method Description:
     This method returns a string representation of the Pant object, including details such as name, material, type, and pant size.
      Returns:
      String - a string representation of the Pant object
*/
package Clothing;

import Root.Library;

public class Pant extends Clothing {
    public double pantLength = (double) Library.random(10, 19);
    public double pantWidth = (double) Library.random(20, 39);
    public String pantSize;
    public int numPockets = Library.random(1, 5);
    public int numButtons = Library.random(1, 5);

    public Pant(String name, String material, String type, String pantSize) {
        super(name, material, type);
        this.pantSize = pantSize;
    }

    public String toString() {
        return "Pant (" + name + ") | Material: " + material + " | Type: " + type + " | Pant Size: " + pantSize;
    }
}