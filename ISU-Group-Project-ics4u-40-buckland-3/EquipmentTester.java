import Equipment.*;
import Root.Library;
import java.util.Date;

class EquipmentTester {
    public static void main(String[] args) {
        // Testing Equipment
        Furnishing myFurniture = new Furnishing("Sofa", "leather", "glossy", "seating");
        System.out.println(myFurniture);

        System.out.println("Material: " + myFurniture.getMaterial() + " | Finish: " + myFurniture.getFinish()
                + " | Category: " + myFurniture.getCategory() + " | Condition: " + myFurniture.getCondition()
                + " | Warranty: " + myFurniture.getWarranty() + " yrs");

        myFurniture.setMaterial("polymer");
        myFurniture.setCategory("bed");
        myFurniture.setFinish("matte");
        myFurniture.wearCondition();

        Library.successMsg("Changed protected variables");
        System.out.println("Material: " + myFurniture.getMaterial()
                + " | Finish: " + myFurniture.getFinish()
                + " | Category: " + myFurniture.getCategory()
                + " | Condition: " + myFurniture.getCondition());

        Library.printNiceBreak();

        // Testing Machine
        Machine lathe = new Machine("Lathe", new Date(), 20, "Reese Chong");
        System.out.println(lathe);
        System.out.println("Last Maintained: " + lathe.getLastMaintained()
                + " | Maint. Interval: " + lathe.getMaintainenceInterval()
                + " months | Operator Name: " + lathe.getOperatorName());

        Library.successMsg("Changed protected variables");
        lathe.setLastMaintained(new Date((long) Library.random(1, 2000000000)));
        lathe.setOperatorName("Momo");
        lathe.setMaintainenceInterval(10);
        System.out.println("Last Maintained: " + lathe.getLastMaintained()
                + " | Maint. Interval: " + lathe.getMaintainenceInterval()
                + " months | Operator Name: " + lathe.getOperatorName());

    }
}