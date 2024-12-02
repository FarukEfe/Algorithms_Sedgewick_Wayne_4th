package S4._4_2;

import java.util.*;

public class Digraph {

    private final int V;
    private final List<List<Integer>> adj;
    
    public Digraph(int V) {

        this.V = V;
        this.adj = new ArrayList<List<Integer>>();
        for (int i=0; i < V; i++) {
            this.adj.set(i, new ArrayList<Integer>());
        }
    }

    public void addEdge(int v, int w) {
        List<Integer> adjs = this.adj.get(v);
        adjs.add(w);
    }

    public List<Integer> adj(int v) { return this.adj.get(v); }

    public int V() { return this.V; }
}
