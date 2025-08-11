package part_1.p7.Observer;

public class Chart implements Observer {

    @Override
    public void update(int value) {
        System.out.println("Chart got updated, value is: " + value);
    }

}
