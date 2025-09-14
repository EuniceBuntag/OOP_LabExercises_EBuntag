public class UserProfile {
    private String name;
    private int age;
    private int totalIntake; // in ml

    public UserProfile(String name, int age) {
        this.name = name;
        this.age = age;
        this.totalIntake = 0;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public int getTotalIntake() { return totalIntake; }

    public void updateIntake(int amount) {
        this.totalIntake += amount;
    }

    public void resetDailyIntake() {
        this.totalIntake = 0;
    }

    public void setTotalIntake(int totalIntake) {
        this.totalIntake = totalIntake;
    }
}