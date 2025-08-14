package part_1_behavioral.p1.Memento;

public class EditorState {

    private final String content;

    // Initialising the content from the Constructor.
    public EditorState(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

}