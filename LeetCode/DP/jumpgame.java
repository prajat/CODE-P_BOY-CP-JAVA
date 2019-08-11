//greedy method
class Solution {
    public boolean canJump(int[] nums) {

        int n = nums.length;
        int reachablesofar = 0;

        for (int i = 0; i < n; i++) {
            if (reachablesofar < i)
                return false;
            reachablesofar = Math.max(reachablesofar, i + nums[i]);
            if (reachablesofar >= n - 1)
                return true;
        }

        return false;

    }
}