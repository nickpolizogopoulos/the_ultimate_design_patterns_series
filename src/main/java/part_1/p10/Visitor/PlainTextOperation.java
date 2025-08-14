package part_1.p10.Visitor;

public class PlainTextOperation implements Operation {

    @Override
    public void apply(HeadingNode heading) {
        System.out.println("Extracting text from Heading Element");
    }

    @Override
    public void apply(AnchorNode heading) {
        System.out.println("Extracting text from Anchor Element");
    }
}
