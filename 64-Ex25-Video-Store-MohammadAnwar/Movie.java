//Using Inheritance from a previously created class
class Movie extends Video {
	private String director; // name of the director
	private String rating; // G, PG, R, or X

	// constructor
	public Movie(String ttl, int lngth, String dir, String rtng, double pr) {
		super(ttl, lngth, pr); // use the base/parent/super class's constructor to initialize members inherited from it
		director = dir; // initialize what's new to Movie
		rating = rtng;
	}

	
	// alternate constructor
	public Movie(String ttl, String dir, String rtng, double pr) {
		super(ttl,pr); // invoke the matching parent class constructor
		director = dir; // initialize members unique to Movie
		rating = rtng;
	}

	public String toString(){
		return super.toString() + " Director: " + director + ", Rating: " + rating;
	}
	


	public String getDirector() {
		return director;
	}

	public String getRating() {
		return rating;
	}

}
