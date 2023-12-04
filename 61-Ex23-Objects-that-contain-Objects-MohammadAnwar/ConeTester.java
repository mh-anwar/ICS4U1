public class ConeTester {
    public static void run() {
        Cone cone = new Cone(1.2, 4.56);
        System.out.println("Cone Area: " + cone.area());
        System.out.println("Cone Volume: " + cone.volume());
        System.out.println("Cone Radius: " + cone.getRadius());
        System.out.println("Cone Height: " + cone.getHeight());

        cone.setHeight(7.6);
        cone.setRadius(4.9);

        System.out.println("Cone Height after Setter used: " + cone.getHeight());

        System.out.println("Cone Radius after Setter used: " + cone.getRadius());

        System.out.println("Cone Area after setters: " + cone.area());
        System.out.println("Cone Volume after setters: " + cone.volume());
    }
}