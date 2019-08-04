import java.util.*;

class Solution {
    int low = 0;
    int maxl = 0;

    public String longestPalindrome(String s) {

        int l = s.length();
        if (l < 2) {
            return s;
        }
        for (int i = 0; i < l - 1; i++) {
            expand(s, i, i);
            expand(s, i, i + 1);

        }
        return s.substring(low, low + maxl);

    }

    public void expand(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        if (maxl < right - left - 1) {
           
            low = left + 1;
            maxl = right - left - 1;
        }
    }
}