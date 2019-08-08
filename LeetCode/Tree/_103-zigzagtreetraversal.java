import java.util.*;

import javax.swing.tree.TreeNode;
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        boolean flag = true;
        List<List<Integer>> levels = new ArrayList<>();
        bfs(root, levels, flag);
        return levels;
    }

    public void bfs(TreeNode root, List<List<Integer>> levels, boolean flag) {
        if (root == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                level.add(node.val);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            if (flag == true) {
                levels.add(level);
                flag = false;
            } else {
                Collections.reverse(level);
                levels.add(level);
                flag = true;
            }

        }

    }
}