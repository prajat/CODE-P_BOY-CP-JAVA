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
    public boolean isValidBST(TreeNode root) {
         return isvalid(root,null,null);
         
     }
     public boolean isvalid(TreeNode root,Integer min,Integer max){
         if(root==null){
             return true;
         }
         if((min!=null&&root.val<=min) ||(max!=null && root.val>=max)){
             return false;
         }
         return isvalid(root.left, min, root.val) && isvalid(root.right, root.val, max);
     }
 }