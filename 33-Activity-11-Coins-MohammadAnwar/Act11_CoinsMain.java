import java.util.Arrays;
import java.util.ArrayList;
public class Act11_CoinsMain {

    public static void run() {
		// Instantiate new coins
		Act11_Coins nCoin = new Act11_Coins("Nickel", 10.6, 5, 3.95);
		Act11_Coins dCoin = new Act11_Coins("Dime", 9.015, 10, 1.75);
		Act11_Coins qCoin = new Act11_Coins("Quarter", 11.94, 25, 4.4);
		Act11_Coins lCoin = new Act11_Coins("Loonie", 13.25, 100, 6.27);
		Act11_Coins tCoin = new Act11_Coins("Toonie", 14, 200, 6.92);

		// Create a new arraylist holding all the coins
		ArrayList<Act11_Coins> coinList = new ArrayList<Act11_Coins>(
			Arrays.asList(nCoin, dCoin, qCoin, lCoin, tCoin)
		);

		// Loop through the list
		for(int i = 0; i < coinList.size(); i ++){
			// Get each coin
			Act11_Coins coin = coinList.get(i);
			// Print it's area, circumference and value
			coin.printArea();
			coin.printCircumference();
			coin.printValue();
			// Deflate value by 25 and output it's value
			coin.deflate(25);
			coin.printValue();
			// Deflate value by 50 and output it's value
			coin.deflate(50);
			coin.printValue();
			// Print the line break
			System.out.println("♋♋♋♋♋♋♋");
			System.out.println();
		}
}// end run

}// end class