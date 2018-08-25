import java.util.*;
/**
 * LCS
 */
public class LCS {

    public static void main(String[] args) {
        String s1 = "ABCDGH";
        String s2 = "AEDFHR";

        char[] X = s1.toCharArray();
        char[] Y = s2.toCharArray();
        int m = X.length;
        int n = Y.length;
        System.out.println(LCSfn(X, Y, m, n));  

    }
    
    public static int LCSfn(char[] a, char[] b,int m,int n) {
        if(m==0||n==0)
        {
            return 0;
        }

        int[][] dp = new int[m+1][n + 1];
        if(a[m-1]==b[n-1])
        {
            dp[m - 1][n - 1] = 1 + LCSfn(a, b, m - 1, n - 1);
            return dp[m - 1][n - 1];
        }
        else {
            dp[m - 1][n - 1] = Math.max(LCSfn(a, b, m, n - 1), LCSfn(a, b, m - 1, n));
            return dp[m - 1][n - 1];
        }
        
    }
}