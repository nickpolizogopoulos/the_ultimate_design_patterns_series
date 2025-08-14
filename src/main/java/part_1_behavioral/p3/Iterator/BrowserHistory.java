package part_1_behavioral.p3.Iterator;

public class BrowserHistory {

//    Using a List
//    private List<String> urls = new ArrayList<>();

    // Using a fixed size array
    private String[] urls = new String[10];
    private int count;

    public void push(String url) {
        //    Using a List
        //urls.add(url);

        // Using a fixed size array
        urls[count++] = url;
    }

    public String pop() {
//        Using a List
//        var lastIndex = urls.size() - 1;
//        var lastUrl = urls.get(lastIndex);
//        urls.remove(lastUrl);
//
//        return lastUrl;

        // Using a fixed size array
        return urls[--count];
    }

    //    Using a List
//    public Iterator<String> createIterator() {
//        return new ListIterator(this);
//    }

    // Using a fixed size array
    public Iterator<String> createIterator() {
        return new ArrayIterator(this);
    }

//    Using a List
//    public class ListIterator implements Iterator<String> {
//
//        private BrowserHistory history;
//        private int index;
//
//        public ListIterator(BrowserHistory history) { this.history = history; }
//
//        @Override
//        public boolean hasNext() {
//            return (index < history.urls.size());
//        }
//
//        @Override
//        public String currentUrl() {
//            return history.urls.get(index);
//        }
//
//        @Override
//        public void next() {
//            index++;
//        }
//    }

//    Using a fixed size array
    public class ArrayIterator implements Iterator<String> {

        private BrowserHistory history;
        private int index;

        public ArrayIterator(BrowserHistory history) {
            this.history = history;
        }

        @Override
        public boolean hasNext() { return (index < history.count); }

        @Override
        public String currentUrl() { return history.urls[index]; }

        @Override
        public void next() { index++; }
    }

}
