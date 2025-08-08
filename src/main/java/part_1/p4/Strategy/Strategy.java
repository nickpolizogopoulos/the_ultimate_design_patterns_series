package part_1.p4.Strategy;

// The Strategy Design Pattern by GoF.
// To demonstrate the Iterator pattern, this example focuses on saving user images in various formats with filters.

public class Strategy {

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
