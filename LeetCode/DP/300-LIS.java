class Solution {
    public int lengthOfLIS(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int[] dp = new int[nums.length];
        dp[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            dp[i] = 1;
            for (int j = i - 1; j >= 0; j--) {
                if (nums[j] >= nums[i]) {
                    continue;
                }
                int tempans = dp[j] + 1;
                if (tempans > dp[i]) {
                    dp[i] = tempans;
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i : dp) {
            if (i > max) {
                max = i;
            }
        }
        return max;

    }

}