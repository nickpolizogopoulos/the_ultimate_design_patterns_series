package part_1_behavioral.p2.State;

public class BrushTool implements Tool {

    @Override
    public void mouseDown() {
        System.out.println("Cursor: Brush");
    }

    @Override
    public void mouseUp() {
        System.out.println("Draw a line");
    }
}
