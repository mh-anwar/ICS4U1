class MusicVideo extends Video {
	private String artist;
	private String category;

	// constructor
	public MusicVideo(String ttl, int len, String art, String cat, double pr) {
		super(ttl, len, pr);
		artist = art;
		category = cat;
	}

 	public String toString() {
		return super.toString() + " Artist: " + artist + " Style: " + category;
	}

	// Setters and Getters
	public String getArtist() {
		return artist;
	}

	public String getCategory() {
		return category;
	}

}