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
        for (int i=0;i<this.N;i++) {
            temp[i] = this.items[i];
        }
        this.items = temp;
    }

    @SuppressWarnings("unchecked")
    public void pushLeft(Item item) {
        // Resize if the max length is reached
        if (this.N == this.items.length) this.resize(2*this.items.length);
        // Create new instance
        Item[] temp = (Item[]) new Object[this.items.length];
        // Add new item to start
        temp[0] = item;
        // Copy over the remaining items to new instance
        for (int i=0;i<this.N;i++) {
            temp[i+1] = this.items[i];
        }
        // Assign new instance to this.items
        this.items = temp;
    }

    public void pushRight(Item item) {
        // Resize if the maxt length is reached
        if (this.N == this.items.length) this.resize(2*this.items.length);
        // Push new item to the end
        this.items[this.N++] = item;
    }

    public Item popLeft() {
        Item pop = this.items[0];
        for (int i=0;i<this.N-1;i++) {
            this.items[i] = this.items[i+1];
        }
        this.items[--this.N] = null;
        if (this.N <= this.items.length / 4) this.resize(this.items.length / 2);
        return pop;
    }

    public Item popRight() {
        // Extract last item & remove from array
        Item pop = this.items[--this.N];
        this.items[this.N] = null;
        if (this.N <= this.items.length / 4) this.resize(this.items.length / 2);
        return pop;
    }

    @Override
    public Iterator<Item> iterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'iterator'");
    }
    
}
