package part_1_behavioral.p8.Mediator;

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
