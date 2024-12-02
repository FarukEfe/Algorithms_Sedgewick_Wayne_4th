package S4._4_2;

import java.util.List;

// Hamiltonian path in DAGs in linear time
public class _4_2_32 {

    private boolean pathExists; // Stores the final result of the algorithm.

    public _4_2_32(Digraph G) {

        this.pathExists = true; // Set path exists
        TopologicalSort tp = new TopologicalSort(G); // Topological Sort on Digraph
        int[] postorder = tp.sort(); // O(V + E)

        for (int i=0; i< postorder.length - 1; i++) { // End before the sink vertex
            boolean cutoff = true; // v -> w first assumed to not exist
            int v = postorder[i], w = postorder[i+1]; // v -> w
            List<Integer> adjs = G.adj(v); // Get adjecents of src
            for (int adj = 0; adj < adjs.size(); adj++) {
                if (adj == w) { // If v -> w exists, no cut-off, path continues
                    cutoff = false;
                }
            }

            if (cutoff) { // path does not exist if there's cutoff
                this.pathExists = false; return;
            }
        }
    }

    public boolean pathExists() { return this.pathExists; }
}
