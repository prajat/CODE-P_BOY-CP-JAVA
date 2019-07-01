/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return true;
        }

        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode reversedHead = reverse(slow.next);
        ListNode firstHalfHead = head;
        while (firstHalfHead != null && reversedHead != null) {
            if (firstHalfHead.val != reversedHead.val) {
                return false;
            }
            firstHalfHead = firstHalfHead.next;
            reversedHead = reversedHead.next;
        }
        return true;
    }

    private ListNode reverse(ListNode head) {
        ListNode pre = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
}