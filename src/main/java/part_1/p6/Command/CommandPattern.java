package part_1.p6.Command;

// The Command Design Pattern by GoF.
// To demonstrate the Command pattern, this example focuses on making
// a GUI framework that other Developers can use to build their own GUI application.

// The second example mimics photoshop actions.

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
        CompositeCommand compositeCommand = new CompositeCommand();
        compositeCommand.addCommand(new ResizeCommand());
        compositeCommand.addCommand(new BlackAndWhiteCommand());
        compositeCommand.execute();
    }

}
