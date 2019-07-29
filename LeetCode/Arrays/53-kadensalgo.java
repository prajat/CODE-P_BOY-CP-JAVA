class Solution {
    public int maxSubArray(int[] nums) {
        int maxsofar = Integer.MIN_VALUE;
        int maxendinghere = 0;
        for (int i = 0; i < nums.length; i++) {
            maxendinghere += nums[i];

            if (maxsofar < maxendinghere) {
                maxsofar = maxendinghere;
            }
            if (maxendinghere < 0) {
                maxendinghere = 0;
            }
        }
        return maxsofar;

    }
}