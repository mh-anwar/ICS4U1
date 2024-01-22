
// DONE
import HumanResources.*;
import Root.Library;
import java.util.Date;

class HumanResourcesTester {
    public static void main(String[] args) {
        Employee newEmployee1 = new Employee();

        System.out.println(newEmployee1);
        newEmployee1.setHolidaysLeft(0);
        newEmployee1.setHourlyPay(17.0);
        newEmployee1.setGender("female");

        Library.successMsg("Changed " + newEmployee1.firstName + "'s Info");
        System.out.println(newEmployee1.firstName + "'s Changed Info: \n Gender: " +
                newEmployee1.getGender()
                + "\n Hourly Pay: $" + newEmployee1.getHourlyPay()
                + "\n Holidays Left: " + newEmployee1.getHolidaysLeft());

        newEmployee1.increaseAge();
        Library.successMsg("Increased " + newEmployee1.firstName + "'s age");
        System.out.println(newEmployee1);

        Library.printNiceBreak();
        Customer newCustomer = new Customer();
        System.out.println(newCustomer);
        newCustomer.setUsername("username");
        newCustomer.setPassword("password");

        Library.successMsg("Validated " + newCustomer.firstName + "'s Info: " +
                Boolean.toString(newCustomer.validateUser("username", "password")));

        System.out.println("Purchasing info: " + newCustomer.getPurchaseInfo());

        newCustomer.increaseLoyaltyPoints();
        newCustomer.increaseLoyaltyPoints();
        newCustomer.increaseLoyaltyPoints();
        newCustomer.increaseLoyaltyPoints();
        System.out.println(newCustomer.firstName + " Loyalty Pts: " +
                newCustomer.getLoyaltyPoints());
        newCustomer.decreaseLoyaltyPoints();
        newCustomer.decreaseLoyaltyPoints();
        newCustomer.decreaseLoyaltyPoints();
        System.out.println(newCustomer.firstName + " Loyalty Pts: " +
                newCustomer.getLoyaltyPoints());

    }
}