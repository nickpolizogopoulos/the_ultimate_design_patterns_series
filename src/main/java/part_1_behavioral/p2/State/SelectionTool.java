package part_1_behavioral.p2.State;

public class SelectionTool implements Tool {

    @Override
    public void mouseDown() {
        System.out.println("Cursor: Selection");
    }

    @Override
    public void mouseUp() {
        System.out.println("Draw a dashed rectangle");
    }
}
