class Solution {

    public int fib(int N) {
        int[] dp = new int[N + 1];
        return fibdp(dp, N);

    }

    public int fibdp(int[] dp, int n) {
        if (n == 0) {
            dp[n] = 0;
            return dp[n];
        }
        if (n == 1) {
            dp[n] = 1;
            return dp[n];
        }
        if (dp[n] != 0) {
            return dp[n];
        }
        dp[n] = fibdp(dp, n - 1) + fibdp(dp, n - 2);
        return dp[n];
    }
}