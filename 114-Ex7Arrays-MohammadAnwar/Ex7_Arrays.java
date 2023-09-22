class Ex7_Arrays {
    public static void run() {

        // 3 ways to set up an array:
        // 1. Empty - double[] myStudentAverages = new double[36];
        // - The 36 in the above line sets up 36 slots in the array.
        // Rembember that you always need to set the length at the beginning.
        // 2. Filled - String[] myDay1 = {"ICS4U-10", "SCH4U-20", "FIF4U-30", "MHF4U-40"};
        // 3. Using another method that returns an array such as String.split()

        String[] songTitles = { "Splinter Wolf\t\t", "Cannon (in D Minor)\t", "Superhero\t\t\t", "The Plan\t\t\t", "Good Morning\t\t" };
        int[] numplays = new int[5];
        String[] songLengths;

        // Using the Split method that takes a String and creates a String Array
        String times = "5:22, 3:05, 3:09, 3:06, 3:15";
        songLengths = times.split(", "); // comma space is used to create the new array
		while(true){
		printArrays(songTitles, numplays, songLengths);
		
	        System.out.println("What song would you like to play?");
	        String song = Library.input.nextLine();
	
	        int foundIndex = linearSearch(songTitles, song);
	        if (foundIndex == -1) {
	            System.out.println("not found");
	        } else {
	            numplays[foundIndex] += 1;
	        }
	
	        printArrays(songTitles, numplays, songLengths);
	       int totalplays = 0;
	        for(int i=0; i<numplays.length; i++){
	          totalplays += numplays[i];
	        }
			System.out.println();
	        System.out.println("Total number of songs played: " + totalplays);
			System.out.println();
		}//end while
	}//end run

	
	public static void printArrays(String[] stringarr, int[] intarr, String[] stringarr2) {
		for (int i = 0; i < stringarr.length; i++) {
			System.out.println(stringarr[i] + "   " + intarr[i] + "   " + stringarr2[i]);
		}
	}// printArrays


	public static int linearSearch(String[] arr, String searchTerm) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].trim().equalsIgnoreCase(searchTerm)) {
				return i;
			}
		}
		return -1;
	} // linear search - String Array

	
}//end class
