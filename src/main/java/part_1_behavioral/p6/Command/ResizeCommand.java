package part_1_behavioral.p6.Command;

import part_1_behavioral.p6.Command.fx.Command;

public class ResizeCommand implements Command {

    @Override
    public void execute() {
        System.out.println("Resizing Image");
    }
}
