public class WaterTransport extends Transportation {
    public WaterTransport(String type) {
        super(type);
    }

    public void floatOnWater() {
        System.out.println(getType() + " is floating on the water.");
    }
}

// Subclasses
class Ferry extends WaterTransport {
    public Ferry(String type) {
        super(type);
    }
}

class Yacht extends WaterTransport {
    public Yacht(String type) {
        super(type);
    }
}