/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val,Node _left,Node _right,Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/
class Solution {
    public Node connect(Node root) {
        Node temp = root;
        if (root == null || root.left == null)
            return root;
        connectNodes(root.left, root.right);
        return temp;
    }

    public void connectNodes(Node node1, Node node2) {
        node1.next = node2;
        if (node1.left != null) {
            connectNodes(node1.right, node2.left);
            connectNodes(node1.left, node1.right);
            connectNodes(node2.left, node2.right);
        }
    }
}