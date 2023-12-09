//****incomplete*****
public class Pantry4Tester {
    public static void run() {
        Library.print("Testing Pantry with last jar having oldest date");

        ExpirationDate date1 = new ExpirationDate(05, 12, 2023, 100);
        Jam strawberry = new Jam("Strawberry", date1, 20);
        Jam raspberry = new Jam("Raspberry", "09122023", 10);
        Jam cherry = new Jam("Cherry", "10112023", 20);

        Pantry4 Hubbard4 = new Pantry4(strawberry, raspberry, cherry);
        System.out.println(Hubbard4);
        Hubbard4.mixedFruit();
        Library.print("Mixing all fruits into one jar!");
        System.out.println(Hubbard4);

        Library.print("Testing Pantry with second jar having oldest date");
        date1 = new ExpirationDate(05, 11, 2023, 100);
        strawberry = new Jam("Strawberry", date1, 20);
        raspberry = new Jam("Raspberry", "09052023", 10);
        cherry = new Jam("Cherry", "10112023", 20);

        Hubbard4 = new Pantry4(strawberry, raspberry, cherry);
        System.out.println(Hubbard4);
        Hubbard4.mixedFruit();
        Library.print("Mixing all fruits into one jar!");
        System.out.println(Hubbard4);

        Library.print("Testing Pantry with third jar having oldest date");
        date1 = new ExpirationDate(05, 11, 2023, 100);
        strawberry = new Jam("Strawberry", date1, 20);
        raspberry = new Jam("Raspberry", "09052023", 10);
        cherry = new Jam("Cherry", "12111991", 20);

        Hubbard4 = new Pantry4(strawberry, raspberry, cherry);
        System.out.println(Hubbard4);
        Hubbard4.mixedFruit();
        Library.print("Mixing all fruits into one jar!");
        System.out.println(Hubbard4);

        Library.print("Testing Pantry with random dates");
        date1 = new ExpirationDate(05, 01, 1823, 100);
        strawberry = new Jam("Strawberry", date1, 20);
        raspberry = new Jam("Raspberry", "09051723", 10);
        cherry = new Jam("Cherry", "08111990", 20);

        Hubbard4 = new Pantry4(strawberry, raspberry, cherry);
        System.out.println(Hubbard4);
        Hubbard4.mixedFruit();
        Library.print("Mixing all fruits into one jar!");
        System.out.println(Hubbard4);
    }
}