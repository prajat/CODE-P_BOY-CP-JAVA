import java.util.*;

class Solution {
    public int longestPalindromeSubseq(String s) {

        int[][] dp = new int[s.length() + 1][s.length() + 1];
        return ans(s,0,s.length()-1,dp);

    }

    public int ans(String s,int start,int end,int[][] dp) {
        if (start > end) {
            return 0;
       }
        if (start == end) {
            return 1;
        }
        if (dp[start][end] != 0) {
            return dp[start][end];
        }
        if (s.charAt(start) == s.charAt(end)) {
            dp[start][end] = 2 + ans(s, start + 1, end - 1, dp);
            return dp[start][end];
        }
        else {
            int op1 = ans(s, start + 1, end, dp);
            int op2 = ans(s, start, end - 1, dp);
            dp[start][end] = Math.max(op1, op2);
            return dp[start][end];
       }
    }
}