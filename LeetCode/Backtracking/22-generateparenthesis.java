import java.util.*;

class Solution {
    ArrayList<String> list = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        String str = "";
        generate(str, 0, 0, n);
        return list;

    }

    public void generate(String str, int left, int right, int max) {
        if (str.length() == 2 * max) {
            list.add(str);
            return;
        }

        if (left < max) {
            generate(str + '(', left + 1, right, max);
        }
        if (right < left) {
            generate(str + ')', left, right + 1, max);
        }
    }
}