package part_1.p6.Command.editor;

public interface UndoableCommand extends Command {
    void unexecute();
}
