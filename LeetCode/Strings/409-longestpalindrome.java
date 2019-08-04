class Solution {
    public int longestPalindrome(String s) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);

            } else {
                map.put(s.charAt(i), 1);
            }
        }
        int ans = 0;
        int flag = 0;
        int flag2 = 0;
        for (Map.Entry<Character, Integer> i : map.entrySet()) {
            if (i.getValue() >= 2) {
                if (i.getValue() % 2 == 0) {
                    ans += i.getValue();
                } else {
                    flag = 1;
                    ans += i.getValue() - 1;

                }
            }
            if (i.getValue() == 1) {
                flag2 = 1;
            }
        }
        if (flag == 1 || flag2 == 1) {
            ans += 1;
        }

        return ans;
    }
}