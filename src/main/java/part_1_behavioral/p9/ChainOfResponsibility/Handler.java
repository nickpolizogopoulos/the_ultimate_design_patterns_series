package part_1_behavioral.p9.ChainOfResponsibility;

public abstract class Handler {

    private Handler successor;

    public Handler(Handler successor) {
        this.successor = successor;
    }

    public void handle(HttpRequest request) {
        if (doHandle(request))
            return;

        if (successor != null)
            successor.handle(request);
    }

    public abstract boolean doHandle(HttpRequest request);

}
