package S1._1_3.Exercises;

import S1._1_3.MyLinkedList;

public class _1_3_20<Item> extends MyLinkedList<Item> {

    public Item delete(int idx) throws IndexOutOfBoundsException {
        
        // If index out of bounds, throw error
        if (idx < 0 || idx >= this.N) {
            throw new IndexOutOfBoundsException("Index out of bounds, cannot delete at index that doesn't exist.");
        }
        // If index == 0, set whole chain as empty
        if (idx == 0) {
            Item item = this.first.item;
            this.first = this.first.next;
            this.N--;
            return item;
        }
        // Get node and its predecessor
        Node node = this.findAt(idx);
        Node before = this.findAt(idx - 1);
        // Skip deleting node from the chain
        before.next = node.next;
        // Reduce length of the linked list
        this.N--;
        // Return node.item
        return node.item;
    }
}
