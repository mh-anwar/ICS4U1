import Clothing.*;
import Root.Library;

class ClothingTester {
    public static void main(String[] args) {
        // Testing Pant
        Pant myPant = new Pant("My Pant", "linen", "sweatpant", "M");
        System.out.println(myPant);
        System.out.println("Quality Control: " + myPant.getQualityControl()
                + " | Environment Friendly: " + myPant.getEnvironmentFriendliness());

        myPant.setQualityControl(false);
        myPant.setEnvironmentFriendliness(false);
        System.out.println("(Changed both) Quality Control: " + myPant.getQualityControl()
                + " | Environment Friendly: " + myPant.getEnvironmentFriendliness());

        // Testing Shirt
        Library.printNiceBreak();
        Shirt myShirt = new Shirt("My Shirt", "cotton", "t-shirt", "M", false, "v-neck");
        System.out.println(myShirt);
        System.out.println("Quality Control: " + myShirt.getQualityControl()
                + " | Environment Friendly: " + myShirt.getEnvironmentFriendliness());

        myShirt.setQualityControl(false);
        myShirt.setEnvironmentFriendliness(false);
        System.out.println("(Changed both) Quality Control: " + myShirt.getQualityControl()
                + " | Environment Friendly: " + myShirt.getEnvironmentFriendliness());

        // Testing Shoe
        Library.printNiceBreak();
        Shoe myShoe = new Shoe("My Shoe", "rubber", "jogger", 12, true, false);
        System.out.println(myShoe);
        System.out.println("Quality Control: " + myShoe.getQualityControl()
                + " | Environment Friendly: " + myShoe.getEnvironmentFriendliness());

        myShoe.setQualityControl(false);
        myShoe.setEnvironmentFriendliness(false);
        System.out.println("(Changed both) Quality Control: " + myShoe.getQualityControl()
                + " | Environment Friendly: " + myShoe.getEnvironmentFriendliness());

        System.out.println("# of ppl who wore the shoe: " + myShoe.getNumWornBy());
        myShoe.increaseNumWornBy();
        System.out.println("# of ppl who wore the shoe: " + myShoe.getNumWornBy() + " (after increase)");
    }
}