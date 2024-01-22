/*
Made by: Sarah
class Machine:
    The Machine class extends the Equipment class and provides specific variables related to machines.
Constructors:
 Variables:
 - protected Date lastMaintained
 - protected int maintenenceInterval
 - protected String operatorName
 GETTERS
 - public Date getLastMaintained
 - public int getMaintenceInterval
 - public String getOperatorName
 SETTERS
 - public void setLastMaintained
 - public void setMaintenceInterval
 - public void setOperatorName
*/
package Equipment;

import java.util.*;

public class Machine extends Equipment {
    protected Date lastMaintained;
    protected int maintainenceInterval; // in months
    protected String operatorName;

    public Machine(String name, Date lastMaintained, int maintainenceInterval, String operatorName) {
        super(name);
        this.lastMaintained = lastMaintained;
        this.maintainenceInterval = maintainenceInterval;
        this.operatorName = operatorName;
    }

    public String toString() {
        return "Machine (" + name + ")";
    }

    // GETTERS
    public Date getLastMaintained() {
        return lastMaintained;
    }

    public int getMaintainenceInterval() {
        return maintainenceInterval;
    }

    public String getOperatorName() {
        return operatorName;
    }

    // SETTERS
    public void setLastMaintained(Date lastMaintained) {
        this.lastMaintained = lastMaintained;
    }

    public void setMaintainenceInterval(int maintainenceInterval) {
        this.maintainenceInterval = maintainenceInterval;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    // GENERAL METHODS (none)
}