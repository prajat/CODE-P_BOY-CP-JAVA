import java.util.*;

class ListNode<t> {
    public t data;
    public ListNode<t> next;

    public ListNode(t data) {
        this.data = data;
    }
}

public class solution {

    public static ListNode<Integer> changeList(ListNode<Integer> head, int n) {

        if (n == 0) {
            return head;
        }
       
        ListNode<Integer> temp = head;
        ListNode targetnode = null;
        int size = 0;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        temp = head;
        int k = size - n;
        int count=1;
        while (count < k && temp != null) {
            temp = temp.next;
            count++;
        }
        targetnode = temp;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = head;
        head = targetnode.next;
        targetnode.next = null;
        
       
        return head;

    }
}
