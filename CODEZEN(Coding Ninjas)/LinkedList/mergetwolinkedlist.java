import java.util.*;

class ListNode<t> {
    public t data;
    public ListNode<t> next;

    public ListNode(t data) {
        this.data = data;
    }
}

public class solution {

    public static ListNode<Integer> merge(ListNode<Integer> head1, ListNode<Integer> head2) {

        ListNode<Integer> temp1 = head1;
        ListNode<Integer> temp2 = head2;
        

        if (temp1 == null && temp2 == null) {
            return null;
        }

        ListNode<Integer> res = null;

        while (temp1 != null && temp2 != null) {
            if (temp1.data <= temp2.data) {
                ListNode<Integer> temp = temp1.next;
                temp1.next = res;               //add smaller node in front of res list
                res = temp1;
                temp1 = temp;

            } else {
                ListNode<Integer> temp = temp2.next;
                temp2.next = res;
                res = temp2;
                temp2 = temp;

            }
        }
        while (temp1 != null) {
            ListNode<Integer> temp = temp1.next;
            temp1.next = res;
            res = temp1;
            temp1 = temp;

        }
        while (temp2 != null) {
            ListNode<Integer> temp = temp2.next;
            temp2.next = res;
            res = temp2;
            temp2 = temp;
        }
        return res;
        

        
        

    }
}