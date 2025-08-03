package part_1.java_basics;

// Abstraction lesson

public class MailService {

    public void sendEmail() {
        connect();
        authenticate();
        //send email code here
        disconnect();
    }

    private void connect() {
        System.out.println("Connect");
    }

    private void disconnect() {
        System.out.println("Disconnect");
    }

    private void authenticate() {
        System.out.println("Authenticate");
    }

}
