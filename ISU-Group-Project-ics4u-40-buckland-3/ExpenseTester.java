import Expense.Expense;
import Transaction.Transaction;
import Root.Library;

class ExpenseTester {
    public static void main(String[] args) {
        Expense bznsExpenses = new Expense("EvilCorp Expenses");
        System.out.println(bznsExpenses);

        Library.successMsg("Changing expenses");
        bznsExpenses.setInsurance(Library.random(1000, 10000));

        bznsExpenses.addExpense(new Transaction("John", "john@adams.ca", 12030.0));
        System.out.println("Updated Expenses:" +
                "\n Total Expenses: $" + bznsExpenses.getExpenseTotal()
                + "\n Insurance Costs: $" + bznsExpenses.getInsurance());

    }
}