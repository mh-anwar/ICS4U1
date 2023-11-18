import java.io.*;
import java.util.ArrayList;

class Files {

    // Loading Files
    public static ArrayList<String> loadStringList(String filename) {
        ArrayList<String> temp = new ArrayList();
        try {
            BufferedReader file = new BufferedReader(new FileReader(filename));
            while (file.ready()) {
                String addLines = file.readLine();
                temp.add(addLines);

            } // end while
            file.close();
        } catch (IOException e) {
            System.out.println(e);
        }
        return temp;
    }// end loadStringList from a text file

    public static ArrayList<Double> loadDoubleList(String filename) {
        ArrayList<Double> temp = new ArrayList();
        try {
            BufferedReader file = new BufferedReader(new FileReader(filename));
            while (file.ready()) {
                String addLines = file.readLine();
                temp.add(Double.parseDouble(addLines));

            } // end while
            file.close();
        } catch (IOException e) {
            System.out.println(e);
        }
        return temp;
    }// end loadDoubleList from a text file

    public static ArrayList<Integer> loadIntegerList(String filename) {
        ArrayList<Integer> temp = new ArrayList();
        try {
            BufferedReader file = new BufferedReader(new FileReader(filename));
            while (file.ready()) {
                String addLines = file.readLine();
                temp.add(Integer.parseInt(addLines));

            } // end while
            file.close();
        } catch (IOException e) {
            System.out.println(e);
        }
        return temp;
    }// end loadDoubleList from a text file

    // Saving Files
    public static void saveList(String filename, ArrayList temp) {
        try {
            PrintWriter file = new PrintWriter(new FileWriter(filename));

            for (int i = 0; i < temp.size(); i++) {
                file.println(temp.get(i));
            }
            file.close();
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
    }// end saveList

}// end Files class