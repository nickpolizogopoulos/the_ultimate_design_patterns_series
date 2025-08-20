package part_2_structural.p5.Flyweight;

public class PointIcon {

    private final PointType type;
    private final byte[] icon;

    public PointIcon(PointType type, byte[] icon) {
        this.type = type;
        this.icon = icon;
    }

    public PointType getType() {
        return type;
    }
}