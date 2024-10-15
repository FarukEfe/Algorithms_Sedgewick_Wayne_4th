package S1._1_3;

import java.util.Iterator;

public class Stack<Item> implements Iterable<Item> {

    private int[] items = {};
    int length = 0;

    public Stack() {
        
    }

    public void push(int item) {
        this.items[this.length++] = item;
    }

    public int pop() throws Exception {
        if (this.length == 0) {
            throw new Exception("Stack underflow.");
        }
        int item = this.items[--this.length];
        this.items[this.length] = -1;
        return item;
    }

    @Override
    public Iterator<Item> iterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'iterator'");
    }
    
}
