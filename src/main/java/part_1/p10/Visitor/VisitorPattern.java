package part_1.p10.Visitor;

public class VisitorPattern {

    public static void main() {
        System.out.println("========= Visitor Pattern =========");

        HtmlDocument htmlDocument = new HtmlDocument();

        htmlDocument.addNode(new HeadingNode());
        htmlDocument.addNode(new AnchorNode());

        htmlDocument.execute(new HighlightOperation());
    }

}
