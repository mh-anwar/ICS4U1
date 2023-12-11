public class Video {
	private String title; // name of the item
	private int length; // number of minutes
	private boolean avail; // is the video in the store?
	private double price; // price, in cents

 	// constructor 1
	public Video(String ttl, double pr) {
		title = ttl;
		length = 90;
		avail = true;
		price = pr;
	}

	// constructor 2
	public Video(String ttl, int lngth, double pr) {
		title = ttl;
		length = lngth;
		avail = true;
		price = pr;
	}


	public String toString() {
		return title + ", " + length + " min. Available: " + avail + " Price: " + price + " cents";
	}

  
	// Setters and Getters
	public String getTitle() {
		return title;
	}

	public void setTitle(String ttl) {
		title = ttl;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int lng) {
		length = lng;
	}

	public boolean getAvailable() {
		return avail;
	}

	public void setAvailable(boolean avl) {
		avail = avl;
	}
}
