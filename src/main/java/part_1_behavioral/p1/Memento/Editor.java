package part_1_behavioral.p1.Memento;

public class Editor {

    private String content;

    // When called, Editor saves its current state in
    // an EditorState object and return it.
    public EditorState createState() {
        return new EditorState(content);
    }

    public void restore(EditorState state) {
        this.content = state.getContent();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}