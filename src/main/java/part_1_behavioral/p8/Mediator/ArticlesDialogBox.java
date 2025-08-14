package part_1_behavioral.p8.Mediator;

public class ArticlesDialogBox {

    private ListBox articlesListBox = new ListBox();
    private TextBox titleTextBox = new TextBox();
    private Button saveButton = new Button();

    public ArticlesDialogBox() {
        articlesListBox.addEventHandler(this::articleSelected);
        titleTextBox.addEventHandler(this::titleChanged);
    }

    public void simulateUserInteraction() {
        articlesListBox.setSelectedItem("Article 1");

        // user clears the content:
        titleTextBox.setContent("");

        // user sets new the content:
        titleTextBox.setContent("My Article");

        System.out.println("Textbox: \"" +  titleTextBox.getContent() + "\"");
        System.out.println("Save Button: " + (saveButton.isEnabled() ? "Enabled" : "Disabled"));
    }

    private void titleChanged() {
        var content = titleTextBox.getContent();
        var isEmpty = (content == null || content.isEmpty());
        saveButton.setEnabled(!isEmpty);
    }

    private void articleSelected() {
        titleTextBox.setContent(articlesListBox.getSelectedItem());
        saveButton.setEnabled(true);
    }

}
