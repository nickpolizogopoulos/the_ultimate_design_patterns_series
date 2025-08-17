package part_2_structural.p2.Adapter;

import part_2_structural.p2.Adapter.niceFiltersLibrary.Midnight;

// In this Implementation we use Composition,
// because our Adapter is composed of a Midnight Object.

public class MidnightFilter implements Filter {

    private Midnight midnight;

    public MidnightFilter(Midnight midnight) {
        this.midnight = midnight;
    }

    @Override
    public void apply(Image image) {
        midnight.init();
        midnight.render(image);
    }
}
