import java.util.*;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public int maxDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int leftans = maxDepth(root.left);
        int rightans = maxDepth(root.right);
        return Math.max(leftans, rightans) + 1;

    }
}