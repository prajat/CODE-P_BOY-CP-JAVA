public class Solution {
    // Write your code here.
    Stack<Character> stack = new Stack();
    Queue<Character> queue = new LinkedList();

    public void pushCharacter(char c) {
        stack.push(c);

    }

    public void enqueueCharacter(char c) {
        queue.add(c);
    }

    public char popCharacter() {
        return stack.pop();
    }

    public char dequeueCharacter() {
        return queue.remove();

    }
}