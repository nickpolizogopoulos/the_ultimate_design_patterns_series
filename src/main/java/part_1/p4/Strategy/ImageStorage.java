package part_1.p4.Strategy;

public class ImageStorage {

//    The private members and the Constructor is for initialising the ImageStorage object.
//    private Compressor compressor;
//    private Filter filter;

//    public ImageStorage(Compressor compressor, Filter filter) {
//        this.compressor = compressor;
//        this.filter = filter;
//    }

    public void store(String fileName, Compressor compressor, Filter filter) {
        compressor.compress(fileName);
        filter.apply(fileName);
    }

}
