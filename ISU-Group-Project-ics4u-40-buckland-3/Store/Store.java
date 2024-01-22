
/*
Made by: Sarah, Charlie
class Store:
    The Store class is an abstract class that provides 
    basic functionality for it's children classes that extend it
Constructors:
    Store(String location, int numEmployess,  double squareFootage, ing hoursOfOperation)
GETTERS
- public int getRent
- public String getFurnishings
- public String getNumEmployees
- public Employee getEmployee
- public String getNumCustomers
- public Customer getCustomer
- public Item getInventory
- public int getHoursOfOperation

SETTERS
- public void setRent
- public void setSquareFootage
- public void  setNumCustomer

METHODS
- public void addCustomer 
- public void addInventory 
- public void addEmployee
- All of the above, but delete funcs
- public void changeHoursOfOperation

*/
package Store;

import java.util.ArrayList;

import Equipment.Furnishing;
import HumanResources.Customer;
import HumanResources.Employee;
import Item.Item;
import Root.Library;

abstract class Store {

    protected ArrayList<Furnishing> furniture = new ArrayList<Furnishing>();
    protected ArrayList<Employee> employees = new ArrayList<Employee>();

    protected ArrayList<Customer> customers = new ArrayList<Customer>();
    protected ArrayList<Item> inventory = new ArrayList<Item>();

    public String name;
    public String location;
    protected double squareFootage = Library.random(1000, 2500);
    protected long rent = (long) Library.random(2000, 5000);
    public int hoursOfOperation = 8;

    public Store(String name, String location) {
        // Initialize class in here
        this.name = name;
        this.location = location;
    }

    abstract public String toString();

    // GETTERS
    public double getRent() {
        return rent;
    }

    public int getNumEmployees() {
        return employees.size();
    }

    public int getNumCustomers() {
        return customers.size();
    }

    public ArrayList<Furnishing> getFurniture() {
        return furniture;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public ArrayList<Item> getInventory() {
        return inventory;
    }

    // SETTERS
    public void setRent(long rent) {
        this.rent = rent;
    }

    public void setHoursOfOperation(int hoursOfOperation) {
        this.hoursOfOperation = hoursOfOperation;
    }

    // METHODS
    public void addCustomer(Customer customer) {
        this.customers.add(customer);
    }

    public void addInventory(Item item) {
        this.inventory.add(item);
    }

    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }

    public long getTotalWages() {
        long totalWages = 0;
        for (int i = 0; i < employees.size(); i++) {
            totalWages += (employees.get(i).getHourlyPay() * hoursOfOperation) * (squareFootage / 10);
        }
        return totalWages;
    }
}
