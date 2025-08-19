package part_2_structural.p3.Decorator;

public class EncryptedCloudStream implements Stream {

    private Stream stream;

    public EncryptedCloudStream(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void write(String data) {
        var encryptedData = encrypt(data);
        stream.write(encryptedData);
    }

    // dummy data - this implements the encryption log ic.
    private String encrypt(String data) {
        return "***************************";
    }

}
