package part_2_structural.p2.Adapter.niceFiltersLibrary;

import part_2_structural.p2.Adapter.Image;

public class Midnight {

    public void init() {
        // this method is a requirement of the third party library.
        // whenever we want to use a filter, we need to call .init() first.
    }

    public void render(Image image) {
        System.out.println("Applying Midnight Filter");
    }

}
