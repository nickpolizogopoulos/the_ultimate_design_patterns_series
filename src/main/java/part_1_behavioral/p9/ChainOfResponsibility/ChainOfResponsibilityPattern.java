package part_1_behavioral.p9.ChainOfResponsibility;

// The Chain Of Responsibility Design Pattern by GoF.
// To demonstrate the Chain Of Responsibility pattern, this example focuses on making a simple Web Server.

public class ChainOfResponsibilityPattern {

    public static void main() {
        System.out.println("========= Chain Of Responsibility Pattern =========");

        // Pipeline: Authenticator -> Logger -> Compressor -> Encryptor.

        Encryptor encryptor = new Encryptor(null);
        Compressor compressor = new Compressor(encryptor);
        Logger logger = new Logger(compressor);
        Authenticator authenticator = new Authenticator(logger);

        WebServer webServer = new WebServer(authenticator);
        webServer.handle(new HttpRequest("admin", "1234"));
    }

}
