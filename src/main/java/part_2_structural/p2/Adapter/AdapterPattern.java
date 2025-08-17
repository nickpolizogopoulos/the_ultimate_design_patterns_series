package part_2_structural.p2.Adapter;

// The Adapter Design Pattern by GoF.
// To demonstrate the Adapter pattern, this example focuses on creating a mobile app to apply pretty filters to our photos.

import part_2_structural.p2.Adapter.niceFiltersLibrary.Caramel;

public class AdapterPattern {
    public static void main() {
        System.out.println("========= Adapter Pattern =========");

        ImageView imageView = new ImageView(new Image());
        imageView.apply(new CaramelFilter(new Caramel()));
    }
}
