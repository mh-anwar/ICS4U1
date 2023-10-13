class Ex15_ShipMain {

    public static void run() {
        Ex15_Ship ship1 = new Ex15_Ship("Millenium Falcon", true, "Lando", 1500);
        Ex15_Ship ship2 = new Ex15_Ship("Titanic", false, "White Starline", 0);
        Ex15_Ship ship3 = new Ex15_Ship("Falcon Heavy", false, "Elon", 0);
        System.out.println(ship1);
        System.out.println(ship2);
        System.out.println(ship3);

        ship1.setCaptain("Mr. Buckland");
        System.out.println(ship1);
        
        ship2.addYears(12);
        ship2.addRooms(10);
        System.out.println(ship2.getAge());
        System.out.println(ship2.getRooms());
  
        ship3.setPowerSource("Nuclear Reactor");
        System.out.println(ship3);
        System.out.println(ship3.getPowerSource());
}// run

}// end class