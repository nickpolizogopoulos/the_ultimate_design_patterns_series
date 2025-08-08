package part_1.p3.Iterator;

// Generic Interface to be used with other types as well.

public interface Iterator<T> {

    boolean hasNext();
    T currentUrl();
    void next();
}
