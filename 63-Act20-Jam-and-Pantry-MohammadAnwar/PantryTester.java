public class PantryTester
{
  public static void run ()
  {
  Jam goose = new Jam( "Gooseberry", "07042022", 120 );
  Jam apple = new Jam( "Crab Apple", "09302021", 80 );
  Jam rhub  = new Jam( "Rhubarb", "10312023", 30 );

  Pantry hubbard = new Pantry( goose, apple, rhub );
  System.out.println( hubbard );

  hubbard.select(1);
  hubbard.spread(20);
  System.out.println( hubbard );

  hubbard.select(3);
  hubbard.spread(40);
  System.out.println( hubbard );
  }
}