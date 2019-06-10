import java.util.*;

public class solution {

    public static String[] findParenthesis(int n) {
        ArrayList<String> list = new ArrayList<>();
        findParenthesis(n, 0, 0, list, "");

        String[] arr = new String[list.size()];
        list.toArray(arr);
        return arr;
    }

    public static void findParenthesis(int n, int open, int close, ArrayList<String> list, String output) {

        if (close == n) {
            list.add(output);
            return;

        }

        if (open > close) {

            findParenthesis(n, open, close + 1, list, output + ")");
        }
        if (open < n) {

            findParenthesis(n, open + 1, close, list, output + "(");
        }

    }
}
