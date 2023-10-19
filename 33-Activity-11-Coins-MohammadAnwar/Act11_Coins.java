import java.text.DecimalFormat;
public class Act11_Coins {
    DecimalFormat df = new DecimalFormat("#.00");
    
    // Instance variables
    private double radius;
    private String coinName;
    private double coinValue;
    private double weight;

    // Create constructor
    public Act11_Coins(String name, double radius, double value, double weight) {
        this.coinName = name;
        this.radius = radius;
        this.coinValue = value;
        this.weight = weight;
    }

    // Calculate circumference and print it
    public void printCircumference() {
        double circumference = Math.PI * (radius * 2);
        System.out.println("A " + coinName + "'s circumference is " + df.format(circumference) + " millimetres.");
    }

    // Calculate area and print it
    public void printArea() {
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("The surface area of one side of a " + coinName + " is " + df.format(area) + " millimetres squared");
    }

    // Return the coin name
    public String getCoinName(){
        return coinName;
    }

    // Return the radius
    public double getRadius(){
        return radius;
    }

    // Print the value of the coin
    public void printValue(){
        System.out.println(coinName + " has a value of " + df.format(coinValue) + " cents");
    }

    // Deflate the coin value
    public void deflate(double percentage){
        // Calculate the value of deflation
        double deflationValue = coinValue * (percentage/100);
        if((coinValue - deflationValue) > weight){
            // If the coin value is projected to be greater than the weight, then subtract it and output it
            coinValue -= deflationValue;
            System.out.println("The value has been deflated by: " + percentage + "%");
        } else {
            // Set the coin value to the weight, then output it
            coinValue = weight;
            System.out.println("The value has been deflated to it's minimum: " + weight);
        }
    }
}// end class