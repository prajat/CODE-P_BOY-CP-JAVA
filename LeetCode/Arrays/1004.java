class Solution {
    public int longestOnes(int[] A, int K) {

        int i = 0;
        int j = 0;
        int counter = K;
        int ans = 0;
        while (j < A.length) {
            if (A[j] == 0) {
                counter--;
            }
            j++;
            while (counter < 0) {
                if (A[i] == 0) {
                    counter++;
                }
                i++;
            }
            ans = Math.max(ans, j - i);
        }
        return ans;

    }
}