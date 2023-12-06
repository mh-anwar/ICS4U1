public class JamTester{
  public static void run(){
    ExpirationDate date1 = new ExpirationDate(05,12,2023, 100);


    Jam jar1 = new Jam("Strawberry", date1, 30);
    Jam jar2 = new Jam("Raspberry", "02112022", 40);


    System.out.println("\nJar 1: " + jar1);
    System.out.println("\nJar 2: " + jar2);
    jar1.spread(10);
    System.out.println("\nJar 1 after spread: " + jar1);
    jar2.spread(50); //too much
    System.out.println("\nJar 2 after trying to spread too much: " + jar2);

    System.out.println("\nJar 2 Capacity: " + jar2.getCapacity());
    jar2.spread(10); //Already empty


  }
}