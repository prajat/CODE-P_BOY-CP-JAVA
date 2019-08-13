class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        solve(candidates, target, new ArrayList<>(), 0);
        return ans;

    }

    public void solve(int[] candidates, int target, ArrayList<Integer> list, int start) {
        if (target < 0) {
            return;
        } else if (target == 0) {
            ans.add(new ArrayList<>(list));
        } else {
            for (int i = start; i < candidates.length; i++) {
                list.add(candidates[i]);
                solve(candidates, target - candidates[i], list, i);
                list.remove(list.size() - 1);
            }
        }

    }
}