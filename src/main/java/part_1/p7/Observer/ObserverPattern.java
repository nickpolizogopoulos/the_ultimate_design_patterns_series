package part_1.p7.Observer;

public class ObserverPattern {

    public static void main() {
        System.out.println("========= Observer Pattern =========");

        DataSource dataSource = new DataSource();
        SpreadSheet sheet = new SpreadSheet();
        Chart chart = new Chart();

        dataSource.attach(sheet);
        dataSource.attach(chart);

        dataSource.setValue(10);
    }

}
