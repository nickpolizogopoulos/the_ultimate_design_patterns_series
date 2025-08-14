package part_1_behavioral.p6.Command.editor;

import java.util.ArrayList;
import java.util.List;

public class History {
    private List<Command> commands = new ArrayList<Command>();

    public void push(UndoableCommand command) {
        commands.add(command);
    }

    public UndoableCommand pop() {
        int index = commands.size() - 1;
        return (UndoableCommand) commands.remove(index);
    }

    public int size() {
        return commands.size();
    }

}
