import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> set = new HashSet<>();
        int result = 0;

        int i = 0;
        int j = 0;
        while (i < n && j < n) {

            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                result = Math.max(result, j - i);

            } else {
                set.remove(s.charAt(i++));
            }
        }

        return result;
    }
}