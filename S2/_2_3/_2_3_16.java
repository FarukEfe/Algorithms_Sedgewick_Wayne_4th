package S2._2_3;

public class _2_3_16 {

    public void show_list(int[] list) {
        for (int i=0;i<list.length;i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }
    
    // This solution assumes that we're using the first element of a list as the pivot point
    public int[] best_case_qs(int n) {
        int[] list = new int[n];
        // Make a sorted list of length n to begin with
        for ( int i = 0 ; i < n ; i++ ) {
            list[i] = i;
        }
        // Middle element of a sorted list is the best pivot, keep assigning the middle to start
        for ( int i = 0 ; i < (int) (n / 2) ; i++ ) {
            int mid_idx = i + (int) (n / 2);
            int middle = list[mid_idx];
            list[mid_idx] = list[i];
            list[i] = middle;
            this.show_list(list);
        }
        return list;
    }

    public static void main(String[] args) {
        _2_3_16 soln = new _2_3_16();
        int[] list = soln.best_case_qs(30);

        soln.show_list(list);
    }

}
