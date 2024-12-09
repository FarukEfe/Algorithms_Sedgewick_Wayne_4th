package S1._1_3;

import java.util.Iterator;

public class Bag<T> implements Iterable<T> {
    
    private Node first;

    private class Node {
        T item;
        Node next;
    }

    public void add(T item) {
        Node oldfirst = first;
        this.first = new Node();
        this.first.item = item;
        this.first.next = oldfirst;
    }

    @Override
    public Iterator<T> iterator() {
        // TODO Auto-generated method stub
        return new ListIterator();
    }

    private class ListIterator implements Iterator<T> {

        private Node current = first;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            T item = current.item;
            current = current.next;
            return item;
        }

    }
}
