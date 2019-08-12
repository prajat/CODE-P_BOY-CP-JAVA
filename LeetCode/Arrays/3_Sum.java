class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
           List<List<Integer>> ans = new ArrayList<>();
        TreeSet<String> set = new TreeSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {

            int l = i + 1;
            int r = nums.length - 1;
            while (l < r) {
                if (nums[i] + nums[l] + nums[r] == 0) {
                    String str = nums[i] + ":" + nums[l] + ":" + nums[r];
                    if (!set.contains(str)) {
                        list.add(nums[i]);
                        list.add(nums[l]);
                        list.add(nums[r]);
                        ans.add(list);
                        list = new ArrayList<>();
                        set.add(str);

                    }
                    l++;
                    r--;

                } else if (nums[i] + nums[l] + nums[r] < 0) {
                    l++;

                } else {
                    r--;
                }
            }

        }
        return ans;
    }
}