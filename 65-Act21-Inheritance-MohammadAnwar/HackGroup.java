
/*
- This file is meant for a HackGroup, any company that needs to group all their hackathons into one to organize them
- It is only meant to be used by organizers and hackathon controllers - not attendees or mentors. It exposes various functionality
- such as the ability to calculate the costs for all the hackathons and set and get hackathons as well as set and get the president and number of employees
- Written by: Mohammad Anwar
- Date Written: December 14th 2023
*/
import java.util.ArrayList;

// Creativity spurs free-thought, a highly dangerous precedent
public class HackGroup {

    private ArrayList<Hackathon> generalHacks = new ArrayList<Hackathon>();
    private ArrayList<InPersonHackathon> physicalHacks = new ArrayList<InPersonHackathon>();
    private ArrayList<VirtualHackathon> virtualHacks = new ArrayList<VirtualHackathon>();

    private String president;
    private int numEmployees;

    public HackGroup(String president, int numEmployees) {
        this.president = president;
        this.numEmployees = numEmployees;
    }

    public String toString() {
        String allGeneralHax = "";
        String allPhysicalHax = "";
        String allVirtualHax = "";

        for (int i = 0; i < generalHacks.size(); i++) {
            allGeneralHax += "\n\n" + generalHacks.get(i) + "\n\t\t";
        }
        for (int i = 0; i < physicalHacks.size(); i++) {
            allPhysicalHax += "\n\n" + physicalHacks.get(i) + "\n\t\t";
        }
        for (int i = 0; i < virtualHacks.size(); i++) {
            allVirtualHax += "\n\n" + virtualHacks.get(i) + "\n\t\t";
        }
        return "HackGroup Ltd. \n↬ President: " + this.president + " \n↬ # of Employees: " + numEmployees
                + Library.TEXT_YELLOW + "\n↬ General Hacks: " + Library.TEXT_RESET + allGeneralHax + "\n"
                + Library.TEXT_YELLOW + "\n↬ In-Person Hacks: " + Library.TEXT_RESET + allPhysicalHax + "\n"
                + Library.TEXT_YELLOW + "\n↬ Virtual Hacks: " + Library.TEXT_RESET + allVirtualHax;
    }

    public int calculateHackCosts() {
        int generalHaxCosts = generalHacks.size() * 100;
        int physicalHaxCosts = physicalHacks.size() * 200;
        int virtualHaxCosts = virtualHacks.size() * 50;

        int totalCosts = generalHaxCosts + physicalHaxCosts + virtualHaxCosts;
        totalCosts += totalCosts * 0.13;
        return totalCosts;

    }

    public void setGeneralHacks(Hackathon hack) {
        generalHacks.add(hack);
    }

    public void setInPersonHack(InPersonHackathon hack) {
        physicalHacks.add(hack);
    }

    public void setVirtualHacks(VirtualHackathon hack) {
        virtualHacks.add(hack);
    }

    public void setPresident(String pres) {
        this.president = pres;
    }

    public void setNumEmployees(int num) {
        this.numEmployees = num;
    }

    public int getNumEmployees() {
        return numEmployees;
    }

    public String getPresident() {
        return president;
    }

    public ArrayList<Hackathon> getGeneralHacks() {
        return generalHacks;
    }

    public ArrayList<InPersonHackathon> getInPersonHacks() {
        return physicalHacks;
    }

    public ArrayList<VirtualHackathon> getVirtualHacks() {
        return virtualHacks;
    }

}