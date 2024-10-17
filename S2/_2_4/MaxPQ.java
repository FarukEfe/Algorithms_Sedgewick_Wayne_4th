package S2._2_4;

@SuppressWarnings("unchecked")
public class MaxPQ<Key extends Comparable<Key>> {

    private Key[] pq;
    private int N;

    public MaxPQ(int capacity) {
        this.pq = (Key[]) new Comparable[capacity];
    }

    // MARK: Private Helpers

    private int leftChild(int idx) {
        return 0;
    }

    private int rightChild(int idx) {
        return 0;
    }

    private void sink() {
        
    }

    private void swim() {

    }

    // MARK: Client API

    public void insert() {
        this.swim();
    }

    public Key delMax() {
        this.sink();
        return null;
    }
}
