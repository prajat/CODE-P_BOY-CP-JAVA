/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        ListNode l3 = new ListNode(0);
        ListNode temp3 = l3;

        while (temp1 != null || temp2 != null) {
            if (temp2 == null || (temp1 != null && temp1.val <= temp2.val)) {
                temp3.next = temp1;
                temp1 = temp1.next;
            } else {
                temp3.next = temp2;
                temp2 = temp2.next;
            }
            temp3 = temp3.next;
        }

        return l3.next;
    }
}