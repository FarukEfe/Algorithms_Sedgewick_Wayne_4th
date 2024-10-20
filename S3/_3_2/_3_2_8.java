package S3._3_2;

public class _3_2_8 {
    
    // Assumes n = 2^k for integer k
    // One comparison per depth + 1
    public int findCompares(int n) {
        return (int) Math.log(n) + 1;
    }
}
