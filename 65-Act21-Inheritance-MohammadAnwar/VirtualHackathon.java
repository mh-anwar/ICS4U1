
/*
- This file extends the parent class (Hackathon) into a virtual hackathon class containing instance variables only for virtual hackathons
  that are usefull and only meant for organizers to control. For example, organizers can reset all info about the hackathon or get and set any variables.
- Written by: Mohammad Anwar
- Date Written: December 14th 2023
*/

import java.util.ArrayList;

class VirtualHackathon extends Hackathon {
    // Instance vars
    private String discordServer;
    private int numFreeApiKeys;

    // Main constructor that takes base class info and extra arguments
    public VirtualHackathon(String name, int attendees, boolean prizesAvailible, boolean usesDevpost,
            String discordServer, int numFreeApiKeys) {
        super(name, attendees, prizesAvailible, usesDevpost);
        this.discordServer = discordServer;
        this.numFreeApiKeys = numFreeApiKeys;
    }

    // Return a stringular representation of the objects data
    public String toString() {
        return super.toString() +
                "\n- Discord Server: " + discordServer +
                "\n- Number of Free API Keys: " + numFreeApiKeys;
    }

    // This method "resets" the data to a base format
    public void resetHackathonInfo() {
        discordServer = "https://discord.com/" + this.name;
        numFreeApiKeys = this.name.length();
        this.usesDevpost = true;
    }

    // The following methods are relevant getters and setters for each instance var
    public void setDiscordServer(String discordServer) {
        this.discordServer = discordServer;
    }

    public String getDiscordServer() {
        return discordServer;
    }

    public void setNumApiKeys(int numFreeApiKeys) {
        this.numFreeApiKeys = numFreeApiKeys;
    }

    public int getNumApiKeys() {
        return numFreeApiKeys;
    }
}