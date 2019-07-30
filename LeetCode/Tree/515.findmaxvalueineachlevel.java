/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
// import java.util.*;

class Solution {
    public List<Integer> largestValues(TreeNode root) {
        ArrayList<Integer> list=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList();
        if(root==null){
            return list;
        }
        queue.offer(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            int max=Integer.MIN_VALUE;
            for(int i=0;i<size;i++){
                TreeNode front=queue.poll();
                max=Math.max(max,front.val);
                if(front.left!=null){
                    queue.offer(front.left);
                }
                if(front.right!=null){
                    queue.offer(front.right);
                }
                
            }
            list.add(max);
        }
        
        return list;
        
        
    }
}