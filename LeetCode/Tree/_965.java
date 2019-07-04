import java.util.*;
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

    public boolean isUnivalTree(TreeNode root) {

        if(root==null){
            return true;
        }

        int data=root.val;
        return dfs(root,data); 
    }
    public boolean dfs(TreeNode root,int data){
        if(root==null){
            return true;

        }
        if(root.val!=data){
            return false;
        }
        return dfs(root.left, data) && dfs(root.right, data);
    }
}