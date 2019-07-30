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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> list=new ArrayList<>();
        if(root==null){
            return list;
        }
        Queue<TreeNode> queue=new LinkedList();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            List<Integer> smallans=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode front=queue.poll();
                smallans.add(front.val);
                if(front.left!=null){
                    queue.offer(front.left);
                }
                if(front.right!=null){
                    queue.offer(front.right);
                }
            }
            list.add(smallans);
            
            
        }
        
        return list;
        
    }
}