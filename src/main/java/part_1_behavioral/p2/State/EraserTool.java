package part_1_behavioral.p2.State;

public class EraserTool implements Tool {


    @Override
    public void mouseDown() {
        System.out.println("Cursor: Eraser");
    }
    @Override
    public void mouseUp() {
        System.out.println("Erase something");
    }
}
