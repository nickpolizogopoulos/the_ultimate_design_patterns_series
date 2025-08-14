package part_1_behavioral.p7.Observer;

// The Observer Design Pattern by GoF.
// To demonstrate the Observer pattern, this example focuses on implementing a spreadsheet with two tabs.

// The first tab stores some values and a pie chart that displays them.
// In the second tab we have the total of values on the first sheet.

// When we change any value in the first sheet, the pie chart and the total value (second tab) will
// get updated at once.

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
