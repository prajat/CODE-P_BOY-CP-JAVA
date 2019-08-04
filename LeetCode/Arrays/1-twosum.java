import java.util.*;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashSet<Integer> set = new HashSet<>();
        int firstindex = 0;
        int secondindex = 0;
        int second = 0;
        for (int i = 0; i < nums.length; i++) {
            int val = target - nums[i];
            if (set.contains(val)) {
                firstindex = i;
                second = val;
                break;
            }
            set.add(nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == second) {
                secondindex = i;
                break;
            }
        }
        int[] ans = { secondindex, firstindex };
        return ans;

    }
}