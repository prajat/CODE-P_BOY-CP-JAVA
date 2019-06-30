import java.util.*;

class ListNode<t> {
    public t data;
    public ListNode<t> next;

    public ListNode(t data) {
        this.data = data;
    }
}

public class solution {
    public static ListNode<Integer> ChangeHead(ListNode<Integer> head, int n) {

        if (n == 1) {

        }
        ListNode<Integer> temp = head;
        ListNode<Integer> newhead = null;
        int size = 0;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        if (n == size) {
            return head;
        }
        temp = head; // reset temp
        int k = size - n;
        int count = 1;
        while (count < k && temp != null) {
            count++;
            temp = temp.next;
        }
        newhead = temp.next;
        if (temp.next.next == null) {
            temp.next = null;
        } else {
            temp.next = temp.next.next;
        }

        newhead.next = head;
        head = newhead;

        return head;
    }
}
