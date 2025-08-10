package part_1.p6.Command;

import part_1.p6.Command.fx.Command;

public class ResizeCommand implements Command {

    @Override
    public void execute() {
        System.out.println("Resizing Image");
    }
}
