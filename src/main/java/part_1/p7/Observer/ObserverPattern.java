package part_1.p7.Observer;

public class ObserverPattern {

    public static void main() {
        System.out.println("========= Observer Pattern =========");

        DataSource dataSource = new DataSource();

        // Push Style of communication
//        SpreadSheet sheet = new SpreadSheet();
//        Chart chart = new Chart();

        // Pull Style of communication
        SpreadSheet sheet = new SpreadSheet(dataSource);
        Chart chart = new Chart(dataSource);

        dataSource.attach(sheet);
        dataSource.attach(chart);

        dataSource.setValue(11);
    }

}
