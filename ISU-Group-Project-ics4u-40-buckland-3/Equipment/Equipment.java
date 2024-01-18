/*
Made by: Sarah
class Equipment:
    The Equipment class is an abstract class that provides 
    basic functionality for it's children classes that extend it
Constructors:
    Equipment(String name, String condition, String width, String height, String length, String warranty period)
Getters:
    getCondition()
Setters:
    setCondition()
Methods:
    toString()
    wearCondition()
*/
package Equipment;

import Root.Library;

abstract class Equipment {
    public String name;
    protected String condition = "perfect"; // Restrict to: perfect, good, ok, horrible, destroyed
    public double width = Library.random(10, 25);
    public double length = Library.random(15, 25);
    public double height = Library.random(10, 20);
    protected double warrantyPeriod = (double) Library.random(1, 20);

    public Equipment(String name) {
        // Initialize class in here
        this.name = name;
    }

    abstract public String toString();

    // GETTERS
    public String getCondition() {
        return condition;
    }

    public double getWarranty() {
        return warrantyPeriod;
    }

    // SETTERS
  public String setCondition() {
      return condition;
  }

  public double setWarranty() {
      return warrantyPeriod;
  }

    // GENERAL METHODS
    public void wearCondition() {
        // Wear as in make the condition worse
        if (this.condition == "perfect") {
            this.condition = "good";
        } else if (this.condition == "good") {
            this.condition = "ok";
        } else if (this.condition == "ok") {
            this.condition = "horrible";
        } else if (this.condition == "horrible") {
            this.condition = "destroyed";
        }
    }

}// end