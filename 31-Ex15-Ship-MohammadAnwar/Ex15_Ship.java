public class Ex15_Ship {
	// Instance class, like a blueprint
	// Instance Variables
	private String name;
	private boolean inSpace;
	private String owner;
	private String captain;
	private int age;
	private int rooms;
	private String powerSource;
	
	// Constructor method
	public Ex15_Ship(String name, boolean inSpace, String owner, int age){
		this.name = name;
		this.inSpace = inSpace;
		this.owner = owner;
		this.captain = owner;
		this.age = age;
	}

	public void setCaptain(String name){
		captain = name;
	}
	
	public void setPowerSource(String source){
		powerSource = source;
	}

	public void addRooms(int roomNumbers){
		rooms += roomNumbers;
	}
	
	public void addYears(int years){
		age += years;
	}

	public String getPowerSource(){
		return powerSource;
	}	
	
	public int getRooms(){
		return rooms;
	}
	
	public int getAge(){
		return age;
	}


	// Instance Methods


	// The toString() method creates and returns a String for easier printing.
	// All Objects have a built in toString method that will naturally return the hexadecimal memory address of the instance.

	public String toString(){
		if(inSpace){
			return name + " (spaceship) Owned by: " + owner + " Captain: " + captain;
		} else {
			return name + " Owned by: " + owner + " Captain: " + captain;
		}
	}

	//toString

}// end ship class