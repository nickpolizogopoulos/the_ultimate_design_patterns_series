package part_1.p10.Visitor;

public interface Operation {

    void apply(HeadingNode heading);
    void apply(AnchorNode heading);

}
