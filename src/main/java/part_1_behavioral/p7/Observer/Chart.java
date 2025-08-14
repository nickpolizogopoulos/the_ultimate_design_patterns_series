package part_1_behavioral.p7.Observer;

public class Chart implements Observer {

    // The Push Style of communication
//    @Override
//    public void update(int value) {
//        System.out.println("Chart got updated, value is: " + value);
//    }

    // The Pull Style of communication
    private DataSource dataSource;

    public Chart(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void update() {
        System.out.println("Chart got updated, value is: " +  dataSource.getValue());
    }
}
