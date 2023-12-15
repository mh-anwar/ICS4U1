
/*
- This file is the parent hackathon class, meant to be used by people running a hackathon to store info about 
  the hackathon such as the name, number of attendees, the prizes availible, whether it uses devpost and the names of attendees.
  It can also add attendees and output them.
- Written by: Mohammad Anwar
- Date Written: December 14th 2023
*/

import java.util.ArrayList;

public class Hackathon {
    // Instance vars
    protected String name;
    protected int numAttendees;
    protected boolean prizesAvailible;
    protected boolean usesDevpost;
    protected ArrayList<String> attendeeNames = new ArrayList<String>();

    // First constructor with only three arguments
    public Hackathon(String name, int attendees, boolean prizesAvailible) {
        this.name = name;
        this.numAttendees = attendees;
        this.prizesAvailible = prizesAvailible;
        this.usesDevpost = false;
    }

    // Second constructor overloading the first with an extra argument
    public Hackathon(String name, int attendees, boolean prizesAvailible, boolean usesDevpost) {
        this.name = name;
        this.numAttendees = attendees;
        this.prizesAvailible = prizesAvailible;
        this.usesDevpost = usesDevpost;
    }

    // Return a stringular representation of the objects data
    public String toString() {
        return this.name + "\n- Number of Attendees: " + numAttendees +
                "\n- Prizes Availible: " + prizesAvailible +
                "\n- Uses Devpost " + usesDevpost;
    }

    // Add attendee to attendee list, increase number of attendees by 1
    public void addAttendee(String name, int age) {
        this.attendeeNames.add("Name: " + name + " Age: " + age);
        this.numAttendees += 1;
    }

    // Loop through attendee list and output all the attendee names
    public void outputAttendees() {
        String attendees = this.name + " - Attendee List: \n\t\t";
        for (int i = 0; i < attendeeNames.size(); i++) {
            attendees += attendeeNames.get(i) + "\n\t\t";
        }
        if (attendeeNames.size() == 0) {
            attendees = this.name + " - No Attendee Names";
            Library.errorMsg(attendees);
        } else {
            Library.goMsg(attendees);
        }
    }
}