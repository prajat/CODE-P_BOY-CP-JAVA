class Solution {
    public int maxArea(int[] height) {

        int i = 0;
        int j = height.length - 1;
        int ans = 0;
        while (i < height.length && j >= 0) {
            ans = Math.max(ans, Math.min(height[i], height[j]) * (j - i));
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return ans;

    }
}