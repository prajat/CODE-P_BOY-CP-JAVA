import java.util.*;

public class tanvirandhismoney {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // int t = in.nextInt();
        // for (int i = 1; i <= t; i++) {
        //     int n = in.nextInt();
        //     int ans = count(n);
        //     System.out.println(ans % 2);

        // }
        int[] dp = new int[5 + 1];
        System.out.println(count(5,dp));
    }

    public static int count(int n,int[] dp) {

        
        if (n == 1) {
            return 0;

        }

        int sqrt = (int) Math.sqrt(n);

        if (sqrt * sqrt == n) {
            dp[n]= 1 + count(sqrt,dp);
            return dp[n];

        } else {
            dp[n]= 1 + count(n - 1, dp);
            return dp[n];
        }

    }
   
}