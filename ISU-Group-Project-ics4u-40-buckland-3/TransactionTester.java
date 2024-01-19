
import Transaction.Transaction;
import Root.Library;

import java.util.ArrayList;
import java.util.Date;

class TransactionTester {
    public static void main(String[] args) {
        Transaction etransfer = new Transaction("Ryan", "ryan@outlook.com", 68901.98);
        System.out.println(etransfer);

        etransfer.setTotalAmount(689.0198);
        System.out.println("Changed Amount of Transaction: " + etransfer.getTotalAmount());
    }
}