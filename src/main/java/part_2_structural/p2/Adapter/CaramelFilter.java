package part_2_structural.p2.Adapter;

import part_2_structural.p2.Adapter.niceFiltersLibrary.Caramel;

// In this Implementation we use Composition,
// because our Adapter is composed of a Caramel Object.

public class CaramelFilter implements Filter {

    private Caramel caramel;

    public CaramelFilter(Caramel caramel) {
        this.caramel = caramel;
    }

    @Override
    public void apply(Image image) {
        caramel.init();
        caramel.render(image);
    }
}
