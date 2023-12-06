public class Pantry
{
  // Instance Variables
  private Jam  jar1 ;
  private Jam  jar2 ;
  private Jam  jar3 ;
  private Jam  selected ;

  // Constructors
  Pantry( Jam jar1, Jam jar2, Jam jar3 )
  {
  	this . jar1 = jar1 ;
  	this . jar2 = jar2 ;
  	this . jar3 = jar3 ;
  	selected = null ;
  }

  // Methods
  public String toString()
  {
  	String str = "";
  	str += "\n1: " +  jar1.toString()  + "\n";
  	str += "\n2: " +  jar2.toString()  + "\n";
  	str += "\n3: " +  jar3.toString()  + "\n";     
  	return str;
  }

  // assume that the user entered a correct selection, 1, 2, or 3
  public void select( int jarNumber )
  {
  	if ( jarNumber == 1 ){
  	  selected =  jar1 ;
    }
  	else if ( jarNumber == 2 ){
  	  selected = jar2 ;
    }
  	else {
  	  selected = jar3 ;
    }
  }

  // spread the selected jam
  public void spread( int ml )
  {
	  selected . spread( ml ) ;
  }
}