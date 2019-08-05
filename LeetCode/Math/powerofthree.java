class Solution {
    public boolean isPowerOfThree(int n) {
        if (n == 0 || n == 2) {
            return false;
        }
        if (n == 1) {
            return true;
        }

        for (int i = 1; i <= Math.cbrt(n); i++) {
            if (Math.pow(3, i) == n) {
                return true;
            }
        }
        return false;

    }
}