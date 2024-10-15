package S1._1_3;

import java.util.Iterator;

public class MyRandomBag<Item> implements Iterable<Item> {

    @SuppressWarnings("unchecked")
    Item[] items = (Item[]) new Object[1];
    int N = 0;

    public boolean isEmpty() { return this.N == 0; }
    public int size() { return this.N; }

    @SuppressWarnings("unchecked")
    private void resize(int max) {
        Item[] temp = (Item[]) new Object[max];
        for (int i=0;i<this.N;i++) {
            temp[i] = this.items[i];
        }
        this.items = temp;
    }
    
    public void add(Item item) {
        if (this.N == this.items.length) this.resize(this.items.length * 2);
        this.items[this.N++] = item;
    }

    @Override
    public Iterator<Item> iterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'iterator'");
    }
    
}
