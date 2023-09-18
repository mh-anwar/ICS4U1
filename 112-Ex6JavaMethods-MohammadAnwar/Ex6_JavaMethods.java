import java.io.*;
class Ex6_JavaMethods {

    public static void run() {

        while (true) {

            System.out.println();
            System.out.println("Choose from the options below");
            System.out.println("1. Palindrome");
            System.out.println("2. THE counter");
            System.out.println("3. Lyrics Cleanifier");
            System.out.println("4. Exit");

            int choice = Library.input.nextInt();
			Library.input.nextLine();
            if(choice==4){
                break;
            }//4
            else if(choice==1){
                System.out.println("Enter your word to test for a palindrome");
                String word = Library.input.nextLine();
                if( isPalindrome(word) ){
                    System.out.println(word + " is a palindrome.");
                } else {
                    System.out.println("That isn't a palindrome.");
                }              
            }//1
            else if(choice==2){
                System.out.println("Enter your sentence for counting");
                String words = Library.input.nextLine();
                int count = theCounter(words);
                System.out.println("There are " + count + " THEs in " + words);
            }
else if (choice == 3) {
                String song = loadString("lyrics.txt");
        		//String song = "test this testing song test";
                System.out.println("What swear do you want to replace?");
                String word = Library.input.nextLine();

                song = song.replace(word, "BLEEP");
                System.out.println("Updated Song Lyrics - Radio Edit");
                System.out.println(song);
                saveString("lyrics(Clean).txt", song);

            }
                   
            
        }//end while

    }// end run

   public static int theCounter(String word){
        int counter = 0;
        for(int i=0; i<word.length()-2; i++){
            if( word.substring(i,i+3).equalsIgnoreCase("the")    ){
                counter++;
            }
            
        }
        return counter;
        
    }//end theCounter

    

    public static boolean isPalindrome (String word){
        String backward = "";
        for(  int i=word.length()-1; i>-1; i--    ){
            backward += word.charAt(i);
        }
        System.out.println("Backward" + backward);
        if(backward.equalsIgnoreCase(word)){
            return true;
        } else{
            return false;
        }
        
    }//end isPalindrome
	
	public static String loadString(String fileName){
		String temp="";
		String addLine = "";
		
		try{
			BufferedReader file = new BufferedReader(new FileReader(fileName));
			
			while(file.ready()){
				addLine = file.readLine();
				temp = temp + addLine + "\n";
			}
			file.close();
		}catch(IOException e){
			System.out.println(e);
		}
		return temp;
		
	}//end loadString

	public static void saveString(String fileName, String str){
		try{
			BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
			writer.write(str);
			writer.close();
		}catch(IOException){
			System.out.println(e)
		}
	}//end saveString

}// end class