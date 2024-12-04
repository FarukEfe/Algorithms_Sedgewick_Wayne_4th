package S5._5_3;

public class BoyerMoore {
    
    private int[] right;
    private String pat;
    private int searches;

    public BoyerMoore(String pat) {
        this.pat = pat;
        int m = pat.length();
        int R = 256;
        right = new int[R];
        for (int c = 0; c < R; c++) { right[c] = -1; }
        for (int j = 0; j < m; j++) { right[pat.charAt(j)] = j; }
        this.searches = 0;
    }

    public int search(String txt) {
        this.searches = 0;
        int n = txt.length();
        int m = pat.length();
        int skip;
        for (int i = 0; i <= n - m; i += skip) {
            skip = 0;
            for (int j = m-1; j >= 0; j--) {
                this.searches++;
                if (pat.charAt(j) != txt.charAt(i + j)) {
                    skip = j - right[txt.charAt(i+j)];
                    if (skip < 1) skip = 1;
                }
            }
            if (skip == 0) return i; // Found @ i
        }
        return -1; // Miss
    }

    public int getSearches() { return this.searches; }

    public static void main(String[] args) {
        BoyerMoore bm = new BoyerMoore("BAAAA");
        int res = bm.search("AAAAABBAAAA");
        int searches = bm.getSearches();
        System.out.println(res + " " + searches);
    }
}
