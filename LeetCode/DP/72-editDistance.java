class Solution {
    public int minDistance(String s1, String s2) {
        int[][] dp = new int[s1.length() + 1][s2.length() + 1];
        return minDistance(s1, s2, dp);

    }

    public int minDistance(String s1, String s2, int[][] dp) {
        int m = s1.length();
        int n = s2.length();
        if (s1.length() == 0) {
            return s2.length();
        }

        if (s2.length() == 0) {
            return s1.length();
        }
        if (dp[m][n] != 0) {
            return dp[m][n];
        }
        char cc1 = s1.charAt(0);
        char cc2 = s2.charAt(0);

        if (cc1 == cc2) {
            dp[m][n] = minDistance(s1.substring(1), s2.substring(1), dp);
            return dp[m][n];

        } else {
            int op1 = 1 + minDistance(s1.substring(1), s2.substring(1), dp);
            int op2 = 1 + minDistance(s1.substring(1), s2, dp);
            int op3 = 1 + minDistance(s1, s2.substring(1), dp);

            dp[m][n] = Math.min(op1, Math.min(op2, op3));
            return dp[m][n];

        }
    }
}