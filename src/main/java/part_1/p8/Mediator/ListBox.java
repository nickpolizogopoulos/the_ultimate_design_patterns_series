package part_1.p8.Mediator;

public class ListBox extends UIControl {

    private String selectedItem;

    public ListBox(DialogBox owner) {
        super(owner);
    }

    public String getSelectedItem() {
        return selectedItem;
    }

    public void setSelectedItem(String selectedItem) {
        this.selectedItem = selectedItem;
        owner.changed(this);
    }

}
