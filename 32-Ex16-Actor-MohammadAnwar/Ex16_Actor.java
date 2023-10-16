public class Ex16_Actor{
	//instance variables
	public String name;
	private String role;
	private double sales;
	private boolean isPro;
	
	public Ex16_Actor(String name, boolean pro){
		this.name = name; 
		role = "unassigned";
		sales = 0;
		isPro = pro;

	}//constructor


	//instance methods
	public String toString(){
		return name+"  Role: " + role+"   $" + sales+ "  Professional: " + isPro;
	}

	// Setter method
	public void setRole(String role){
		this.role = role;
	}
	// Normal method
	public void addSales (double sale){
		sales += sale;
	}
	// Getter method
	public double getSales(){
	  return sales;
	}

	public void sellTix(int numTix){
		sales += numTix * 15;
	}

	public double pay(){
		double total = 500; // base pay 
		if(isPro){
			total += 200; // extra for proffessional
		}
		total += sales * 0.33; // 33% commission
		System.out.println(name + " was paid through e-transfer: $" + total );
		return total;
	}
}//actor class