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
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {

        if(t1==null){
            return t2;
        }
        if(t2==null){
            return t1;
        }


        TreeNode mergenode=new TreeNode(t1.val+t2.val);

        mergenode.left=mergeTrees(t1.left, t2.left);
        mergenode.right=mergeTrees(t1.right, t2.right);
        return mergenode;



        
    }
}