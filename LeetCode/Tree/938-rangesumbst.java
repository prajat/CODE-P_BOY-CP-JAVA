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
    int sum=0;
    public int rangeSumBST(TreeNode root, int L, int R) {

        dfs(root,L,R);
        return sum;
    }
    public int dfs(TreeNode root,int L,int R){
        if(root==null){
            return;
        }
        if(L<=root.val && root.val<=R){
            sum+=root.val;
        }
        dfs(root.left, L, R);
        dfs(root.right, L, R);

    }
}