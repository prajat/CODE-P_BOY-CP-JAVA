class Solution {
    public int countPrimes(int n) {
        if (n == 0 || n == 1) {
            return 0;
        }
        boolean[] isprime = new boolean[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            isprime[i] = true;
        }
        isprime[0] = false;

        isprime[1] = false;
        for (int i = 2; i * i < n; i++) {
            if (isprime[i] == true) {

                for (int j = i * i; j < n; j += i) {
                    isprime[j] = false;
                }
            }

        }
        for (boolean i : isprime) {
            if (i == true)
                count++;
        }
        return count;
    }
}