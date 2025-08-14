package part_1_behavioral.p6.Command.editor;

public interface UndoableCommand extends Command {
    void unexecute();
}
