package part_2_structural.p7.Proxy;

public class ProxyPattern {
    public static void main() {
        System.out.println("========= Proxy Pattern =========");

        Library library = new Library();
        String[] filenames = {"book1", "book2", "book3"};

        for (String filename : filenames)
            library.add(new EbookProxy(filename));

        library.openEbook("book1");

    }
}
