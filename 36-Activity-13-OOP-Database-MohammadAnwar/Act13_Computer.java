import java.util.ArrayList;
import java.io.*;

class Act13_Computer {
    // Instantiate instance variables
    public String name;
    public Double price;
    public String cpu;
    private String ramType; // ddr2/3/4/5
    private String storageType; // harddrive or ssd
    public Double cpuSpeed;
    private Integer storageCapacity;
    private Boolean is64Bit;

    public Act13_Computer(String n, Double p, String c, String r, String s, Double cs, Integer sc, Boolean bit ) {
        // Assign parameters to instance variables
        name = n;
        price = p;
        cpu = c;
        ramType = r;
        storageType = s;
        cpuSpeed = cs;
        storageCapacity = sc;
        is64Bit = bit;
    }

    public String toString(){
        // Output all information about instance
        return name + " - $" + Library.df.format(price) + 
            "\n CPU: " + cpu + " @" + cpuSpeed + " GHz" +  
            "\n RAM Type: " + ramType + 
            "\n Storage Type: " + storageType + " (" + storageCapacity + " GB) " + 
            "\n 64 Bit Architecture: " + is64Bit +
            "\n";
    }
    // Return the ram type
    public String getRamType(){
        return ramType;
    }    
    // Return the price of computer
    public Double getPrice(){
        return price;
    }
    
    // Output all information in CSV format
    public String toCSVString(){
        return name + "," + price  + "," + cpu  + "," +  ramType + 
            "," + storageType + "," + cpuSpeed + "," + storageCapacity + 
            "," + is64Bit;
    }


    public void upgradeStorage(){
        if(storageCapacity < 64){
            storageCapacity = 64;
        } else if (storageCapacity < 256){
            storageCapacity = 500;
        } else {
            storageCapacity = 1000;
        }
    }

    public void inflatePrice(){
        double inflationFactor = 2.3;
        price *= inflationFactor;
    }

    public void changeArchitecture(){
        is64Bit = !is64Bit;
    }
}