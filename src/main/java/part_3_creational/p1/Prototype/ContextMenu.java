package part_3_creational.p1.Prototype;

public class ContextMenu {

    public void duplicate(Component component) {
        Component newComponent = component.clone();
        // logic to add the component to the document.
    }
}
