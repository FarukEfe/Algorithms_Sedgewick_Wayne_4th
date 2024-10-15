package S1._1_3;

import java.util.Iterator;

public class MyStack<Item> implements Iterable<Item> {

    @SuppressWarnings("unchecked")
    private Item[] items = (Item[]) new Object[1];
    int length = 0;

    public void push(Item item) {
        this.items[this.length++] = item;
    }

    public Item pop() {
        if (this.length == 0) {
            System.out.println("Stack underflow.");
            return null;
        }
        Item item = this.items[--this.length];
        this.items[this.length] = null;
        return item;
    }

    @Override
    public Iterator<Item> iterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'iterator'");
    }
    
    public static void main(String[] args) {
        MyStack<Integer> st = new MyStack<Integer>();
        st.push(0);
        int num = st.pop();
        System.out.println(num);
        num = st.pop();
        System.out.println(num);
    }
}
