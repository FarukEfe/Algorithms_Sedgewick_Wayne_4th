package S1._1_4;

public class _1_4_12 {
    
    // Assumption: l1 and l2 are sorted
    public void commonEncounter(int[] l1, int[] l2) {
        // Indexes for l1 and l2
        int i_1 = 0; int i_2 = 0;
        // Iterate until you reach the end of either one of the lists
        while (i_1<l1.length && i_2<l2.length) {
            int item1 = l1[i_1];
            int item2 = l2[i_2];
            // If they're equal, print out and increment indexes. Else, increment the index of whichever list the smaller item is assigned to.
            if (item1 == item2) {
                System.out.println("Common element: " + item1);
                i_1++;i_2++;
            } else if (item1 > item2) {
                i_2++;
            } else {
                i_1++;
            }
        }
    }
}
