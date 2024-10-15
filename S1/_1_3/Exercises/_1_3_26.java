package S1._1_3.Exercises;

public class _1_3_26 extends _1_3_20<String> {
    
    public void remove(String key) {

        // Start from 1st element
        Node node = this.first;
        // Set index to 1 (0 is the initial case)
        int i = 0;
        // Iterate through items
        while (i < this.N) {
            // If current node is 
            if (node.item == key) {
                node = node.next; // Jump to next element before deletion (don't increase index)
                delete(i); // This is not efficient. "delete" is already 2*n and we're doing this for each entry in the list (potentially). Polynomial complexity
            } else {
                // Increment i and jump to next node if not deleting
                node = node.next;
                i++;
            }
        }
    }
}
