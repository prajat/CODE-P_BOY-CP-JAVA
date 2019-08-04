class Solution {
    public int[] plusOne(int[] digits) {
        // Arraylist<Integer> list=new ArrayList<>();
        int[] ans = digits;
        for (int i = digits.length - 1; i >= 0; i--) {

            if (digits[i] + 1 == 10) {
                ans[i] = 0;
            } else {
                ans[i] = digits[i] + 1;
                return ans;
            }
        }

        if (ans[0] == 0) {
            int[] temp = new int[ans.length + 1];
            temp[0] = 1;
            return temp;
        } else {
            return ans;
        }

    }
}