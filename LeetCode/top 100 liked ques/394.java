class Solution {
    public String decodeString(String s) {

        Stack<Integer> number = new Stack<>();
        Stack<StringBuilder> str = new Stack<>();
        StringBuilder curr = new StringBuilder();
        int k = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                k = k * 10 + (s.charAt(i) - '0');

            } else if (s.charAt(i) == '[') {
                number.push(k);
                str.push(curr);
                k = 0;
                curr = new StringBuilder();

            } else if (s.charAt(i) == ']') {
                String temp = curr.toString();
                curr = str.pop();
                for (int j = number.pop(); j > 0; j--) {
                    curr.append(temp);
                }
            } else {
                curr.append(s.charAt(i));
            }
        }
        return curr.toString();

    }
}