package part_2_structural.p1.Composite;

// The Composite Design Pattern by GoF.
// To demonstrate the Composite pattern, this example focuses on creating an editor similar to Keynote or PowerPoint,
// where users can add different objects and apply operations to them.
// Objects can be grouped to act as a single unit, and groups themselves can be nested and operated on in the same way.

public class CompositePattern {
    public static void main() {
        System.out.println("========= Composite Pattern =========");

        Group squares = new Group();
        squares.add(new Shape());   // square
        squares.add(new Shape());   // square

        Group circles = new Group();
        circles.add(new Shape());   // circle
        circles.add(new Shape());   // circle

        Group parentGroup = new Group();
        parentGroup.add(squares);
        parentGroup.add(circles);
        parentGroup.render();
        parentGroup.move();
    }
}
