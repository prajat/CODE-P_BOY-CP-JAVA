class Solution1 {
    public int findUnsortedSubarray(int[] nums) {
        int[] temp = nums.clone();
        Arrays.sort(temp);
        int start = 0;
        int end = temp.length - 1;
        while (start < temp.length && nums[start] == temp[start]) {
            start++;
        }
        while (end > start && nums[end] == temp[end]) {
            end--;
        }
        return end - start + 1;

    }
}