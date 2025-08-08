package part_1.p4.Strategy;

public class JpegCompressor implements Compressor {

    @Override
    public void compress(String fileName) {
        System.out.println("Compressing using JPEG");
    }
}
