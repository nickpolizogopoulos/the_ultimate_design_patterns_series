package part_1.p6.Command;

import part_1.p6.Command.fx.Command;

public class BlackAndWhiteCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Black and White filter added");
    }
}
