import java.text.DecimalFormat;
public class Building {
    // Instance variables
    private String tenant;
    private int squareFeet;
    private String location;
    private double thisYearsTotalRent;
    static DecimalFormat df = new DecimalFormat("0.00");

    // Constructor
    // Take in parameters and set them
    public Building(String tenant, int sqrFeet, String loc) {
        this.tenant = tenant;
        this.squareFeet = sqrFeet;
        this.location = loc;
        this.thisYearsTotalRent = 0;
    }

    public String toString() {
        // Output all instance variables with formatting
        return Library.TEXT_BLUE + tenant + Library.TEXT_RESET +  
            "\n- Square Footage: " + squareFeet + " sqr. ft" + 
            "\n- Location: " + location + 
            "\n- This year's rent: $" + df.format(thisYearsTotalRent) +
            Library.TEXT_YELLOW + "\n𝄜 𝄜 𝄜 𝄜 𝄜 𝄜 𝄜 𝄜 𝄜 𝄜 𝄜 𝄜 𝄜 𝄜 𝄜 𝄜 𝄜 𝄜 𝄜 𝄜 𝄜 𝄜 𝄜 𝄜 𝄜 𝄜 𝄜 𝄜\n" + Library.TEXT_RESET;
    }
    // Set the tenant
    public void setTenant(String newT){
        tenant = newT;
    }
    // Return ths years rent
    public double getThisYearsRent(){
        return thisYearsTotalRent;
    }
    // Charges and prints the rent for this month
    // It also updates the thisYearsTotalRent variable by the monthly amount
    public void chargeRent(){
        double rentAmount = 0;
        // Set rent amount based the location  ($0.10 for rural, $0.15 for industrial, $0.25 for downtown)
        if(location.equalsIgnoreCase("downtown")){
            rentAmount = 0.25;
        } else if(location.equalsIgnoreCase("industrial")){
            rentAmount = 0.15;
        } else if(location.equalsIgnoreCase("rural")){
            rentAmount = 0.10;
        }
        // Calculate this months rent by multiplying the rent amount by the square feet
        double thisMonthsRent = rentAmount  * squareFeet;
        // Output this year's rent
        System.out.println(tenant + " owes $" + df.format(thisMonthsRent) + " in rent this month");
        // Add this months rent to the total
        thisYearsTotalRent += thisMonthsRent;
    }
}