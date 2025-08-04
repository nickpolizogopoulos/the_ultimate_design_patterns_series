package part_1.p2.State;

public class State {
    public static void main() {
        System.out.println("========= State Pattern =========");

        Canvas canvas = new Canvas();
        canvas.setCurrentTool(new EraserTool());
        canvas.mouseDown();
        canvas.mouseUp();
    }
}
