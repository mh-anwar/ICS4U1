/*
Made by:  Charlie
class ShirtFactory:
    The Shoe Factory class extends the Factory class and provides specific variables related to the manufacturing of shoes and their equipment in the factory, including details about molding the shoes and quality control stations, this class enables our manufaturing of shoes which provides stock of shoes for our stores.
Constructors:
    - ShoeFactory(String name, String location)
 *     Initializes the ShirtFactory with the given name and location.

      *   -  int getNumMoldingMachines()
      *   Returns the number of molding machines in the factory.
      * 
      *   - intgetQualityControlStations()
      *     Returns the number of quality control stations in the factory.
      * 
      *   - void addMoldingMachine()
      *     Increments the count of Molding machines in the factory.
      * 
      *   - void removeNumMoldingMachines()
      *     Decrements the count of Molding machines in the factory.
      * 
      *   - void addQualityControlStation(Machine newEmbroideryMachine)
      *     Adds a new Quality Control station to the factory's machinery list and updates 
      *     the count of Quality Control station.
      * 
      *   - void removeQualityControlStation(String machineName)
      *     Removes an Quality Control station with the specified name from the factory's 
      *     machinery list and updates the count of Quality Control station.
*/
package Factory;

import Equipment.Machine;

public class ShoeFactory extends Factory {

    protected int numMoldingMachines = 0;
    protected int qualityControlStations = 0;

    public ShoeFactory(String name, String location) {
        // Initialize class in here
        super(name, location);
    }

    // GETTERS
    public int getNumMoldingMachines() {
        return numMoldingMachines;
    }

    public int getQualityControlStations() {
        return qualityControlStations;
    }

    // SETTERS

    // METHODS
    public void addMoldingMachine(Machine newMoldingMachine) {
        machinery.add(newMoldingMachine);
        numMoldingMachines = machinery.size();
    }

    public void removeNumMoldingMachines(String machineName) {
        for (int i = 0; i < machinery.size(); i++) {
            if (machinery.get(i).name == machineName) {
                machinery.remove(i);
            }
        }
        numMoldingMachines = machinery.size();
    }

    public void addQualityControlStation() {
        qualityControlStations++;
    }

    public void removeQualityControlStation() {
        qualityControlStations--;
    }
}