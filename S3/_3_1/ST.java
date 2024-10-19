package S3._3_1;


public class ST<Key extends Comparable<Key>, Value> {

    Key[] keys;
    Value[] vals;
    int N;
    
    public ST() {

    }

    public boolean isEmpty() { return this.N == 0; }

    private int rank(Key key) {
        int lo = 0, hi = this.N - 1;
        while (lo <= hi) {
            int idx = (lo + hi) / 2;
            Key comp = this.keys[idx];
            if (comp.compareTo(key) == 0) return idx;
            if (comp.compareTo(key) == 1) hi = idx - 1;
            else lo = idx;
       }
       return lo;
    }

    public Value get(Key key) { 
        
        if (this.isEmpty()) return null;

        int i = rank(key);
        if (i < N && this.keys[i].compareTo(key) == 0) return this.vals[i];
        return null; 
    }

    public void put(Key key, Value value) { return; }
    
    public boolean contains(Key key) { return get(key) != null; }

    public void delete(Key key) { put(key, null); }
}
