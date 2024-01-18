/*
Made by: Mohammad, Charlie
class Clothing:
    The Clothing class is an abstract class that provides 
    basic functionality for it's children classes that extend it
Constructors:
    Clothing(String name, String material, String type)
Methods:
    toString()
    getQualityControl()
    getEnvironmentFriendliness
    setQualityControl
    setEnvironmentFriendliness
*/
package Clothing;

import Root.Library;
import java.awt.Color;

abstract class Clothing {
    public String name;
    public Color color = new Color(Library.random(1, 255), Library.random(1, 255), Library.random(1, 255));
    public double cost = Library.random(20, 100);
    public String material;
    public String type;
    protected boolean qualityControl = true;
    protected boolean environmentFriendly = true;

    public Clothing(String name, String material, String type) {
        // Initialize class in here
        this.name = name;
        this.material = material;
        this.type = type;
    }

    abstract public String toString();

    // GETTERS
    public boolean getQualityControl() {
        return qualityControl;
    }

    public boolean getEnvironmentFriendliness() {
        return environmentFriendly;
    }

    // SETTERS
    public void setQualityControl(boolean qualityControl) {
        this.qualityControl = qualityControl;
    }

    public void setEnvironmentFriendliness(boolean environmentFriendly) {
        this.environmentFriendly = environmentFriendly;
    }
    // GENERAL METHODS (none)

}
