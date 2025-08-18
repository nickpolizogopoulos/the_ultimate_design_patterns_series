package part_2_structural.p4.Facade;

public class NotificationServer {

    public Connection connect(String ipAddress) {
        return new Connection();
    }

    public AuthToken authenticate(String appID, String key) {
        return new AuthToken();
    }

    public void send(AuthToken authToken, Message message, String target) {
        System.out.println("Sending a message.");
    }

}
