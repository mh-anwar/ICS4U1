import java.util.ArrayList;
import java.io.*;

class Act13_DatabaseMain {
    public static void run() {
        // Explain the contents of database in a short paragraph
        System.out.println(Library.TEXT_BLUE + "Welcome to the computer info-database!" + Library.TEXT_RESET);
        System.out.println(Library.TEXT_PURPLE + "This database contains information about many different computers."
                + Library.TEXT_RESET);
        System.out.println(Library.TEXT_CYAN
                + "Specifically, RAM, CPU, Storage and architecture information are avialible."
                + Library.TEXT_RESET);
        System.out.println(
                Library.TEXT_CYAN + "This information is usefull for anyone looking to purchase a computer, like me!"
                        + Library.TEXT_RESET);

        // Set up an ArrayList to hold instances of computer class.
        ArrayList<Act13_Computer> allComputers = new ArrayList();
        // Load data CSV file and add all computers
        loadFile("computers.csv", allComputers);

        // Start main program
        while (true) {
            // Output user choices
            System.out.println();
            System.out.println(Library.TEXT_BLUE + "What would you like to do?" + Library.TEXT_RESET);
            System.out.println("1.  Print all computer names");
            System.out.println("2.  Search for a computer");
            System.out.println("3.  Add computer");
            System.out.println("4.  Print Filtered by Ram-Type");
            System.out.println("5.  Print total and average prices");
            System.out.println("6.  Upgrade storage");
            System.out.println("7.  Inflate computer price");
            System.out.println("8.  Change computer architecture");
            System.out.println("9.  Sort by CPU Name (A-Z)");
            System.out.println("10. Sort by CPU Speed (in descending order)");
            System.out.println("11. Search by price (in descending order)");
            System.out.println("12. Exit");

            // Get user choice from them
            System.out.print("Choose: ");
            int choice = Library.input.nextInt();
            Library.input.nextLine();
            System.out.println();

            // Run different logic based on their choice
            if (choice == 1) {
                System.out.println(Library.TEXT_GREEN + "All Computer Names: " + Library.TEXT_RESET);
                // Output all clients - loop through arraylist, get and print out
                for (int i = 0; i < allComputers.size(); i++) {
                    System.out.println("- " + allComputers.get(i).name);
                }
            } else if (choice == 2) {
                // Ask user for what they want to search
                System.out.print(Library.TEXT_BLUE + "What computer are you searching for: " + Library.TEXT_RESET);
                String searchTerm = Library.input.nextLine();
                printBreak();
                // Search through array
                int compIndex = searchArray(allComputers, searchTerm);
                // If index is -1 (not found) output error
                if (compIndex == -1) {
                    System.out.println(Library.TEXT_RED + "Computer not found." + Library.TEXT_RESET);
                } else {
                    // Or else output the computer
                    System.out.println(allComputers.get(compIndex));
                }
                printBreak();
            } else if (choice == 3) {
                Boolean exitAddInterface = false;
                // Loop until user wants to exit, and is satisfied with the new computer
                while (exitAddInterface == false) {
                    System.out.println(Library.TEXT_BLUE + "To add a new computer, enter the following data:"
                            + Library.TEXT_RESET);
                    // Ask for computer name
                    System.out.print("What is the new computer's name? ");
                    String newName = Library.input.nextLine();
                    // Ask for computer price
                    System.out.print("What is the price of the computer (in dollars)? ");
                    Double newPrice = Library.input.nextDouble();
                    Library.input.nextLine();
                    // Ask for computer processor
                    System.out.print("What is the name of the computer's processor? ");
                    String newProcessorName = Library.input.nextLine();

                    // Ask for computer memory type
                    System.out.print("What is the type of memory (DDR2/3/4/5)? ");
                    String newMemoryType = Library.input.nextLine();

                    // Ask for computer storage type
                    System.out.print("What is the type of storage (Hard drive or SSD)? ");
                    String newStorageType = Library.input.nextLine().toLowerCase();
                    // Store the storage type in proper format, convert their input
                    if (newStorageType.equals("hard-drive") || newStorageType.equals("hard drive")
                            || newStorageType.equals("harddrive")) {
                        newStorageType = "Hard drive";
                    } else if (newStorageType.equals("solid state storage") || newStorageType.equals("ssd")) {
                        newStorageType = "SSD";
                    }
                    // Ask for computer cpu speed in ghz
                    System.out.print("What is speed of the CPU (in GHz)? ");
                    Double newCpuSpeed = Library.input.nextDouble();
                    Library.input.nextLine();

                    // Ask for computer storage space in GB
                    System.out.print("How much storage space is there (in GB)? ");
                    Integer newStorageSpace = Library.input.nextInt();
                    Library.input.nextLine();

                    // Ask if computer architecture is 65-bit
                    System.out.print("Is it 64-bit (y/n)? ");
                    // If the user enters y (yes), store as true
                    Boolean newIs64Bit = Library.input.nextLine().toLowerCase().startsWith("y");
                    System.out.println();

                    // Create new computer instance
                    Act13_Computer tempComputer = new Act13_Computer(newName, newPrice, newProcessorName, newMemoryType,
                            newStorageType,
                            newCpuSpeed, newStorageSpace, newIs64Bit);
                    // Add computer instance to arraylist
                    allComputers.add(tempComputer);
                    // Output final info about computer, confirm their choice
                    System.out
                            .println(Library.TEXT_GREEN + "The following computer will be added:" + Library.TEXT_RESET);
                    System.out.println(tempComputer);
                    System.out.print("If this is correct, enter `y`, or else enter `n`: ");
                    exitAddInterface = Library.input.nextLine().toLowerCase().startsWith("y");
                }
            } else if (choice == 4) {
                // Ask what ram type they want to filter by
                System.out.println(
                        Library.TEXT_BLUE + "What Ram-Type do you want to filter by? (DDR2, DDR3, DDR4, DDR5)"
                                + Library.TEXT_RESET);
                String ramType = Library.input.nextLine().toLowerCase();
                // Take their input, lowerCase it, and search for it
                searchAndPrintByRam(allComputers, ramType);
            } else if (choice == 5) {
                // Call a function to total the prices and find their average
                System.out.println(Library.TEXT_BLUE + "Printing total price and average price:" + Library.TEXT_RESET);
                System.out.println();
                totalAveragePrices(allComputers);
            } else if (choice == 6) {
                // Upgrade storage
                System.out.print(
                        Library.TEXT_BLUE + "What computer do you want to upgrade storage for: " + Library.TEXT_RESET);
                String searchTerm = Library.input.nextLine();
                printBreak();
                // Search through array
                int compIndex = searchArray(allComputers, searchTerm);
                // If index is -1 (not found) output error
                if (compIndex == -1) {
                    System.out.println(Library.TEXT_RED + "Computer not found." + Library.TEXT_RESET);
                } else {
                    // Or else output the computer
                    allComputers.get(compIndex).upgradeStorage();
                    System.out.println("Storage upgraded");
                    System.out.println(allComputers.get(compIndex));
                }
                printBreak();
            } else if (choice == 7) {
                // Inflate computer price
                System.out.print(Library.TEXT_BLUE + "What computer do you want to inflate the price for: "
                        + Library.TEXT_RESET);
                String searchTerm = Library.input.nextLine();
                printBreak();
                // Search through array
                int compIndex = searchArray(allComputers, searchTerm);
                
                // If index is -1 (not found) output error
                if (compIndex == -1) {
                    System.out.println(Library.TEXT_RED + "Computer not found." + Library.TEXT_RESET);
                } else {
                    // Or else output the computer after inflating its price
                    allComputers.get(compIndex).inflatePrice();

                    System.out.println("Price Inflated");
                    System.out.println(allComputers.get(compIndex));
                }
                printBreak();
            } else if (choice == 8) {
                // Change computer architecture
                System.out.print(Library.TEXT_BLUE + "What computer do you want to change the architecture for: "
                        + Library.TEXT_RESET);
                String searchTerm = Library.input.nextLine();
                printBreak();
                
                // Search through array
                int compIndex = searchArray(allComputers, searchTerm);
                
                // If index is -1 (not found) output error
                if (compIndex == -1) {
                    System.out.println(Library.TEXT_RED + "Computer not found." + Library.TEXT_RESET);
                } else {
                    // Or else change architecture and output the computer
                    allComputers.get(compIndex).changeArchitecture();

                    System.out.println("Architecture Changed");
                    System.out.println(allComputers.get(compIndex));
                }
                printBreak();

            } else if (choice == 9) {
                // Selection sort all computers by CPU name
                selectionSort(allComputers);
                System.out.println(Library.TEXT_BLUE + "Sorted by CPU Name (A-Z): " + Library.TEXT_RESET);
                // Output sorted computers
                for (int i = 0; i < allComputers.size(); i++) {
                    System.out.println("- " + allComputers.get(i).name);
                }
            } else if (choice == 10) {
                // Insertion sort all computers by CPU Speed
                insertionSort(allComputers);
                System.out.println(Library.TEXT_BLUE + "Sorted by CPU Speed (Low to High): " + Library.TEXT_RESET);
                // Output sorted computers
                for (int i = 0; i < allComputers.size(); i++) {
                    System.out.println("- " + allComputers.get(i).name);
                }
            } else if (choice == 11) {
                // Search computers by price
                // Bubble sort computers by price
                bubbleSort(allComputers);
                
                // Ask what price is being looked for
                System.out.print(Library.TEXT_BLUE + "What price are you looking for: " + Library.TEXT_RESET);
                Double searchTerm = Library.input.nextDouble();
                Library.input.nextLine();
                
                // Search for price
                int compIndex = binarySearch(allComputers, searchTerm);
                
                // If price is not found, output that
                if (compIndex == -1) {
                    System.out.println(Library.TEXT_RED + "Price not found." + Library.TEXT_RESET);
                } else {
                    // Or else output the computer
                    System.out.println(allComputers.get(compIndex));
                }
            } else {
                // Save all the data and output exit message
                saveFile("computers.csv", allComputers);
                System.out.println(Library.TEXT_GREEN + "Saved, exiting now!" + Library.TEXT_RESET);
                break;
            }
        }

    }

    public static void loadFile(String filename, ArrayList<Act13_Computer> list) {
        try {
            // Create new buffered reader to read file
            BufferedReader file = new BufferedReader(new FileReader(filename));
            String dataToRead;
            // Run while the line is not null
            while ((dataToRead = file.readLine()) != null) {
                // Split line by comma
                String tempArray[] = dataToRead.split(",");
                // Store each item in appropriate variable
                String name = tempArray[0];
                Double price = Double.parseDouble(tempArray[1]);
                String processorName = tempArray[2];
                String memoryType = tempArray[3];
                String storageType = tempArray[4];
                Double cpuSpeed = Double.parseDouble(tempArray[5]);
                Integer storageSpace = Integer.parseInt(tempArray[6]);
                Boolean is64Bit = Boolean.parseBoolean(tempArray[7]);
                // Create new computer instance with all variables
                Act13_Computer tempComputer = new Act13_Computer(name, price, processorName, memoryType,
                        storageType, cpuSpeed, storageSpace, is64Bit);
                // Add computer instance to arraylist
                list.add(tempComputer);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }// end loadFile

    public static int searchArray(ArrayList<Act13_Computer> list, String searchTerm) {
        // Loop through array, and search for term until found, then return the index of
        // that term
        // If no index, simply return -1
        for (int i = 0; i < list.size(); i++) {
            Act13_Computer computer = list.get(i);
            if (searchTerm.equalsIgnoreCase(computer.name)) {
                return i;
            }
        }
        return -1;
    }

    public static void searchAndPrintByRam(ArrayList<Act13_Computer> list, String ramType) {
        // Loop through array and search for all matching ram type computers and output
        // them
        System.out.println(Library.TEXT_GREEN + "All " + ramType.toUpperCase() + " RAM"
                + Library.TEXT_RESET);
        for (int i = 0; i < list.size(); i++) {
            Act13_Computer computer = list.get(i);
            if (ramType.equalsIgnoreCase(computer.getRamType().toLowerCase())) {
                System.out.println(computer);
            }
        }
        printBreak();
    }

    public static void totalAveragePrices(ArrayList<Act13_Computer> list) {
        // Decalare method variables
        Double priceTotal = 0.0;
        Double numberOfPrices = 0.0;
        // Loop through, add all prices to totalprice and number of prices
        for (int i = 0; i < list.size(); i++) {
            Act13_Computer computer = list.get(i);
            priceTotal += computer.getPrice();
            numberOfPrices++;

        }
        // Divide total price by number of prices
        Double average = priceTotal / numberOfPrices;
        // Output final calculations
        System.out.println("The total price of all computers combined is: $" + Library.df.format(priceTotal));
        System.out.println("The average of all the prices of every single computer is: $" + Library.df.format(average));
    }

    public static void printBreak() {
        // Print the same break 20 times
        for (int i = 0; i < 20; i++) {
            System.out.print(Library.TEXT_BLACK + "⸻ " + Library.TEXT_RESET);
        }
        System.out.println("");
    }

    public static void saveFile(String filename, ArrayList<Act13_Computer> tempList) {
        try {
            // Instantiate a new printwriter to write to the file
            PrintWriter file = new PrintWriter(new FileWriter(filename));

            for (int i = 0; i < tempList.size(); i++) {
                // Get the CSV string of the computer
                String toSave = tempList.get(i).toCSVString();
                // Save the CSV string to the file
                file.println(toSave);
            }
            file.close();
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
    }// end saveFile

    public static void selectionSort(ArrayList<Act13_Computer> list) {
        // CPU Sort
        // Sort by a String instance variable using Selection Sort and print out the
        // results
        int size = list.size();
        for (int i = 0; i < size - 1; i++) {
            int firstMin = i;
            for (int j = i + 1; j < size; j++) {
                if (list.get(j).cpu.compareToIgnoreCase(list.get(firstMin).cpu) < 0) {
                    firstMin = j;
                }
            }
            if (firstMin != i) {
                Act13_Computer temp = list.get(i);
                list.set(i, list.get(firstMin));
                list.set(firstMin, temp);
            }
        }
    }// end selectionSortStrings

    public static void insertionSort(ArrayList<Act13_Computer> list) {
        int size = list.size();
        for (int i = 1; i < size; i++) {
            int pointerOne = i;
            while (pointerOne > 0 && list.get(pointerOne - 1).cpuSpeed > list.get(pointerOne).cpuSpeed) {
                Act13_Computer temp = list.get(pointerOne);
                list.set(pointerOne, list.get(pointerOne - 1));
                list.set(pointerOne - 1, temp);
                pointerOne -= 1;
            }
        }
    }// end selectionSortDoubles

    public static void bubbleSort(ArrayList<Act13_Computer> list) {
        boolean swap = true;
        while (swap) {
            swap = false;
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i).price > list.get(i + 1).price) {
                    swap = true;
                    Act13_Computer temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);
                }
            } // for
        } // while
    }// end bubbleSortDoubles

    public static int binarySearch(ArrayList<Act13_Computer> list, Double searchTerm) {
        int start = 0;
        int end = list.size() - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (searchTerm.equals(list.get(mid).price)) {
                return mid;
            } else if (searchTerm.compareTo(list.get(mid).price) > 0) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        } // while

        return -1;
    }// binarySearchStrings

}