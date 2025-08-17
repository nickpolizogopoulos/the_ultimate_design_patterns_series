package part_2_structural.p2.Adapter;

public class VividFilter implements Filter {

    @Override
    public void apply(Image image) {
        System.out.println("Applying Vivid Filter");
    }

}
