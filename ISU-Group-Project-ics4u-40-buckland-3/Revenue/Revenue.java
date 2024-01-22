//header needed

package Revenue;

import java.util.ArrayList;
import Transaction.Transaction;

public class Revenue {
    protected ArrayList<Transaction> salesList = new ArrayList<Transaction>();
    protected double salesTotal = 0;

    public String refName;

    public Revenue(String refName) {
        // Initialize class in here
        this.refName = refName;
    }

    public String toString() {
        String outputMsg = "Revenue: " + refName + "\nTotal of all sales: $" + salesTotal + "\nSales are:";
        for (int i = 0; i < salesList.size(); i++) {
            outputMsg += "" + salesList.get(i);
        }
        if (salesList.size() < 1) {
            outputMsg += " None";
        }
        return outputMsg;
    }

    // GETTERS
    public double getSalesTotal() {
        double totalSales = 0;
        for (int i = 0; i < salesList.size(); i++) {
            totalSales += salesList.get(i).getTotalAmount();
            this.salesTotal += salesList.get(i).getTotalAmount();
        }
        return totalSales;
    }

    // GENERAL METHODS
    public void addSale(Transaction newSale) {
        this.salesList.add(newSale);
        this.salesTotal += newSale.getTotalAmount();
    }

}