public class TransportationTester {
      public static void main(String[] args) {
        // Air Transport
        Helicopter heli = new Helicopter("Rescue Helicopter");
        Airplane air = new Airplane("Passenger Airplane");
        SpaceShuttle shuttle = new SpaceShuttle("SpaceX Shuttle");

        // Land Transport
        Truck truck = new Truck("Delivery Truck");
        SUV suv = new SUV("Off-road SUV");
        Tricycle tri = new Tricycle("Local Tricycle");
        Motorcycle bike = new Motorcycle("Sport Motorcycle");
        Kariton krt = new Kariton("Street Kariton");

        // Water Transport
        Ferry ferry = new Ferry("Passenger Ferry");
        Yacht yacht = new Yacht("Luxury Yacht");

        // Testing Air Transport
        heli.navigateAir();
        heli.rotateBlades();

        air.navigateAir();
        air.land();

        shuttle.navigateAir();
        shuttle.reEnter();

        // Testing Land Transport
        truck.moveOnRoad();
        suv.moveOnRoad();
        tri.moveOnRoad();
        bike.moveOnRoad();
        krt.moveOnRoad();

        // Testing Water Transport
        ferry.floatOnWater();
        yacht.floatOnWater();
    }
}