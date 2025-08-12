package part_1.p8.Mediator;

public class ListBox extends UIControl {

    private String selectedItem;

    public String getSelectedItem() {
        return selectedItem;
    }

    public void setSelectedItem(String selectedItem) {
        this.selectedItem = selectedItem;
        notifyEventHandlers();
    }

}
