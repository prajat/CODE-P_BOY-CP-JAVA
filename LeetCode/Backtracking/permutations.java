class Solution {
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> list = new ArrayList<>();
        backtrack(nums, list, new ArrayList<>());
        return list;

    }

    public void backtrack(int[] nums, List<List<Integer>> list, List<Integer> smallans) {
        if (smallans.size() == nums.length) {
            list.add(new ArrayList<>(smallans));
            return;
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (smallans.contains(nums[i]))
                    continue;
                smallans.add(nums[i]);
                backtrack(nums, list, smallans);
                smallans.remove(smallans.size() - 1);

            }
        }
    }
}