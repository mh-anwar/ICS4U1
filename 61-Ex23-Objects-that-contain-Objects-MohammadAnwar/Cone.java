public class Cone {
    // instance variables with encapsulation (Private)
    private double radius; // radius of the Base
    private double height; // height of the cone

    // constructor
    public Cone(double rad, double height) {
        radius = rad;
        this.height = height;
    }// end cunstructor

    public double area() {
        return Math.PI * radius * (radius + Math.sqrt(height * height + radius * radius));
    }

    public double volume() {
        return Math.PI * radius * radius * height / 3.0;
    }

    // getter Methods
    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }

    // setter Methods
    public void setHeight(double height) {
        if (height >= 0) {
            this.height = height;
        }

    }

    public void setRadius(double radius) {
        if (radius >= 0) {
            this.radius = radius;
        }
    }
}