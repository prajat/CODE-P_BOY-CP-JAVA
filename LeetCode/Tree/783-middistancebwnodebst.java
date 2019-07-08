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
    public int minDiffInBST(TreeNode root) {
        ArrayList<Integer> list=new ArrayList<>();
        int ans=Integer.MAX_VALUE;
        inorder(root, list);
        for(int i=1;i<list.size();i++){
            ans=Math.min(ans,(list.get(i)-list.get(i-1)));
        }
        return ans;
        
    }

    public void inorder(TreeNode root,ArrayList<Integer> list){
        if(root==null){
            return ;
        }
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right,list);
    }
}