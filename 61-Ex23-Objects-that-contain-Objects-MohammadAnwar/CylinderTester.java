public class CylinderTester {
    public static void run() {
        System.out.println("\n\n---------------Cylinder Tester---------------");
        Cylinder cylinder = new Cylinder(1.2, 4.56);
        System.out.println("Cylinder Area: " + cylinder.area());
        System.out.println("Cylinder Volume: " + cylinder.volume());
        System.out.println("Cylinder Radius: " + cylinder.getRadius());
        System.out.println("Cylinder Height: " + cylinder.getHeight());

        cylinder.setHeight(7.6);
        cylinder.setRadius(4.9);

        System.out.println("Cylinder Height after Setter used: " + cylinder.getHeight());

        System.out.println("Cylinder Radius after Setter used: " + cylinder.getRadius());

        System.out.println("Cylinder Area after setters: " + cylinder.area());
        System.out.println("Cylinder Volume after setters: " + cylinder.volume());
    }
}