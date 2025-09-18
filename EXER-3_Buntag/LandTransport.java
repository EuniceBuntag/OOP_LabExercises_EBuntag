public class LandTransport extends Transportation {
     public LandTransport(String type) {
        super(type);
    }

    public void moveOnRoad() {
        System.out.println(getType() + " is moving along the road.");
    }
}

// Subclasses
class Truck extends LandTransport {
    public Truck(String type) {
        super(type);
    }
}

class SUV extends LandTransport {
    public SUV(String type) {
        super(type);
    }
}

class Tricycle extends LandTransport {
    public Tricycle(String type) {
        super(type);
    }
}

class Motorcycle extends LandTransport {
    public Motorcycle(String type) {
        super(type);
    }
}

class Kariton extends LandTransport {
    public Kariton(String type) {
        super(type);
    }
}