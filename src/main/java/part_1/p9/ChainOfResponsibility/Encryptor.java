package part_1.p9.ChainOfResponsibility;

public class Encryptor extends Handler {

    public Encryptor(Handler successor) {
        super(successor);
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        System.out.println("Encrypting.");
        return false;
    }

}
