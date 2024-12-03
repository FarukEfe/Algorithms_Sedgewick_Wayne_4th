package S5._5_2;

import S5._5_2.TrieST.Node;

@SuppressWarnings("rawtypes")
public class _5_2_8 {

    TrieST trie;
    
    public _5_2_8(TrieST trie) {
        this.trie = trie;
    }

    // MARK: Floor
    
    // Our key is a string and the task is to return the biggest key smaller than our key ("for 'key', 'keen' would be a good example. But not 'kez")
    public Node floor(String key) {
        // Search for key
        return this.floor(trie, trie.getRoot());
    }

    private Node floor(TrieST trie, Node x) {
        while (x != null) {
            Node[] nodes = trie.nextNodes(x);
            x = nodes[nodes.length - 1];
        }
        return x;
    }

    public Node ceil() {
        return this.ceil(trie, trie.getRoot());
    }

    private Node ceil(TrieST trie, Node x) {
        while (x != null) {
            Node[] nodes = trie.nextNodes(x);
            x = nodes[0];
        }
        return x;
    }
}
