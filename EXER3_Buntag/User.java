public class User {
    public static void main(String[] args) {
        UserProfile user = new UserProfile("Eunice", 20);

        System.out.println("Name: " + user.getName());
        System.out.println("Age: " + user.getAge());

        user.updateIntake(250);
        user.updateIntake(500);

        System.out.println("Total Intake: " + user.getTotalIntake() + " ml");

        user.resetDailyIntake();
        System.out.println("After reset: " + user.getTotalIntake() + " ml");
    }
}