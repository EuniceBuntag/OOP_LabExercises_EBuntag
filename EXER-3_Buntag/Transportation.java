public class Transportation {
      private String type;

    public Transportation(String type) {
        this.type = type;
    }

    public void operate() {
        System.out.println(type + " is operating...");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
