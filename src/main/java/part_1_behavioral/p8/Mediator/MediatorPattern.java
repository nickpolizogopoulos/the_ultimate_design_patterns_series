package part_1_behavioral.p8.Mediator;

// The Mediator Design Pattern by GoF.
// To demonstrate the Mediator pattern, this example focuses on making a GUI Framework.

// Any developer can implement a Dialogue Box that has three components:
// A list of articles (1), a textbox/input field with the selected article title (2) and a save button (3).

public class MediatorPattern {
    public static void main() {
        System.out.println("========= Mediator Pattern =========");

        ArticlesDialogBox dialogBox = new ArticlesDialogBox();
        dialogBox.simulateUserInteraction();
    }
}
