package S4._4_4;

import java.util.List;
import java.util.Dictionary;
import java.util.Hashtable;

// Weighted Line Graph
public class _4_4_31 {

    // This is going to hold distance of all vertices v from source s
    private boolean[] marked;
    private Dictionary<Integer, Double> dist_source;
    
    // Our assumption is that the graph is a connected line graph as speified in the question
    public _4_4_31(WeightedEdgeGraph G) {

        this.marked = new boolean[G.V()];
        this.dist_source = new Hashtable<Integer, Double>();

        for (int i=0; i< G.V(); i++) { this.marked[i] = false; }
        // Preprocess to get distance of all vertices from source
        // Assume source vertex is 0 and sink vertex is G.V() - 1 on the line
        double dist = 0.0;
        int v = 0;
        while (v != G.V() - 1) {

            this.marked[v] = true; // Mark v for visit
            dist_source.put(v, dist); // Store distance in dict_source

            List<WeightedEdge> v_adj = G.adj(v); // Get v-adjacents (at most 2)
            for (int i = 0; i < v_adj.size(); i++) {
                WeightedEdge e = v_adj.get(i); // Get e = v -- w
                int w = e.other(v); // Get destination w
                if (!this.marked[w]) { // Only update the undiscovered edge
                    dist += e.weight(); // Add weight to dist
                    v = w; // Update v
                }
            }
        }
        dist_source.put(v, dist); // Add final distance source -- sink
    }

    // Computed using dist(v -> w) = dist(s -> w) - dist(s -> v)
    // Distance is always positive
    public double distance(int from, int to) {
        return Math.abs(dist_source.get(to) - dist_source.get(from));
    }

    public static void main(String[] args) {
        // Establish a test graph and test the algorithm
        WeightedEdgeGraph graph = new WeightedEdgeGraph(4);
        graph.addEdge(0, 1, 0.8);
        graph.addEdge(1, 2, 1.3);
        graph.addEdge(2, 3, 0.1);
        // Test solution
        _4_4_31 solution = new _4_4_31(graph);

        double s0 = solution.distance(0, 0); // Should be 0
        double s1 = solution.distance(0, 1); // Should be 0.8
        double s2 = solution.distance(1, 3); // Should be 1.4
        double s3 = solution.distance(0, 3); // Should be 2.2
        System.out.println(s0);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
