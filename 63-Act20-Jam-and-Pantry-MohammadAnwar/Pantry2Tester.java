
public class Pantry2Tester {
    public static void run() {

        // Hubbard's Pantry Tests - 2 jars
        Library.print("Testing Hubbard's Pantry");
        // Jam objects are created and assigned the initial value amount
        ExpirationDate date1 = new ExpirationDate(05, 12, 2023, 100);
        // Create two jars of jam
        Jam strawberry = new Jam("Strawberry", date1, 120);
        Jam raspberry = new Jam("Raspberry", "09122023", 80);
        // Create the pantry
        Pantry2 hubbardPantry = new Pantry2(strawberry, raspberry);

        System.out.println(hubbardPantry);

        // Spread jam 1
        spreadLeJam(hubbardPantry, 1, 32);
        spreadLeJam(hubbardPantry, 1);

        // Spread jam 2
        spreadLeJam(hubbardPantry, 1, 45);
        spreadLeJam(hubbardPantry, 2);

        // Spread jam 3
        spreadLeJam(hubbardPantry, 1, 12);
        spreadLeJam(hubbardPantry, 3);

        // Spread jam random num
        spreadLeJam(hubbardPantry, Library.random(1, 4));
        spreadLeJam(hubbardPantry, Library.random(1, 4), Library.random(1, 38));

        // ************************************
        // Buckland's Pantry Tests - 1 jar
        Library.printBigBreak();
        Library.printBreak();
        Library.printBreak();
        Library.printBigBreak();

        Library.print("Testing Buckland's Pantry");
        // Create one jar of jam
        ExpirationDate appleDate = new ExpirationDate(15, 02, 2023, 100);
        Jam apple = new Jam("Apple", appleDate, 1200);
        // Create the pantry
        Pantry2 bucklandPantry = new Pantry2(apple);

        System.out.println(bucklandPantry);

        // Spread jam 1
        spreadLeJam(bucklandPantry, 1, 50);
        spreadLeJam(bucklandPantry, 1);

        // Spread jam 2
        spreadLeJam(bucklandPantry, 1, 19);
        spreadLeJam(bucklandPantry, 2);

        // Spread jam 3
        spreadLeJam(bucklandPantry, 1, 23);
        spreadLeJam(bucklandPantry, 3);

        // Spread jam random num
        spreadLeJam(bucklandPantry, Library.random(1, 4));
        spreadLeJam(bucklandPantry, Library.random(1, 4), Library.random(1, 50));

        // ************************************
        // Chong Pantry Tests - 3 jar
        Library.printBigBreak();
        Library.printBreak();
        Library.printBreak();
        Library.printBigBreak();

        Library.print("Testing Chong's Pantry");
        ExpirationDate cherryDate = new ExpirationDate(15, 02, 2024, 100);
        ExpirationDate creamyCherryDate = new ExpirationDate(12, 05, 2023, 100);

        // Create two jars of jam
        Jam cherry = new Jam("Cherry", cherryDate, 900);
        Jam creamyCherry = new Jam("Creamy Cherry", creamyCherryDate, 100);
        Jam bigCherry = new Jam("Big Cherry", "01192023", 1000);
        // Create the pantry
        Pantry2 chongPantry = new Pantry2(cherry, creamyCherry, bigCherry);
        System.out.println(chongPantry);

        // Spread jam 1
        spreadLeJam(chongPantry, 1);

        // Spread jam 2
        spreadLeJam(chongPantry, 2);

        // Spread jam 3
        spreadLeJam(chongPantry, 3);

        // Spread jam random num
        spreadLeJam(chongPantry, Library.random(1, 1000));

    }

    private static void spreadLeJam(Pantry2 pantry, int jamNum) {
        Library.print("Spreading Jam " + jamNum);
        if (pantry.select(jamNum)) {
            pantry.spread(Library.random(Library.random(1, 50), Library.random(100, 1000)));
        }
        System.out.println(pantry);
    }

    private static void spreadLeJam(Pantry2 pantry, int jamNum, int jamSpread) {
        Library.print("Spreading Jam " + jamNum);
        if (pantry.select(jamNum)) {
            pantry.spread(jamSpread);
        }
        System.out.println(pantry);
    }
}
