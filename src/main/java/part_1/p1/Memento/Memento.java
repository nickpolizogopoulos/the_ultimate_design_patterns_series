package part_1.p1.Memento;

// The Memento Design Pattern by GoF.
// To demonstrate the Memento pattern, this example focuses on implementing an Undo mechanism in a text editor.

public class Memento {
    public static void main() {
        System.out.println("========= Memento Pattern =========");

        Editor editor = new Editor();
        History history = new History();

        // set new content and save state.
        editor.setContent("Hello!");
        history.push(editor.createState());

        // set new content and save state.
        editor.setContent("Good morning!");
        history.push(editor.createState());

        // set new content - no save (latest saved state remains "Good morning!").
        editor.setContent("Good night!");

        // undo once, this will remove and return the last saved piece of information
        // (latest state is "Good morning!", this is what will be returned here).
        editor.restore(history.pop());
        // this will print "Good morning!"
        // System.out.println(editor.getContent());

        // undo a second time
        editor.restore(history.pop());
        // this will print "Hello!"
        System.out.println(editor.getContent());
    }
}