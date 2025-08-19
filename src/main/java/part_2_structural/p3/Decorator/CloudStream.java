package part_2_structural.p3.Decorator;

public class CloudStream implements Stream {

    @Override
    public void write(String data) {
        System.out.println("Storing " + data);
    }

}

