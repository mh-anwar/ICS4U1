//Made by 
// Class RevnueTester :
// The shoe store class extends the Store class and provides specific variables related to shoes such as the type of shoe, size and color
// Methods
// addShoeSize
// removeShoeSize
// addShoeType
// removeShoeType
import Revenue.Revenue;
import Transaction.Transaction;
import Root.Library;

import java.util.ArrayList;
import java.util.Date;

class RevenueTester {
    public static void main(String[] args) {
        Revenue bznsRev = new Revenue("Evil Corp Revenue");
        System.out.println(bznsRev);

        Transaction newSale = new Transaction("Ryan", "ryan@gmail.com", 900.90);
        bznsRev.addSale(newSale);

        Library.successMsg("Added new sale");
        System.out.println("New sales total: $" + bznsRev.getSalesTotal());
        System.out.println();
        System.out.println(bznsRev);
    }
}