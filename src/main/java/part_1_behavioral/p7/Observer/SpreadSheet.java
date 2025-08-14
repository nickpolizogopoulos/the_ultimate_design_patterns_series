package part_1_behavioral.p7.Observer;

public class SpreadSheet implements Observer {

    // The Push Style of communication
//    @Override
//    public void update(int value) {
//        System.out.println("SpreadSheet got notified, value is: " + value);
//    }

    // The Pull Style of communication
    private DataSource dataSource;

    public SpreadSheet(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void update() {
        System.out.println("SpreadSheet got notified, value is: " + dataSource.getValue());
    }

}
