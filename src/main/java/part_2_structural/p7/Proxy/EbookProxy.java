package part_2_structural.p7.Proxy;

public class EbookProxy implements Ebook {

    private String fileName;
    private Ebook ebook;

    public EbookProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void show() {
        if (ebook == null)
            ebook = new RealEbook(fileName);

        ebook.show();
    }

    @Override
    public String getFilename() {
        return fileName;
    }
}
