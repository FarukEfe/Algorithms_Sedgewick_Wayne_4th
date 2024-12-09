package S4._4_1;

import S1._1_3.Bag;

public class Graph {
    
    private final int V;
    private int E;
    private Bag<Integer>[] adj;

    public Graph(int V) {
        this.V = V;
        this.adj = (Bag<Integer>[]) new Bag[V];
        for (int v = 0; v < V; v++) {
            adj[v] = new Bag<Integer>();
        }
    }

    public int V() { return this.V; }
    public int E() { return this.E; }

    public void addEdge(int v, int w) {
        adj[v].add(w);
        adj[w].add(v);
        this.E++;
    }

    public Iterable<Integer> adj(int v) {
        return adj[v];
    }
}
