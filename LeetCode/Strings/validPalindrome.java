class Solution {
    public boolean isPalindrome(String s) {
        if (s.length() == 0) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i)) || (s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
                sb.append(s.charAt(i));
            }
        }
        return ispalin(sb.toString().toLowerCase());

    }

    public boolean ispalin(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}