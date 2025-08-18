package part_2_structural.p4.Facade;

// The Facade Design Pattern by GoF.
// To demonstrate the Facade pattern, this example focuses on creating an app to send push notifications to users.

public class FacadePattern {
    public static void main() {
        System.out.println("========= Facade Pattern =========");

        NotificationService notificationService = new NotificationService();
        notificationService.send("message", "target user");

    }
}
