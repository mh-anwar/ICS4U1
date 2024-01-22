/*
Made by:  Charlie
class ShirtFactory:
    The ShirtFactory class extends the Factory class and provides specific variables related to the manufacturing of shirts and their equipment in the factory, including details abouot embroidering the shirts and  assembly lines, this class enables our manufaturing of shirts which provides stock of pants for our stores.
Constructors:
    - ShirtFactory(String name, String location)
 *     Initializes the ShirtFactory with the given name and location.
    - ShirtFactory(String name, String location)
     *     Initializes the ShirtFactory with the given name and location.
     Methods:
      *   - int getNumEmbroideryMachines()
      *   Returns the number of embroidery machines in the factory.
      * 
      *   - int getNumAssemblyLines()
      *     Returns the number of assembly lines in the factory.
      * 
      *   - void addAssemblyLine()
      *     Increments the count of assembly lines in the factory.
      * 
      *   - void removeAssemblyLine()
      *     Decrements the count of assembly lines in the factory.
      * 
      *   - void addEmbroideryMachine(Machine newEmbroideryMachine)
      *     Adds a new embroidery machine to the factory's machinery list and updates 
      *     the count of embroidery machines.
      * 
      *   - void removeEmbroideryMachine(String machineName)
      *     Removes an embroidery machine with the specified name from the factory's 
      *     machinery list and updates the count of embroidery machines.
*/
package Factory;

import Equipment.Machine;

public class ShirtFactory extends Factory {

    protected int numEmbroideryMachines = 0;
    protected int numAssemblyLines = 0;

    public ShirtFactory(String name, String location) {
        // Initialize class in here
        super(name, location);
    }

    // GETTERS
    public int getNumEmbroideryMachines() {
        return numEmbroideryMachines;
    }

    public int getNumAssemblyLines() {
        return numAssemblyLines;
    }

    /*
     * Method Name: volume
     * Method Description:
     * This method calculates the
     * volume of a cardboard box.
     * Parameters:
     * None
     * Returns:
     * Double
     */

    // We do not have an assembly line machine, we are just tracking how many exist
    public void addAssemblyLine() {
        numAssemblyLines++;
    }

    public void removeAssemblyLine() {
        numAssemblyLines--;
    }

    public void addEmbroideryMachine(Machine newEmbroideryMachines) {
        machinery.add(newEmbroideryMachines);
        numEmbroideryMachines = machinery.size();
    }

    public void removeEmbroideryMachine(String machineName) {
        for (int i = 0; i < machinery.size(); i++) {
            if (machinery.get(i).name == machineName) {
                machinery.remove(i);
            }
        }
        numEmbroideryMachines = machinery.size();
    }

}