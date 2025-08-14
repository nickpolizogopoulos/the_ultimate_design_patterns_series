package part_1_behavioral.p9.ChainOfResponsibility;

public class Compressor extends Handler {

    public Compressor(Handler successor) {
        super(successor);
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        System.out.println("Compressing.");
        return false;
    }
}
