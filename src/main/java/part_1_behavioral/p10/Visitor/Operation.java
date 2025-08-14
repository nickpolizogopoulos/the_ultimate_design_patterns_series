package part_1_behavioral.p10.Visitor;

public interface Operation {

    void apply(HeadingNode heading);
    void apply(AnchorNode heading);

}
