package part_2_structural.p2.Adapter;

// In this Implementation we use Inheritance.

// This approach is not as flexible as using Composition.
// In Java we don't have multiple Inheritance, a Class can only have a Single Parent.

// In this demo, the Filter is an Interface, perfectly acceptable to have a Class that extends another
// Class and implements an Interface.
// If the Interface was an Abstract Class, we could not do this.

import part_2_structural.p2.Adapter.niceFiltersLibrary.Caramel;

public class CaramelAdapter extends Caramel implements Filter {

    @Override
    public void apply(Image image) {
        init();
        render(image);
    }
}