package part_2_structural.p7.Proxy;

public class LoggingEbookProxy implements Ebook {

    private String fileName;
    private Ebook ebook;

    public LoggingEbookProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void show() {
        if (ebook == null)
            ebook = new RealEbook(fileName);
        //
        // logging/auth logic should be implemented here.
        //
        ebook.show();
    }

    @Override
    public String getFilename() {
        return fileName;
    }
}
