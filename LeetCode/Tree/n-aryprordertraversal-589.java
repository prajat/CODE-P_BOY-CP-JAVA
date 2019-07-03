import java.util.*;

/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        dfs(root, list);
        return list;
    }

    public List<Integer> dfs(Node root, List<Integer> list) {
        if (root == null) {
            return list;
        }
        list.add(root.val);
        if (list.size() > 0) {
            for (Node child : root.children) {
                dfs(child, list);
            }
        }
        return list;
    }
}