class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        if (sum % 2 != 0) {
            return false;
        }

        return solve(nums, nums.length - 1, sum / 2);

    }

    public boolean solve(int[] nums, int start, int target) {
        if (target == 0) {
            return true;

        } else if (start < 0 || target < 0 || target < nums[start]) {
            return false;
        }

        return solve(nums, start - 1, target - nums[start]) || solve(nums, start - 1, target);

    }
}