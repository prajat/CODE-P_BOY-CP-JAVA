/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    int sum = 0;

    public TreeNode convertBST(TreeNode root) {
        solve(root);
        return root;

    }

    public void solve(TreeNode root) {
        if (root == null) {
            return;
        }
        solve(root.right);
        root.val += sum;
        sum = root.val;
        solve(root.left);
    }
}