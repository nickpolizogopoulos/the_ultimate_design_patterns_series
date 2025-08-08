package part_1.p4.Strategy;

public class BlackAndWhiteFilter implements Filter {

    @Override
    public void apply(String fileName) {
        System.out.println("Applying B&W filter");
    }
}
