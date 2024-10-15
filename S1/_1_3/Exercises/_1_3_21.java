package S1._1_3.Exercises;

import S1._1_3.MyLinkedList;

public class _1_3_21 extends MyLinkedList<String> {
    
    public boolean find(String key) {

        Node node = this.first;
        for (int i=1;i<this.N;i++) {
            if (node.item == key) {
                return true;
            }
            node = node.next;
        }

        return false;
    }
}
