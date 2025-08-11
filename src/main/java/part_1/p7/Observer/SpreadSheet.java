package part_1.p7.Observer;

public class SpreadSheet implements Observer {

    @Override
    public void update(int value) {
        System.out.println("SpreadSheet got notified, value is: " + value);
    }

}
