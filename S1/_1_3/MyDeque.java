package S1._1_3;

import java.util.Iterator;

public class MyDeque<Item> implements Iterable<Item> {
    
    @SuppressWarnings("unchecked")
    protected Item[] items = (Item[]) new Object[1];
    protected int N = 0;

    public boolean isEmpty() { return this.N == 0; }

    public int size() { return this.N; }

    @SuppressWarnings("unchecked")
    private void resize(int size) {
        Item[] temp = (Item[]) new Object[size];
        for (int i=0;i<this.N)
    }

    public void pushLeft() {
        this.ite
    }

    public void pushRight() {

    }

    public Item popLeft() {

    }

    public Item popRight() {

    }

    @Override
    public Iterator<Item> iterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'iterator'");
    }
    
}
