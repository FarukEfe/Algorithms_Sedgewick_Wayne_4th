package S4._4_4;

import java.util.ArrayList;
import java.util.List;

// Undirected Weighted Graph
public class WeightedEdgeGraph {
    
    private final int V;
    private final List<List<WeightedEdge>> adj;

    public WeightedEdgeGraph(int V) {
        this.V = V;
        this.adj = new ArrayList<List<WeightedEdge>>();
        for (int i = 0; i < V; i++) {
            this.adj.add(new ArrayList<WeightedEdge>());
        }
    }

    public void addEdge(int v, int w, double weight) {
        WeightedEdge e = new WeightedEdge(v, w, weight);
        List<WeightedEdge> v_adj = this.adj.get(v);
        List<WeightedEdge> w_adj = this.adj.get(w);
        v_adj.add(e);
        w_adj.add(e);
    }

    public List<WeightedEdge> adj(int v) { return this.adj.get(v); }

    public int V() { return this.V; }
}
