
public class Solution {

    public static void printWellFormedParanthesis(int n) {

        findParenthesis(n, 0, 0, "");

    }

    public static void findParenthesis(int n, int open, int close, String output) {

        if (close == n) {
            System.out.println(output);
            return;

        }

        if (open > close) {

            findParenthesis(n, open, close + 1, output + ")");
        }
        if (open < n) {

            findParenthesis(n, open + 1, close, output + "(");
        }

    }

}
