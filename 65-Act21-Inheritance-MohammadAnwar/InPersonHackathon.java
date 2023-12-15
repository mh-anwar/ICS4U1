
/*
- This file extends the parent class (Hackathon) into an in-person hackathon class that contains the venue and the number of rooms at the venue,
  this is also meant only to be used by organizers to be able to utilize the functionality to control their hackathon. It also contaisn the ability to change the venue and get and set instance variables of this file.
- Written by: Mohammad Anwar
- Date Written: December 14th 2023
*/

import java.util.ArrayList;

class InPersonHackathon extends Hackathon {
    // Instance vars
    private int numberOfRooms;
    private String venueName;

    // Main constructor that takes base class info and extra arguments
    public InPersonHackathon(String name, int attendees, boolean prizesAvailible,
            boolean usesDevpost, int numberOfRooms, String venueName) {
        super(name, attendees, prizesAvailible, usesDevpost);
        this.numberOfRooms = numberOfRooms;
        this.venueName = venueName;
    }

    // Return a stringular representation of the objects data
    public String toString() {
        return super.toString() +
                "\n- Venue: " + venueName +
                "\n- Number of Rooms: " + numberOfRooms;
    }

    // Method to change the venue and change rooms based upon venue name
    public void changeVenue(String venueName) {
        this.venueName = venueName;
        if (venueName == "Waterloo E7") {
            numberOfRooms = 190;
        } else if (venueName == "UTSC Sam Ibrahim") {
            numberOfRooms = 230;
        } else if (venueName == "George Vari Engineering Centre") {
            numberOfRooms = 50;
        } else {
            numberOfRooms = 100;
        }
    }

    // All other methods are getters and setters for various instance vars
    public void setNumRooms(int numRooms) {
        numberOfRooms = numRooms;
    }

    public int getNumRooms() {
        return numberOfRooms;
    }

    public void setVenue(String newVenue) {
        venueName = newVenue;
    }

    public String getVenue() {
        return venueName;
    }
}