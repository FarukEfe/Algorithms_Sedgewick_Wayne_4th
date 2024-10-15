package S1._1_3.Exercises;

public class _1_3_26 extends _1_3_20<String> {
    
    public void remove(String key) {

        // Start from 1st element
        Node node = this.first;
        // Set index to 1 (0 is the initial case)
        int i = 1;
        // Iterate through items
        while (i < this.N) {
            // If current node (which represents i - 1)
            if (node.item == key) {
                delete(i - 1); // This is not efficient. "delete" is already 2*n and we're doing this for each entry in the list (potentially). Polynomial complexity
            } else {
                i++;
            }
        }
    }
}
