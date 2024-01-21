package Factory;

import Factory.*;
import Root.Library;

public class FactoryBuilder {
    public static Factory createFactory(String factoryType) {
        Library.printf("What would you like to name your " + factoryType + " Factory?");
        String facName = Library.input.nextLine();

        Library.printf("What is the location of your " + factoryType + " Factory?");
        String facLocation = Library.input.nextLine();

        // Library.printf("What is the number of employees you want at this factory?");
        // int facNumEmployees = Integer.parseInt(Library.input.nextLine());

        if (factoryType == "pant") {
            return new PantFactory(facName, facLocation);
        } else if (factoryType == "shirt") {
            return new ShirtFactory(facName, facLocation);
        } else if (factoryType == "shoe") {
            return new ShoeFactory(facName, facLocation);
        }
        return new PantFactory(facName, facLocation);
    }
}