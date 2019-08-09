import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> list = new ArrayList<>();
        backtrack(nums, list, new ArrayList<>(),0);
        return list;
    }

    public void backtrack(int[] nums, List<List<Integer>> list, List<Integer> smallans,int start) {
        list.add(new ArrayList<>(smallans));
        for (int i = start; i < nums.length; i++) {
            smallans.add(nums[i]);
            backtrack(nums, list, smallans, i + 1);
            smallans.remove(smallans.size() - 1);
            
        }
    }
}