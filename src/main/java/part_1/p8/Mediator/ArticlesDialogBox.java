package part_1.p8.Mediator;

public class ArticlesDialogBox extends DialogBox {

    private ListBox articlesListBox = new ListBox(this);
    private TextBox titleTextBox = new TextBox(this);
    private Button saveButton = new Button(this);

    public void simulateUserInteraction() {
        articlesListBox.setSelectedItem("Article 1");

        // user clears the content:
        titleTextBox.setContent("");

        // user sets new the content:
        titleTextBox.setContent("My Article");

        System.out.println("Textbox: \"" +  titleTextBox.getContent() + "\"");
        System.out.println("Save Button: " + (saveButton.isEnabled() ? "Enabled" : "Disabled"));
    }

    @Override
    public void changed(UIControl control) {
        if (control == articlesListBox)
            articleSelected();
        else if (control == titleTextBox)
            titleChanged();
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
