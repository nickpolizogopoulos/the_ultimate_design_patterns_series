package part_2_structural.p3.Decorator;

public class CompressedCloudStream implements Stream {

    private Stream stream;

    public CompressedCloudStream(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void write(String data) {
        var compressedData = compress(data);
        stream.write(compressedData);
    }

    // dummy implementation - this implements the compression logic.
    private String compress(String data) {
        return data.substring(0, 5);
    }

}
