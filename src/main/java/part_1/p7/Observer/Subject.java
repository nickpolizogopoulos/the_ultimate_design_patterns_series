package part_1.p7.Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new ArrayList<>();

    // add observer
    public void attach(Observer observer) {
        observers.add(observer);
    }

    // remove observer
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(int value) {
        for (Observer observer : observers)
            observer.update(value);
    }

}
