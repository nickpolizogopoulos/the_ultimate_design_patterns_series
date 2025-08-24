package part_3_creational.p2.Singleton;

// The Singleton Design Pattern by GoF.
// To demonstrate the Singleton pattern, this example focuses on Managing Application Settings inside a Singleton Class.

public class SingletonPattern {
    public static void main() {
        System.out.println("========= Singleton Pattern =========");

        ConfigManager manager = ConfigManager.getInstance();
        manager.set("name", "Nick");

        ConfigManager newManager = ConfigManager.getInstance();
        System.out.println(newManager.get("name"));

    }
}
