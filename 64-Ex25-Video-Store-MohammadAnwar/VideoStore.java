public class VideoStore {
	public static void run() {
		Video item1 = new Video("Jaws", 120, 999);
		Video item2 = new Video("Star Wars", 1599);
		
		System.out.println(item1.toString());
		System.out.println(item2.toString());

		Movie item3 = new Movie("Matrix", 120, "Lana Wachowski", "PG-13", 1299);

		System.out.println(item3);

		MusicVideo item4 = new MusicVideo("Thriller", 14, "Michael Jackson", "Pop", 1699);
		
		System.out.println(item4);
	}
}
