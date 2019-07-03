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
    public List<Integer> postorder(Node root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return null;
        }
        dfs(root, list);
        return list;

    }

    public List<Integer> dfs(Node root, List<Integer> list) {
        if (root == null) {
            return list;
        }
        if (root.children.size() > 0) {
            for (Node child : root.children) {
                dfs(child, list);
            }
        }
        list.add(root.val);
        return list;
    }
}