package part_1_behavioral.p8.Mediator;

public class TextBox extends UIControl {

    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        notifyEventHandlers();
    }

}
