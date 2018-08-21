static String isBalanced(String s) {
        {
            Stack<Character> brackets = new Stack<Character>();
        for (char bracket : s.toCharArray()) {
            if (bracket == '(' || bracket == '[' || bracket == '{') {
                brackets.push(bracket);
            } else {
                if ((bracket == ')' && !(!brackets.empty() && brackets.peek() == '('))
                        || (bracket == ']' && !(!brackets.empty() && brackets.peek() == '['))
                        || (bracket == '}' && !(!brackets.empty() && brackets.peek() == '{'))) {
                    return "NO";
                }
                brackets.pop();
            }
        }
        return "YES";
            
        }


    }