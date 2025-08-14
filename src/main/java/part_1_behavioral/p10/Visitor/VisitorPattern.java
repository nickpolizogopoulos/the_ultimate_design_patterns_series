package part_1_behavioral.p10.Visitor;

// The Visitor Design Pattern by GoF.
// To demonstrate the Visitor pattern, this example focuses on making an HTML Editor.

public class VisitorPattern {

    public static void main() {
        System.out.println("========= Visitor Pattern =========");

        HtmlDocument htmlDocument = new HtmlDocument();

        htmlDocument.addNode(new HeadingNode());
        htmlDocument.addNode(new AnchorNode());

        htmlDocument.execute(new HighlightOperation());
        htmlDocument.execute(new PlainTextOperation());

    }

}
