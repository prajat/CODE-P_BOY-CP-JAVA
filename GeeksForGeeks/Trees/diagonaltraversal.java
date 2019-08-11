class GfG
{
    Queue<TreeNode> queue=new LinkedList();
     public void diagonalPrint(TreeNode root)
      {
           //add your code here.
           preorder(root);
          
      }
      public void(TreeNode root){
          if(root==null){
              return;
          }
          System.out.print(root.data);
          queue.add(root.left);
          preorder(root.right);
          preorder(queue.poll());
      }
}