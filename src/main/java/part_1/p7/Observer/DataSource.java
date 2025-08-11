package part_1.p7.Observer;

public class DataSource extends Subject {

    private int value;

    public int getValue() {
        return value;
    }

    // The Push Style of communication
//    public void setValue(int value) {
//        this.value = value;
//        notifyObservers(value);
//    }

    // The Pull Style of communication
    public void setValue(int value) {
        this.value = value;
        notifyObservers();
    }

}
