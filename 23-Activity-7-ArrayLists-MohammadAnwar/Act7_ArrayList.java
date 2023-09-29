import java.util.ArrayList;
import java.util.Arrays;
public class Act7_ArrayList {
    public static void run() {
        // Step -1 Initialize arrays
        ArrayList<String> competitorNames = new ArrayList<String>(
            Arrays.asList("Stuart-Mill", "Smith", "Ricardo", "Marx", "Malthus", "Say", "Lenin", "Stalin", "Brezhnev", "Gorbachev")
        );
        ArrayList<String> musicStyles = new ArrayList<String>(
            Arrays.asList("Classical", "Choral", "Hip hop", "Pop", "Choral", "Hip hop", "Pop", "Hip hop", "Choral", "Duet" )
        );
        ArrayList<Integer> competitorScores = new ArrayList<Integer>(
            Arrays.asList(60, 97, 68, 93, 95, 92, 18, 90, 99, 100)
        );

        // Get all the competitors names, music styles and score and output it
        for (int i = 0; i < competitorNames.size(); i ++){
            String compName = competitorNames.get(i);
            String compStyle = musicStyles.get(i);
            Integer compScore = competitorScores.get(i);
            
            System.out.println(compName + " has a musical style of " + compStyle + " and scored: " + compScore + "%");
        }
        Boolean programExit = false;
        // While the program doesn't exit, keep running
        while (programExit == false){
            // Step - 2 
            /*
                Print the names of all the competitors for only one of your categories.
                The average score for all the competitors.
                Print the names of the competitors who received a score higher than 80.
                Find the highest score and print that competitor’s name.
            */
            // Print names of all competitors in `Hip hop`
            String categoryName = "Hip hop"; // I could set this as a final, but in future versions, the user might change the program variable
            
            System.out.println();
            System.out.println("All the people in the " + categoryName + " category:");
            // Loop through music styles array --> get the competitor name and music style, if it matches the category output their name
            for (int i = 0; i < musicStyles.size(); i ++){
                String compName = competitorNames.get(i);
                String compStyle = musicStyles.get(i);
                if (compStyle.equals(categoryName)){
                    System.out.println(compName);
                }
            }
            // Print the average score for all competitors and store all above 80
            Integer totalCompScores = 0;
            System.out.println();
            // Loop throgh competitor scores array and add their score to the total scores variable
            for (int i = 0; i < competitorScores.size(); i ++){
                Integer compScore = competitorScores.get(i);
                totalCompScores += compScore;
            }
            // Calculate average and output it
            int averageCompScore = totalCompScores / competitorScores.size();
            System.out.println("The average of all categories: " + averageCompScore  + "%");
    
            System.out.println();
            System.out.println("Everyone who scored more than 80: ");
            // Print out all the high acheivers (ppl who got more than 80) *AND* store the highest score acheived
            Integer highestScore = 0;
            String highestAcheiver = "";
            // Loop through competitor scores, get their name and score, then if their score is greater than 80, output their score.
            // If their score is higher than the previous high score then set their score and name to the highestScore and highestAcheiver, respectfully
            for(int i = 0; i < competitorScores.size(); i++){
                String compName = competitorNames.get(i);
                Integer compScore = competitorScores.get(i);
                if (compScore > 80){
                    System.out.println(compName + "'s score was: " + compScore + "%");
                    if(compScore > highestScore){
                        highestScore = compScore;
                        highestAcheiver = compName; 
                    }
                }
            }
            // Print the previously retrieved highest score and the persons name
            System.out.println();
            System.out.println("The highest score: " + highestScore + "% was acheived by: " + highestAcheiver);
        
            // Step - 3
            System.out.print("What is the name of the person who's score you want to change: ");
            String nameToChange = Library.input.nextLine();
            // Time to implement a very inefficient search algorithm
            // Loop through the array until the name inputted is found
            for (int i = 0; i < competitorNames.size(); i ++){
                String compName = competitorNames.get(i);
                // If the name looped on is the same name, then ask for the new score and update the old score to be the new score.
                if(compName.equals(nameToChange)){
                    System.out.print("What is the new score: ");
                    int newScore = Library.input.nextInt();
                    Library.input.nextLine();
                    System.out.println("******************** Updating Stats *********************");
                    competitorScores.set(i, newScore);
                }
            }
        }
    }//end main

}//end class


