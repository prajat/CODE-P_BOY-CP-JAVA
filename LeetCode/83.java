import java.util.*;
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {

        ListNode temp = head;
        while (temp!=null && temp.next != null) {
            if (temp.val == temp.next.val) {
                temp.next = temp.next.next;

            }
            else {
                temp = temp.next;
            }
        }
        return head;

    }
}