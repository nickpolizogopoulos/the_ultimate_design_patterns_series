package part_1.p6.Command;

// The Command Design Pattern by GoF.
// To demonstrate the Command pattern, this example focuses on making
// a GUI framework that other Developers can use to build their own GUI application.

// The second example mimics photoshop actions.

import part_1.p6.Command.editor.BoldCommand;
import part_1.p6.Command.editor.History;
import part_1.p6.Command.editor.HtmlDocument;
import part_1.p6.Command.editor.UndoCommand;
import part_1.p6.Command.fx.Button;
import part_1.p6.Command.fx.Command;

public class CommandPattern {

    public static void main() {
        System.out.println("========= Command Pattern =========");


//        GUI Framework example
//        CustomerService customerService = new CustomerService();
//        Command command = new AddCustomerCommand(customerService);
//        Button button = new Button(command);
//        button.click();

//        Composite Commands example
//        CompositeCommand compositeCommand = new CompositeCommand();
//        compositeCommand.addCommand(new ResizeCommand());
//        compositeCommand.addCommand(new BlackAndWhiteCommand());
//        compositeCommand.execute();

//        Html Editor with bold command example
        History history = new History();
        HtmlDocument htmlDocument = new HtmlDocument();
        htmlDocument.setContent("Hello World!");

        BoldCommand boldCommand = new BoldCommand(htmlDocument, history);
        boldCommand.execute();
        System.out.println(htmlDocument.getContent());

//        boldCommand.unexecute();

//        Undo Command
        UndoCommand undoCommand = new UndoCommand(history);
        undoCommand.execute();
        System.out.println(htmlDocument.getContent());
    }

}
