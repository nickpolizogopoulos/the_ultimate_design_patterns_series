package part_1.p2.State;

// The State Design Pattern by GoF.
// To demonstrate the State pattern, this example focuses on implementing tool switching in a graphics editor.

public class State {
    public static void main() {
        System.out.println("========= State Pattern =========");

        Canvas canvas = new Canvas();
        canvas.setCurrentTool(new EraserTool());
        canvas.mouseDown();
        canvas.mouseUp();

        // Stopwatch
//        Stopwatch stopwatch = new Stopwatch();
//        stopwatch.click();
//        stopwatch.click();
//        stopwatch.click();
    }
}
