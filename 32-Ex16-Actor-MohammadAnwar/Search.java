import java.util.ArrayList;

class Search {

  public static int linearStringSearch(ArrayList<String> list, String searchTerm) {
	for (int i = 0; i < list.size(); i++) {
	  if (list.get(i).equalsIgnoreCase(searchTerm)) {
		return i;
	  }
	}
	return -1;
  }// end linearStringSearch

}//end class