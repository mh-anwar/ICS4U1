/*
Made by: Mohammad Anwar
class PantFactory:
    The pant Factory class extends the Factory class and provides specific variables related to the manufacturing of shoes and their equipment in the factory, including details about sewing and cutting the pants, this class enables our manufaturing of shoes which provides stock of shoes for our stores.
Constructors:
    - PantFactory(String name, String location)
 *     Initializes the PantFactory with the given name and location.

      *   -  int getNumSewingMachines()
      *   Returns the number of sewing machines in the factory.
      * 
      *   - getNumCuttingTables()
      *     Returns the number of cutting tables stations in the factory.
      * 
      *   - void increaseCuttingTables()
      *     Increments the count of cutting tables in the factory.
      * 
      *   - void decreaseNumCuttingTable()
      *     Decrements the count of cutting tables in the factory.
      * 
      *   - void increaseNumSewingMachines()
      *     Adds a new sewing machine station to the factory's machinery list and updates 
      *     the count of sewing machine station.
      * 
      *   - void decreaseNumSewingMachines()
      *     Removes an sewing machine station with the specified name from the factory's 
      *     machinery list and updates the count of sewing machine station.
*/

package Factory;

import java.util.ArrayList;
import Equipment.Machine;
import HumanResources.Employee;
import Root.Library;

// TODO: handle materials variable - consider randomizing rent, square footage

public abstract class Factory {
    protected ArrayList<Machine> machinery = new ArrayList<Machine>();
    protected ArrayList<Employee> employees = new ArrayList<Employee>();

    public String name;
    public String location;
    protected double squareFootage = Library.random(10000, 25000);
    protected long rent = (long) Library.random(2000, 5000);
    public int hoursOfOperation = 10;

    public Factory(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String toString() {
        return "\n" + name
                + "\n Location: " + location
                + "\n # of Employees: " + employees.size()
                + "\n Square Footage: " + squareFootage
                + "\n Rent Cost: " + rent;
    }

    // GETTER METHODS
    public long getRent() {
        return rent;
    }

    public int getNumEmployees() {
        return employees.size();
    }

    public ArrayList<Machine> getMachinery() {
        return machinery;
    }

    // SETTER METHODS
    public void setRent(long newRent) {
        rent = newRent;
    }

    public void setHoursOfOperation(int hoursOfOperation) {
        this.hoursOfOperation = hoursOfOperation;
    }

    // GENERAL METHODS
    public void addEmployee(Employee newEmployee) {
        employees.add(newEmployee);
    }

    public void addMachinery(Machine newMachine) {
        machinery.add(newMachine);
    }

    public long getTotalWages() {
        long totalWages = 0;
        for (int i = 0; i < employees.size(); i++) {
            totalWages += (employees.get(i).getHourlyPay() * hoursOfOperation) * (squareFootage / 100);
        }
        return totalWages;
    }
}