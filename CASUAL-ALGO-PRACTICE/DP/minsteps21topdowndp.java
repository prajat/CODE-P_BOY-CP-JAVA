import java.util.*;
/**
 * minsteps21topdowndp
 */
public class minsteps21topdowndp {

    public static void main(String[] args) {
 System.out.println(minsteptddp(10));
    }

    public static int minsteptddp(int n) {
        int[] dp = new int[n + 1];
        return minsteptddp(n, dp);
    
}
    public static int minsteptddp(int n,int[] dp) {
        
        if (n == 1) {
            dp[n] = 0;
            return dp[n];

        }
        if (dp[n] > 0) {
            return dp[n];
        }
        int option1 = minsteptddp(n - 1,dp);
        int ans = option1;

        if (n % 3 == 0) {
            int option2 = minsteptddp(n / 3,dp);
            ans = Math.min(ans, option2);

        }

        if (n % 2 == 0) {
            int option3 = minsteptddp(n / 2,dp);

            ans = Math.min(ans, option3);
        }
        dp[n] = 1 + ans;
        return dp[n];
        
    }
}