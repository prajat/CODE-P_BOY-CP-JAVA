class Solution {
    public String removeDuplicates(String S) {
        if (S.length() == 1) {
            return S;
        }

        char curr = S.charAt(0);
        String smallans = removeDuplicates(S.substring(1));
        if (smallans.length() >= 2) {
            if (smallans.charAt(0) == curr) {
                return smallans.substring(1);
            }

        }
        if (smallans.length() == 1 && smallans.charAt(0) == curr) {
            return "";
        }

        return curr + smallans;

    }
}