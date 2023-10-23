public class LawnClient {

	public String name;
	protected String address;
	public int lawnSize;
	public boolean hasDog;
	public double outstandingFees;

	// Constructor Method
	public LawnClient(String n, String a, int s, boolean d) {
		name = n;
		address = a;
		lawnSize = s;
		hasDog = d;
		outstandingFees = 0;
	}

	// This second constructor for new clients with outstanding fees
	public LawnClient(String n, String a, int s, boolean d, double f) {
		name = n;
		address = a;
		lawnSize = s;
		hasDog = d;
		outstandingFees = f;	}

	// Instance Methods

	public String toString() { 
		return name + " Lawn: " + lawnSize + "  sq metres. Dog: " + hasDog + " Currently owing: " + outstandingFees;
	}// toString

	public void mowLawn() {
		double mowFee = 10;
		mowFee += lawnSize * 0.50;
		if (hasDog){
			mowFee += 15;
		}
		outstandingFees += mowFee;
		System.out.println("Today's ෴ fee is $" + mowFee);
		System.out.println(name + " you now owe a total of ෴ $" + outstandingFees);
	}// mowLawn

	public void processPayment(double payment) {		
		
	}// processPayment

	public void delinquentFees() {
		

	}// deliquent

}// class