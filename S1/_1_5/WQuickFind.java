package S1._1_5;

public class WQuickFind {
    
    private int[] id;
    private int nodes;

    // Linear time O(n)
    public WQuickFind(int nodes) {
        this.id = new int[nodes];
        for ( int i=0 ; i<nodes ; i++ ) {
            this.id[i] = i;
        }
        this.nodes = nodes;
    }

    // Constant time O(1)
    public int find(int p) { return this.id[p]; }

    public boolean connected(int p, int q) { return this.id[p] == this.id[q]; }

    // Linear time O(n) (two loops in total, 2n)
    public void union(int p, int q) {

        int p_root = this.find(p);
        int q_root = this.find(q);

        if (p_root == q_root) return; // Return if nodes are already connected
        
        // Get size of separate unions
        int p_count = 0; int q_count = 0;
        for (int i = 0; i < this.nodes ; i++ ) {
            int node = this.id[i];
            if (p_root == node) {
                p_count++;
            } else if (q_root == node) {
                q_count++;
            }
        }

        // Determine which root value will be replaced with which based on the larger union
        int change_to = q_root;
        int change_from = p_root;
        if (p_count > q_count) {
            change_to = p_root;
            change_from = q_root;
        }

        // Change all values previously belonging to the smaller component
        for ( int i = 0 ; i < this.nodes ; i++ ) {
            if (this.id[i] == change_from) {
                this.id[i] = change_to;
            }
        }
    }


}
