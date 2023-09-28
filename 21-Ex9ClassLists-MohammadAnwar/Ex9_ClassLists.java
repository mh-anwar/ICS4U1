import java.util.ArrayList;

class Ex9_ClassLists{
    public static void run(){

        ArrayList <String> sem1 = new ArrayList();
        ArrayList <Integer> section = new ArrayList();
        ArrayList <Integer> numStudents = new ArrayList();
        
        System.out.println("My Timetable");
        sem1.add("ICS4U");    section.add(10);  numStudents.add(29);
        sem1.add("ICS3U");    section.add(20);  numStudents.add(28);
        sem1.add("Prep");    section.add(30);  numStudents.add(0);
        sem1.add("ICS4U");    section.add(40);  numStudents.add(25);
        
        //print out course info
        for(int i=0; i<sem1.size(); i++){
            // System.out.println( section.get(i) + "   " + sem1 .get(i) + "   " + numStudents.get(i));
			
			System.out.printf( "%-7s", sem1.get(i)  );
            System.out.printf(  "%-6s", section.get(i)   );          
            System.out.printf( "%-5s %n", numStudents.get(i)     );         
        }

		
        // Searching
        System.out.println("What course do you want to find?");
        String courseToFind = Library.input.nextLine();
        
        int foundIndex = Library.linearStringSearch( sem1, courseToFind   );           
        if (foundIndex == -1) {
            System.out.println("Not found\n");
        } else {
            System.out.println( sem1.get(foundIndex) + "  Number of Students: " + numStudents.get(foundIndex)  );
			System.out.println("");
        }


        //Change Computer Science to a Prep       
        sem1.set(1, "Prep");
		numStudents.set(1,0);
        

        //remove a course
        sem1 .remove(3);
        section.remove(3);
        numStudents.remove(3);

        //Remove a student from a course


		
        //print out course info
        for(int i=0; i<sem1 .size(); i++){
            System.out.println( section.get(i) + "   " + sem1.get(i) + "   " + numStudents.get(i));        
        }
        
    }//run

    
}//class
