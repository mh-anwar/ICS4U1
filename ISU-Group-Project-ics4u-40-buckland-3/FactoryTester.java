import Factory.PantFactory;
import Root.Library;

class FactoryTester {
    public static void main(String[] args) {
        PantFactory myPantFactory = new PantFactory("Liquid Factory", "Moonshine Drive");
        System.out.println(myPantFactory);
        myPantFactory.setRent(10300);

    }
}