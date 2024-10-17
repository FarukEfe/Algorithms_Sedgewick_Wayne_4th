package S2._2_4;

// Ordered: Implements Heap
@SuppressWarnings("unchecked")
public class MaxPQ<Key extends Comparable<Key>> {

    private Key[] pq;
    private int N;

    public MaxPQ(int capacity) {
        this.pq = (Key[]) new Comparable[capacity];
        this.N = 0;
    }

    // MARK: Private Helpers

    private int leftChild(int idx) {
        return idx * 2;
    }

    private int rightChild(int idx) {
        return idx * 2 + 1;
    }

    private void sink() {
        
    }

    private void swim(int i) {

    }

    // MARK: Client API

    public void insert(Key x) {
        this.pq[this.N++] = x;
        this.swim(this.N - 1);
    }

    public Key delMax() {
        this.sink();
        return null;
    }
}
