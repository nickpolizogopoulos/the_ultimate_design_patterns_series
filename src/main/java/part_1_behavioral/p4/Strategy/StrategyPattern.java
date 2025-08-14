package part_1_behavioral.p4.Strategy;

// The Strategy Design Pattern by GoF.
// To demonstrate the Strategy pattern, this example focuses on saving user images in various formats with filters.

public class StrategyPattern {

    public static void main() {
        System.out.println("========= Strategy Pattern =========");

//        If we pass image specs in the Constructor
//        ImageStorage pngImageWithBnwFilter = new ImageStorage(
//                new JpegCompressor(),
//                new BlackAndWhiteFilter()
//        );

//        Passing image specs directly in .store();
        ImageStorage pngImageWithBnwFilter = new ImageStorage();
        pngImageWithBnwFilter.store("my-image.jpg", new PngCompressor(), new BlackAndWhiteFilter());

    }
}
