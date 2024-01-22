/*
Made by: Ryan
class Transaction:
    The Transaction is an abstract class that provides 
    basic trabsaction details 
Constructors:
    public Transaction(Date transactionDate, String recipientName, String recipientEmail, Double totalAmount)
Methods:
    getTotalAmount
    setTotalAmount
    
*/
package Transaction;

import Root.Library;
import java.util.Date;

public class Transaction {
    String[] data = Library.getObjectInfoFromCsv("TransactionData.csv");

    protected long transactionId = (long) Library.random(0, 1000); // Randomly generate
    protected Date transactionDate = new Date();
    protected String recipientName;
    protected String recipientEmail;
    protected Double totalAmount;

    public Transaction() {
        // Initialize class in here
        this.recipientName = data[0];
        this.recipientEmail = data[1];
        this.totalAmount = Double.parseDouble(data[2]);
    }

    public Transaction(String recipientName, String recipientEmail, Double totalAmount) {
        // Initialize class in here
        this.recipientName = recipientName;
        this.recipientEmail = recipientEmail;
        this.totalAmount = totalAmount;
    }

    public String toString() {
        return "\nTransaction Details:"
                + "\n- Transaction Date: " + transactionDate
                + "\n- Recipient Name: " + recipientName
                + "\n- Recipient Email: " + recipientEmail
                + "\n- Transaction Total: $" + totalAmount;
    }

    // GETTERS
    public Double getTotalAmount() {
        return totalAmount;
    }

    // SETTERS
    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }
    // GENERAL METHODS
}