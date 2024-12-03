package S5._5_2;

public class TrieST<Value> {
    private final static int R = 256;
    private Node root = new Node();

    protected static class Node {
        private Object val;
        private Node[] next = new Node[R];
    }

    public Node[] nextNodes(Node x) {
        return x.next;
    }

    public Node getRoot() {
        return this.root;
    }

    public Value get(String key) {
        Node x = this.get(root, key, 0);
        if (x ==  null) return null;
        return (Value) x.val;
    }

    private Node get(Node x, String key, int d) {
        if (x == null) return null;
        if (d == key.length()) return x;
        char c = key.charAt(d);
        return this.get(x.next[c], key, d+1);
    }

    public void put(String key, Value val) { root = this.put(root, key, val, 0); }

    private Node put(Node x, String key, Value val, int d) {
        if (x == null) x = new Node();
        if (d == key.length()) {x.val = val; return x;}
        char c = key.charAt(d);
        x.next[c] = put(x.next[c], key, val, d+1);
        return x;
    }

    @Override
    public String toString() {
        return this.toString(this.root);
    }

    private String toString(Node x) {
        if (x == null) return "";
        String str = "";
        for (int i=0; i<x.next.length; i++) {
            Node child = x.next[i];
            str += (child == null) ? "" : ((char) i + " -> " + this.toString(child) + "\n");
        }
        return str;
    }

    public static void main(String[] args) {
        TrieST<Integer> trie = new TrieST<Integer>();
        trie.put("key", 3);
        trie.put("keen",7);
        trie.put("george", 4);
        System.out.println(trie.toString());
    }
}
