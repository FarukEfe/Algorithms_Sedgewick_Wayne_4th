package S4._4_4;

public class WeightedEdge {
    
    private int v;
    private int w;
    private double weight;

    public WeightedEdge(int v, int w, double weight) {
        this.v = v; this.w = w; this.weight = weight;
    }

    public double weight() { return this.weight; }

    public int one(int v) { if (v == this.v) return this.v; else return this.w; }

    public int other(int v) { if (v == this.v) return this.w; else return this.v; }
}
