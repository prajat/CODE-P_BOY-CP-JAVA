class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char cc = s.charAt(i);
            if (cc == '(' || cc == '{' || cc == '[') {
                stack.push(cc);
            } else if (cc == ')') {
                if (stack.isEmpty() == true)
                    return false;
                if (stack.pop() != '(') {
                    return false;
                }
            } else if (cc == '}') {
                if (stack.isEmpty() == true)
                    return false;
                if (stack.pop() != '{') {
                    return false;
                }
            } else if (cc == ']') {
                if (stack.isEmpty() == true)
                    return false;
                if (stack.pop() != '[') {
                    return false;
                }
            }
        }
        if (stack.isEmpty() == true)
            return true;
        return false;
    }
}