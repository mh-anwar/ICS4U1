/*
Made by: Mohammad,ryan
class item:
    The item class is an abstract class that provides 
    basic items like price rating and name
Constructors:
    public Item(String name, double price, double rating)
Methods:
    
*/

package Item;

public class Item {
    public String name;
    public double price;
    public double rating;

    public Item(String name, double price, double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public String toString() {
        return "Item: " + name + "\nPrice: $" + price + "\nRating: " + rating;
    }
}