import java.util.*;

class ListNode<t> {
    public t data;
    public ListNode<t> next;

    public ListNode(t data) {
        this.data = data;
    }
}


public class solution {

    public static ListNode<Integer> PairSwap(ListNode<Integer> head) {

        ListNode<Integer> temp = head;
        while (temp != null && temp.next != null) {
            int k = temp.data;
            temp.data = temp.next.data;
            temp.next.data = k;
            temp = temp.next.next;
        }





        return head;
    }

}
