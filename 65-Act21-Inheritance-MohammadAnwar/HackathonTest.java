
/*
- This file is meant to expose all functionality of all classes within this project and test each of their functions
- that is, literally all of their functions.
- Written by: Mohammad Anwar
- Date Written: December 14th 2023
*/
import java.util.ArrayList;

public class HackathonTest {
    public static void run() {

        Library.goMsg("Creating HackTheNorth");
        // Test Hackathon constructor with 4 args
        Hackathon hackTheNorth = new Hackathon("HackTheNorth", 1500, true, false);
        // Output without attendee names, check atteendee list
        Library.print(hackTheNorth.toString());
        hackTheNorth.outputAttendees();

        // Add attendee names
        hackTheNorth.addAttendee("Reese Chong", 17);
        hackTheNorth.addAttendee("Krish Nalam", 17);

        // Output with attendee names, check atttendee list
        System.out.println("\nAdded Attendees:");
        hackTheNorth.outputAttendees();
        Library.print(hackTheNorth.toString());

        Library.goMsg("Creating HackMo");
        // Test Hackathon constructor with 3 args
        Hackathon hackMo = new Hackathon("HackMo", 100, false);

        // Output without attendee names, check atteendee list
        Library.print(hackMo.toString());
        hackMo.outputAttendees();

        // Add attendee names
        hackMo.addAttendee("Minglun Nalam", 17);
        hackMo.addAttendee("Neha Chong", 17);

        // Output with attendee names, check atttendee list
        System.out.println("\nAdded Attendees:");
        hackMo.outputAttendees();
        Library.print(hackMo.toString());

        Library.goMsg("Creating HackTheSix");
        InPersonHackathon hackTheSix = new InPersonHackathon("HackTheSix", 300, true,
                true, 50, "George Vari Engineering Centre");
        Library.print(hackTheSix.toString());

        // Change venue, reprint
        hackTheSix.changeVenue("UTSC Sam Ibrahim");
        Library.print(hackTheSix.toString());

        // Change number of rooms, reprint
        hackTheSix.setNumRooms(160);
        Library.goMsg("(Changed) Number of Rooms: " + Integer.toString(hackTheSix.getNumRooms()));

        // Set venue, reprint
        hackTheSix.setVenue("George Vari Engineering Centre");
        Library.goMsg("(Changed) Venue: " + hackTheSix.getVenue());

        Library.print(hackTheSix.toString());

        Library.goMsg("Creating Recess Hacks");
        VirtualHackathon recessHacks = new VirtualHackathon("Recess Hacks", 150,
                true, false,
                "https://discord.com/invite/UCKFVCv759", 7);
        Library.print(recessHacks.toString());

        // Change discord server, reprint
        recessHacks.setDiscordServer("https://discord.com/invite/reese-honks");
        Library.goMsg("(Changed) Discord Server:" + recessHacks.getDiscordServer());

        // Change number of api keys, reprint
        recessHacks.setNumApiKeys(19);
        Library.goMsg("(Changed) Number of Free API Keys: " +
                Integer.toString(recessHacks.getNumApiKeys()));

        // Reset main info, reprint
        recessHacks.resetHackathonInfo();
        Library.print(recessHacks.toString());

        // Test for HackGroup Ltd.
        HackGroup MonkGroup = new HackGroup("Ras Buckland", 3);
        Library.print(MonkGroup.toString());

        Library.goMsg("Adding General Hackathons");
        // ---------
        // Add general hackathons
        MonkGroup.setGeneralHacks(hackTheNorth);
        MonkGroup.setGeneralHacks(hackMo);

        String generalHaxMsg = "";
        ArrayList<Hackathon> generalHaxList = MonkGroup.getGeneralHacks();
        for (int i = 0; i < generalHaxList.size(); i++) {
            generalHaxMsg += "\n" + generalHaxList.get(i);
        }
        Library.print("Monk Group General Hacks: ");
        Library.goMsg(generalHaxMsg);

        Library.print(MonkGroup.toString());

        Library.goMsg("Adding In-Person Hackathons");
        // ---------
        // Add in person hackathon
        MonkGroup.setInPersonHack(hackTheSix);

        String physicalHaxMsg = "";
        ArrayList<InPersonHackathon> physicalHaxList = MonkGroup.getInPersonHacks();
        for (int i = 0; i < physicalHaxList.size(); i++) {
            physicalHaxMsg += "\n" + physicalHaxList.get(i);
        }
        Library.print("Monk Group In-Person Hacks: ");
        Library.goMsg(physicalHaxMsg);

        Library.print(MonkGroup.toString());

        Library.goMsg("Adding Virtual Hackathons");
        // ---------
        // Add virtual hackathon
        MonkGroup.setVirtualHacks(recessHacks);

        String virtuallHaxMsg = "";
        ArrayList<VirtualHackathon> virtualHaxList = MonkGroup.getVirtualHacks();
        for (int i = 0; i < virtualHaxList.size(); i++) {
            virtuallHaxMsg += "\n" + virtualHaxList.get(i);
        }
        Library.print("Monk Group Virtual Hacks: ");
        Library.goMsg(virtuallHaxMsg);

        Library.print(MonkGroup.toString());

        MonkGroup.setPresident("Mohammad Anwar");
        Library.goMsg("(Changed) President: " + MonkGroup.getPresident());

        MonkGroup.setNumEmployees(30);
        Library.goMsg("(Changed) Number of Employees: " + Integer.toString(MonkGroup.getNumEmployees()));

        Library.print(MonkGroup.toString());

    }
}
