class Solution {
    public int findTargetSumWays(int[] nums, int S) {
        int[][] dp = new int[nums.length][2001];
        return solve(nums, 0, 0, S, dp);

    }

    public int solve(int[] arr, int curr, int start, int sum, int[][] dp) {

        if (start == arr.length) {
            if (sum == curr) {
                return 1;
            } else {
                return 0;
            }
        }
        if (dp[start][curr + 1000] != 0) {
            return dp[start][curr + 1000];
        }

        int op1 = solve(arr, curr - arr[start], start + 1, sum, dp);
        int op2 = solve(arr, curr + arr[start], start + 1, sum, dp);
        dp[start][curr + 1000] = op1 + op2;
        return op1 + op2;
    }
}