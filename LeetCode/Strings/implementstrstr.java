class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }
        CharSequence a = needle;
        if (haystack.contains(a)) {
            return haystack.indexOf(needle);
        }
        return -1;

    }
}