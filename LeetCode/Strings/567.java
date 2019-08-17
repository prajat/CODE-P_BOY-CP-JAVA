class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0) + 1);
        }
        int counter = map.size();
        int end = 0;
        int begin = 0;
        while (end < s2.length()) {
            char cc = s2.charAt(end);
            if (map.containsKey(cc)) {
                map.put(cc, map.get(cc) - 1);
                if (map.get(cc) == 0) {
                    counter--;
                }
            }
            end++;
            while (counter == 0) {
                char tempc = s2.charAt(begin);
                if (map.containsKey(tempc)) {
                    map.put(tempc, map.get(tempc) + 1);
                    if (map.get(tempc) > 0) {
                        counter++;
                    }

                }
                if (end - begin == s1.length()) {
                    return true;
                }
                begin++;

            }

        }
        return false;

    }
}