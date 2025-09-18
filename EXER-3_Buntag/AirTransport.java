public class AirTransport extends Transportation {
       public AirTransport(String type) {
        super(type);
    }

    public void navigateAir() {
        System.out.println(getType() + " is soaring through the air.");
    }
}

// Subclasses
class Helicopter extends AirTransport {
    public Helicopter(String type) {
        super(type);
    }

    public void rotateBlades() {
        System.out.println(getType() + " is rotating its blades.");
    }
}

class Airplane extends AirTransport {
    public Airplane(String type) {
        super(type);
    }

    public void land() {
        System.out.println(getType() + " is landing smoothly.");
    }
}

class SpaceShuttle extends AirTransport {
    public SpaceShuttle(String type) {
        super(type);
    }

    public void reEnter() {
        System.out.println(getType() + " is re-entering Earth’s atmosphere.");
    }
}