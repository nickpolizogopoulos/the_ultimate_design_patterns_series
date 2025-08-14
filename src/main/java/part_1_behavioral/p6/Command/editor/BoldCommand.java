package part_1_behavioral.p6.Command.editor;

public class BoldCommand implements UndoableCommand {

    private String previousContent;
    private HtmlDocument document;
    private History history;

    public BoldCommand(HtmlDocument document,  History history) {
        this.document = document;
        this.history = history;
    }

    @Override
    public void execute() {
        previousContent = document.getContent();
        document.makeBold();
        history.push(this);
    }

    @Override
    public void unexecute() {
        document.setContent(previousContent);
    }
}
