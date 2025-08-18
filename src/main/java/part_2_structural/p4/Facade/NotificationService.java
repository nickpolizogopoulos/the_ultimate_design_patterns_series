package part_2_structural.p4.Facade;

public class NotificationService {

    public void send(String message, String target) {
        NotificationServer notificationServer = new NotificationServer();

        Connection connection = notificationServer.connect("ip");
        AuthToken token = notificationServer.authenticate("appID", "key");

        notificationServer.send(token, new Message(message), target);
        connection.disconnect();
    }

}
