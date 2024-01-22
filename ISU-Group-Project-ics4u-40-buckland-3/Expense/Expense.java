/*
Made by: Ryan
class Expense:
    The Expense class is a class that provides 
   price(rent, marketing, and insurance) for different types of clothing.
Constructors:
     public Expense(String refName)
Methods:
    getRent
    getMarketing
    getInsurance
    setRent
    setMarketing
    setInsurance
    getExpenseTota
*/

package Expense;

import Transaction.Transaction;
import java.util.ArrayList;

public class Expense {
    protected ArrayList<Transaction> transactionsList = new ArrayList<Transaction>();
    public String refName; // just to reference the object easily
    protected double insurance;
    protected double expensesTotal = 0;

    public Expense(String refName) {
        // Initialize class in here
        this.refName = refName;
    }

    public String toString() {
        return "Expense (" + refName + "): "
                + "\n Total Costs: $" + expensesTotal
                + "\n Insurance Costs: $" + insurance;
    }

    // GETTERS
    public double getInsurance() {
        return insurance;
    };

    // SETTERS
    public void setInsurance(double insurance) {
        this.insurance = insurance;
    };

    // GENERAL METHODS
    public double getExpenseTotal() {
        double totalExpenses = 0;
        this.expensesTotal = 0;
        for (int i = 0; i < transactionsList.size(); i++) {
            totalExpenses += transactionsList.get(i).getTotalAmount();
            this.expensesTotal += transactionsList.get(i).getTotalAmount();

        }
        return totalExpenses;
    }

    public void addExpense(Transaction newExpense) {
        transactionsList.add(newExpense);
        this.expensesTotal += newExpense.getTotalAmount();
    }
}