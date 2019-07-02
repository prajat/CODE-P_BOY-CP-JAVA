/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode temp=head;
        int size=0;

        if(size==1){
            return null;
        }
        if(n==size){
            return head.next;
        }
        
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        
        temp=head;
        int k=size-n;
        int count=1;
        while(count<k && temp!=null){
            count++;
            temp=temp.next;

        }
        temp.next=temp.next.next;
        return head;
        
    }
}