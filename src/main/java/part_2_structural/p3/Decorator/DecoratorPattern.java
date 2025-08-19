package part_2_structural.p3.Decorator;

// The Decorator Design Pattern by GoF.
// To demonstrate the Decorator pattern, this example focuses on creating an app that stored data in the cloud
// but before storing it, it makes sure to enhance the data (add behavior) with encryption and/or compression.

public class DecoratorPattern {
    public static void main() {
        System.out.println("========= Decorator Pattern =========");

        CloudStream cloudStream = new CloudStream();
        storeCreditCard( new EncryptedCloudStream(new CompressedCloudStream(cloudStream)) );
    }

    public static void storeCreditCard(Stream stream) {
        stream.write("1234-1234-1234-1234");
    }

}
