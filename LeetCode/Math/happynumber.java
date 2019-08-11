class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();

        int rem = 0;
        while (set.add(n)) {
            int squaresum = 0;
            while (n > 0) {
                rem = n % 10;
                squaresum += rem * rem;
                n = n / 10;

            }
            if (squaresum == 1) {
                return true;
            } else {
                n = squaresum;
            }
        }
        return false;

    }
}