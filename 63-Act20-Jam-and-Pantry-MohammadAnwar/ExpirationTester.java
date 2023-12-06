public class ExpirationTester{
	public static void run(){
		ExpirationDate date1 = new ExpirationDate(05,12,2023, 100);
		ExpirationDate date2 = new ExpirationDate("01122023", 100);

		System.out.println(date1);
		System.out.println(date2);
	}
}