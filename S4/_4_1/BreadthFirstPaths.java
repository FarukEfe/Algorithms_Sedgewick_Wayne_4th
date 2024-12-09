package S4._4_1;

import java.util.Queue;

public class BreadthFirstPaths {
    
    private boolean[] marked;
    private int[] edgeTo;
    private final int s;

    public BreadthFirstPaths(Graph G, int s) {
        this.marked = new boolean[G.V()];
        this.edgeTo = new int[G.V()];
        this.s = s;
        this.bfs(G, s);
    }

    private void bfs(Graph G, int s) {
        // ...
    }
}
