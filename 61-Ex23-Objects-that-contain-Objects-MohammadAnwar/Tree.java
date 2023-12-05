public class Tree {
    // instance variables
    private double x, y, z;
    public Cone branches;
    public Cylinder trunk;

    // constructor
    public Tree(double trRad, double trHeight, double brRad, double brHeight, double x, double y, double z) {
        trunk = new Cylinder(trRad, trHeight);
        branches = new Cone(brRad, brHeight);
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public String toString() {
        double totalHeight = branches.getHeight() + trunk.getHeight();
        double width = branches.getRadius() * 2.0;
        return "Height: " + totalHeight + ", Width: " + width + ", Area: " + this.area() + ", Volume: " + volume();
    }

    public double area() {
        double total = trunk.area() + branches.area();
        double rad = trunk.getRadius();
        double circle = Math.PI * rad * rad;
        return total - 2 * circle; // remove overlap
    }

    public double volume() {
        return trunk.volume() + branches.volume();
    }

    public void grow(double rate) {
        // increase all dimensions by rate
        branches.setHeight(branches.getHeight() * (1.0 + rate));
        branches.setRadius(branches.getRadius() * (1.0 + rate));
        trunk.setHeight(trunk.getHeight() * (1.0 + rate));
        trunk.setRadius(trunk.getRadius() * (1.0 + rate));

    }

    public Cone getBranches() {
        return branches;
    }

    public Cylinder getTrunk(){
        return trunk;
    }
}