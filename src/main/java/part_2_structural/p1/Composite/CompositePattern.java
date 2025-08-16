package part_2_structural.p1.Composite;

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
