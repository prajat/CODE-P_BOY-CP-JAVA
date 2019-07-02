/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {

        if (head == null) {
            return head;
        }
        ListNode temp = head;
        ListNode target = null;
        int size = 0;
        while (temp != null) {
            size++;
            temp = temp.next;
        }

        temp = head;
        if (k >= size) {
            k = k % size;
        }
        int n = size - k;
        int count = 1;
        while (count < n && temp != null) {
            count++;
            temp = temp.next;

        }
        target = temp;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = head;
        head = target.next;
        target.next = null;
        return head;

    }
}