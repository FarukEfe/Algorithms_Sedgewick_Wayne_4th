package S2._2_4.Exercises;

public class _2_4_15 {
    
    public boolean is_minPQ(int[] pq) {
        
        // Iterate through all nodes that have children
        for (int i=0;i<pq.length/2;i++) {
            // Get children location
            int idx_l = 2*i + 1;
            int idx_r = 2*i + 2;
            // Get current item and their children
            int c_l = (idx_l < pq.length) ? pq[idx_l] : (int) Double.POSITIVE_INFINITY;
            int c_r = (idx_r < pq.length) ? pq[idx_r] : (int) Double.POSITIVE_INFINITY;
            int item = pq[i];
            System.out.println(item + " " + c_l + " " + c_r);
            // If node is bigger than at least one of their children, not minPQ by definition
            if (item > c_l || item > c_r) return false;
        }
        // Return true by default
        return true;
    }

    public static void main(String[] args) {
        
        _2_4_15 soln = new _2_4_15();

        int[] l1 = {1,2,3,6,8,7,4};
        int[] l2 = {1,2,8,3,9,11,7,20};
        
        boolean r_1 = soln.is_minPQ(l1);
        boolean r_2 = soln.is_minPQ(l2);

        System.out.println(r_1);
        System.out.println(r_2);
    }
}
