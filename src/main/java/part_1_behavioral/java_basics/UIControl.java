package part_1_behavioral.java_basics;

// Inheritance & Polymorphism lessons

public abstract class UIControl {

    // Inheritance lesson
    public  void enable() {
        System.out.println("Enabled");
    }

    public  void disable() {
        System.out.println("Disabled");
    }

    public  void setPosition(int x, int y) {
        System.out.println("Position set: " + x + ", " + y);
    }

    // Polymorphism lesson
    public abstract void draw();

}
