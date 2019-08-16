class Solution {
    public void nextPermutation(int[] nums) {
        if (nums == null || nums.length < 1) {
            return;
        }
        int i = nums.length - 2;
        while (i >= 0) {
            if (nums[i] < nums[i + 1]) {
                break;
            }
            i--;
        }
        int j = nums.length - 1;
        if (i >= 0) {
            while (j >= 0) {
                if (nums[i] < nums[j]) {
                    break;
                }
                j--;
            }
            swap(nums, i, j);
        }

        reverse(i + 1, nums);

    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void reverse(int i, int[] nums) {
        int j = nums.length - 1;
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}