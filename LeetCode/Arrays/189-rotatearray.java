class Solution {
    public void rotate(int[] nums, int k) {
        for (int i = 1; i <= k; i++) {
            util(nums);
        }

    }

    public void util(int[] arr) {
        int first = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = first;
    }
}