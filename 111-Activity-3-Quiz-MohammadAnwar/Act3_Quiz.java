class Act3_Quiz{
	public static void run(){
		// Initialize program "globally" accessible variable
		boolean programRun = true;
		String highestStudent = "";
		int highestScore = 0;
		// Run a while loop
		while(programRun){
			// Initialize run variables
			int correctAnswers = 0;
			// Welcome user and request their name
			System.out.println("Welcome to Mohammad's Random Social Sciences Quiz!");
			System.out.println();
			System.out.print("What is your name: ");
			String userName = Library.input.nextLine();	
			
			// If the user wishes to exit, let them do so
			if(userName.equalsIgnoreCase("exit")){
				programRun = false;
			} else {
				// Ask them the name of the premier of ontario
				System.out.println();
				System.out.print("What is the name of the current Premier of Ontario: ");
				String ontarioPremier = Library.input.nextLine();
				
				// Ask them about the branches of the US government
				System.out.println();
				System.out.print("What is one of the three branches of the United States of America: ");
				String usGovernmentBranches = Library.input.nextLine();

				// Ask them about canada's population
				System.out.println();
				System.out.print("What is the population of Canada (in millions): ");
				double canadaPopulation = Library.input.nextDouble();
				Library.input.nextLine();

				// Ask them about the premier of Manitoba
				System.out.println();
				System.out.print("Who is the premier (designate) of Manitoba: ");
				String manitobaPremier = Library.input.nextLine();	

				// Ask them about the latitude of Toronto
				System.out.println();
				System.out.print("What the is latitude of Toronto: ");
				double torontoLatitude = Library.input.nextDouble();
				Library.input.nextLine();
				
				// Check if premier is doug ford
				// If they enter the full name, the first name or the last name give them a point
				if(ontarioPremier.equalsIgnoreCase("Doug Ford")){
					correctAnswers += 1;
				} else if(ontarioPremier.toLowerCase().contains("ford")){
					correctAnswers += 1;
				} else if(ontarioPremier.toLowerCase().contains("doug")){
					correctAnswers += 1;
				}
				
				// Check if US government branches contains either of the three branches, if so give a point
				if(usGovernmentBranches.toLowerCase().contains("legislative")){
					correctAnswers += 1;
				} else if(usGovernmentBranches.toLowerCase().contains("executive")){
					correctAnswers += 1;
				} else if(usGovernmentBranches.toLowerCase().contains("judicial")){
					correctAnswers += 1;
				}
				
				// Check if population was entered as exactly 38.25
				if(canadaPopulation == 38.25){
					correctAnswers += 1;
				}
				
				// Check if premier of Manitoba was entered as Wab or kinew  and give a point
				if (manitobaPremier.toLowerCase().startsWith("wab")){
					correctAnswers += 1;
				} else if (manitobaPremier.toLowerCase().endsWith("kinew")){
					correctAnswers += 1;
				}
				// Check if the latitude was exact, and give a point
				if (torontoLatitude == 43.6532){
					correctAnswers += 1;
				}
				// Change the highest scorer and their score, if this run's score is higher
				if(correctAnswers > highestScore){
					highestScore = correctAnswers;
					highestStudent = userName;
				}

				// Output ending information, their final score and ask if they want to do another run
				System.out.println();
				System.out.println(userName +" you received a " + correctAnswers + " out of 5");
				System.out.println("This test was marked by a certain Mohammad Anwar.");
				System.out.println("Press enter to continue");
				Library.input.nextLine();
			}

		}
		// Output the highest score once the user exits
		System.out.println("The student with the highest score was " + highestStudent + " with a score of " + highestScore + " out of 5");
	}
	
}