package part_1_behavioral.p4.Strategy;

public class PngCompressor implements Compressor {

    @Override
    public void compress(String filePath) {
        System.out.println("Compressing using PNG");
    }
}
