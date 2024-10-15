package S1._1_3;

import java.util.Iterator;

public class MyStack<Item> implements Iterable<Item> {

    @SuppressWarnings("unchecked")
    private Item[] items = (Item[]) new Object[1];
    int length = 0;

    @SuppressWarnings("unchecked")
    private void resize(int max) {
        Item[] temp = (Item[]) new Object[max];
        for (int i=0;i<this.length;i++) {
            temp[i] = this.items[i];
        }
        this.items = temp;
    }

    public void push(Item item) {
        if (this.length == this.items.length) resize(this.items.length * 2);
        this.items[this.length++] = item;
    }

    public Item pop() {
        if (this.length == 0) {
            System.out.println("Stack underflow.");
            return null;
        }
        Item item = this.items[--this.length];
        this.items[this.length] = null;
        if (this.length <= this.items.length / 4) resize(this.items.length / 2);
        return item;
    }

    @Override
    public Iterator<Item> iterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'iterator'");
    }

}
