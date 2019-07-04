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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans=new ArrayList<>();
        bfs(root,ans);
        return ans;
    }
    public void bfs(TreeNode root,List<Double> ans){
        if(root==null){
            return;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            Double sum=0.0;
            for(int i=0;i<size;i++){
                TreeNode node=queue.poll();
                if(node!=null){
                    sum+=node.val;
                }
                
                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
                


            }
            ans.add(sum/size);
            
        }

    }
}