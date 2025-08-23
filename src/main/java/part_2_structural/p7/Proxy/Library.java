package part_2_structural.p7.Proxy;

import java.util.HashMap;
import java.util.Map;

public class Library {

    private Map<String, Ebook> ebooks  = new HashMap<>();

    public void add(Ebook ebook) {
        ebooks.put(ebook.getFilename(), ebook);
    }

    public void openEbook(String filename) {
        // in a real app we should check if the ebook exists first.
        ebooks.get(filename).show();
    }

}
