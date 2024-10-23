package S3._3_5;

import java.util.HashMap;

public class _3_5_25 {
    
    HashMap<Integer,String> timetable = new HashMap<Integer,String>();

    public void addToSchedule(int time, String cls) throws Exception {
        String val = this.timetable.get(time);
        if (val == null) {
            this.timetable.put(time, cls);
        } else {
            throw new Exception("\nThis insertion will cause a conflict in schedule. (breaking)");
        }
    }

    public static void main(String[] args) {
        _3_5_25 solution = new _3_5_25();
        int[] t = {11,14,18,11};
        String[] c = {"Physics","Biology","Data Structures","Logical Reasoning"};
        try {
            for (int i=0;i<t.length;i++) {
                int i_t = t[i]; String i_c = c[i];
                System.out.print("Attempting to add " + i_c + " at " + i_t + " ... ");
                solution.addToSchedule(i_t,i_c);
                System.out.print("(successful)\n");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
