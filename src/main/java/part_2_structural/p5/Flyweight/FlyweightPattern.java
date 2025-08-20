package part_2_structural.p5.Flyweight;

// The Flyweight Design Pattern by GoF.
// To demonstrate the Flyweight pattern, this example focuses on creating an app like Google Maps.
// Instead of making an icon everytime we want to render a point of interest,
// We store the icons and reuse them from there.

public class FlyweightPattern {
    public static void main() {
        System.out.println("========= Flyweight Pattern =========");

        PointService pointService = new PointService(new PointIconFactory());
        for (var point : pointService.getPoints())
            point.draw();

    }
}
