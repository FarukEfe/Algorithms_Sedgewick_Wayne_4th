package S1._1_3;

public class MyLinkedList<Item> {
    
    protected class Node {
        
        public Item item;
        public Node next;

    }

    public Node first = null;
    public int N = 0;

    public boolean isEmpty() {return this.first == null;}

    // If has_pointer == false, returns last element as usual
    // If has_pointer == true, returns last element with a non-null pointer (2nd last element)
    public Node findHead(boolean has_pointer) {
        if (this.N == 0) {
            return null;
        }
        Node node = this.first;
        int limit = (has_pointer) ? this.N - 1 : this.N;
        for (int i=0;i<limit;i++) {
            node = node.next;
        }
        return node;
    }

    public Node findAt(int idx) {

        if (idx < 0 || idx >= N) {
            System.out.println("Index out of bounds");
            return null;
        }

        Node node = this.first;
        for (int i=0;i<idx;i++) {
            node = node.next;
        }

        return node;
    }

    public void append(Item item) {

        Node elem = new Node(); elem.item = item;

        if (this.N == 0) {
            this.first = elem;
        }
        
        Node head = this.findHead(false);
        head.next = elem;
        this.N++;
    }

    public Item pop() {
        if (this.first == null) {
            System.out.println("List underflow. Cannot pop from empty list.");
            return null;
        }

        Node node = this.findHead(false);
        Node before = this.findHead(true);
        before.next = null;
        this.N--;
        return node.item;
    }

}
