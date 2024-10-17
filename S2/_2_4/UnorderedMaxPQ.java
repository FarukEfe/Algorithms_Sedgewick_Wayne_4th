package S2._2_4;

// Unordered: No Heap
@SuppressWarnings("unchecked")
public class UnorderedMaxPQ<Key extends Comparable<Key>> {
    
    private Key[] pq;
    private int N;

    public UnorderedMaxPQ(int capacity) { pq = (Key[]) new Comparable[capacity]; }

    private boolean less(Key item, Key compared) { return (item.compareTo(compared) < 0); }
    
    private void exch(int idx, int with) {
        Key item = this.pq[idx];
        this.pq[idx] = this.pq[with];
        this.pq[with] = item;
    }

    public boolean isEmpty() { return this.N == 0; }

    public void insert(Key x) { pq[N++] = x; }

    public Key delMax() {
        int max = 0;
        // Find max element
        for (int i=0; i<this.N; i++) { if (less(this.pq[max],this.pq[i])) max = i; }
        // Exchange max element to the end
        exch(max, this.N - 1);
        // Reduce index and nullify last (max) item
        Key maxItem = this.pq[--this.N];
        this.pq[this.N] = null;
        // Return the max element that we just deleted
        return maxItem;
    }
}
