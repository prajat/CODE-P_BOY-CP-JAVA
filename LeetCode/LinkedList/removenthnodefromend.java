/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        int length = 0;
        ListNode temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        if (length == 1) {
            return null;
        }
        if (n == size) {
            return head.next;
        }
        temp = head;
        int count = 1;
        while (count < length - n && temp!=null) {

            temp = temp.next;
            count++;
        }
        temp.next = temp.next.next;
        return head;
        

    }
}