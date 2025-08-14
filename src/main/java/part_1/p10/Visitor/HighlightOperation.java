package part_1.p10.Visitor;

public class HighlightOperation implements Operation {

    @Override
    public void apply(HeadingNode heading) {
        System.out.println("Highlight Heading Element");
    }

    @Override
    public void apply(AnchorNode heading) {
        System.out.println("Highlight Anchor Element");
    }
}
