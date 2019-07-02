/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        
       ListNode temp=head;
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        temp=head;
        int[] answers=new int[size];

        int index=0;
        while(temp!=null){
            int curr=temp.val;
            for(ListNode i=temp.next;i!=null;){
                if(i.val>curr){
                    answers[index]=i.val;
                    break;  
                }
                i=i.next;
            }
            index++;
            temp=temp.next;
        }

        return answers;
        
    }
}