/*
Made by:  Charlie
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

import Equipment.Machine;
import Root.Library;

public class PantFactory extends Factory {

    protected int numSewingMachines = Library.random(1, 5);
    protected int numCuttingTables = Library.random(1, 10);

    public PantFactory(String name, String location) {
        // Initialize class in here
        super(name, location);
    }

    // GETTERS
    public int getNumSewingMachines() {
        return numSewingMachines;
    }

    public int getNumCuttingTables() {
        return numCuttingTables;
    }

    // Methods

    // There is no cutting table machine, we are simply tracking the number of them
    public void increaseCuttingTables() {
        numCuttingTables++;
    }

    public void decreaseNumCuttingTable() {
        numCuttingTables--;
    }

    public void increaseNumSewingMachines(Machine newSewingMachines) {
        machinery.add(newSewingMachines);
        numSewingMachines = machinery.size();
    }

    public void decreaseNumSewingMachines(String machineName) {
        for (int i = 0; i < machinery.size(); i++) {
            if (machinery.get(i).name == machineName) {
                machinery.remove(i);
            }
        }
        numSewingMachines = machinery.size();
    }

}