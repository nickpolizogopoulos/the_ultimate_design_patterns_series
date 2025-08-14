package part_1_behavioral.p6.Command.editor;

public class HtmlDocument {

    private String content;

    public void makeBold() {
        content = "<strong>" + content + "</strong>";
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
