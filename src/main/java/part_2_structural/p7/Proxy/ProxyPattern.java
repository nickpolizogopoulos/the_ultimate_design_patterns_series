package part_2_structural.p7.Proxy;

// The Proxy Design Pattern by GoF.
// To demonstrate the Proxy pattern, this example focuses on creating an App for reading ebooks
// but loading them on demand instead of getting all the data from the db on app init.

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
