package part_1.p8.Mediator;

public class Button extends UIControl {

    private boolean isEnabled;

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
        notifyEventHandlers();
    }

}
