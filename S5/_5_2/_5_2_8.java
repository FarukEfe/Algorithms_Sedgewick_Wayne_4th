package S5._5_2;

import S5._5_2.TrieST.Node;

@SuppressWarnings("rawtypes")
public class _5_2_8 extends TrieST{

    // MARK: Floor

    // MARK: Rank

    public int rank(String key) {
        return this.rank(this.root, key, 0);
    }

    // Return total # words strictly smaller than key
    public int rank(Node x, String key, int d) {

        if (x == null) return 0;

        int count = 0; // Word count for given condition
        if (x.val != null) count++;

        int c = (int) key.charAt(d);
        for (int i = 0; i<=c; i++) { // Get each next node that's smaller or equal to current character of key
            // Last character of the string should be strictly greater than any possible string, so skip
            if (d >= key.length() - 1) {
                continue;
            }
            Node next = x.next[i]; // Next node
            count += rank(next, key, d+1); // Add all extending words
        }

        return count;
    }
    
    // MARK: Select

    public String select(int k) {
        return this.select(this.root, k, new StringBuilder());
    }

    public String select(Node x, int k, StringBuilder str) {
        if (x == null) { return null; }
        if (x.val != null) { k--; }
        if (k == -1) { return str.toString(); }

        String final_str = null;
        for (int i = 0; i < x.next.length; i++) {
            StringBuilder new_prefix = new StringBuilder(str.toString());
            new_prefix.append((char) i);
            final_str = this.select(x.next[i], k, new_prefix);
            if (final_str != null) { break; }
        }
        return final_str;
    }
}
