package part_1.p9.ChainOfResponsibility;

public class Authenticator extends Handler {

    public Authenticator(Handler successor) {
        super(successor);
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        System.out.println("Authenticating.");
        return !(
            request.getUsername() == "admin" &&
            request.getPassword() == "1234"
        );
    }

}
