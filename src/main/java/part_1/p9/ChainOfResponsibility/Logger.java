package part_1.p9.ChainOfResponsibility;

public class Logger extends Handler {

    public Logger(Handler successor) {
        super(successor);
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        System.out.println("Logging.");
        return false;
    }

}
