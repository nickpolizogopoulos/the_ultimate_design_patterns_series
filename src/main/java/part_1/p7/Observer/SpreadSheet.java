package part_1.p7.Observer;

public class SpreadSheet implements Observer {

    @Override
    public void update() {
        System.out.println("SpreadSheet got notified.");
    }

}
