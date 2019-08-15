class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        if (s.length() == 0) {
            return true;
        }
        HashSet<Integer> set = new HashSet<>();
        return dfs(s, set, wordDict, 0);

    }

    public boolean dfs(String s, HashSet<Integer> set, List<String> dict, int start) {
        if (start == s.length()) {
            return true;

        }
        for (int i = start + 1; i <= s.length(); i++) {
            if (set.contains(i))
                continue;
            if (dict.contains(s.substring(start, i))) {
                if (dfs(s, set, dict, i))
                    return true;
                set.add(i);
            }
        }
        return false;
    }

}