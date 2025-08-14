package part_1_behavioral.p3.Iterator;

// The Iterator Design Pattern by GoF.
// To demonstrate the Iterator pattern, this example focuses on a browser's history mechanism.

public class IteratorPattern {
    public static void main() {
        System.out.println("========= State Pattern =========");

        BrowserHistory history = new BrowserHistory();
        history.push("https://www.google.com");
        history.push("https://www.twitter.com");
        history.push("https://www.wikipedia.com");

        Iterator<String> iterator = history.createIterator();

        while (iterator.hasNext()) {
            var url = iterator.currentUrl();
            System.out.println(url);
            iterator.next();
        }

    }
}
