class GFG
{
    // Function to find middle element a linked list
    int getMiddle(Node head)
   {
         // Your code here.
         
         Node slow=head;
   Node fast=head;
   int count=0;
   while(fast!=null&& fast.next!=null){
       fast=fast.next.next;
      
   
       slow=slow.next;
   
   }
   return slow.data;
   }
}