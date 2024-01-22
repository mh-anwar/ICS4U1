//Made by Rya
// Class StoreBuilder :
// The ShoeBuilder Class extends the Store class and provides a way to create a Shoe object.
// Methods
// addShoeSize
// removeShoeSize
// addShoeType
// removeShoeType
package Store;

import Store.*;
import Root.Library;

public class StoreBuilder {
    public static Store createStore(String storeType) {
        Library.printf("What would you like to name your " + storeType + " Store?");
        String storeName = Library.input.nextLine();

        Library.printf("What is the location of your " + storeType + " Store?");
        String storeLocation = Library.input.nextLine();

        if (storeType == "pant") {
            return new PantStore(storeName, storeLocation);
        } else if (storeType == "shirt") {
            return new ShirtStore(storeName, storeLocation);
        } else if (storeType == "shoe") {
            return new ShoeStore(storeName, storeLocation);
        }
        return new PantStore(storeName, storeLocation);
    }
}