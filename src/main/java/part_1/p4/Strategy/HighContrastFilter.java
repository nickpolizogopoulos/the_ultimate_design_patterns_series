package part_1.p4.Strategy;

public class HighContrastFilter implements Filter {

    @Override
    public void apply(String fileName) {
        System.out.println("Applying High Contrast filter");
    }
}
