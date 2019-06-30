
class ListNode<t> {
    public t data;
    public ListNode<t> next;

    public ListNode(t data) {
        this.data = data;
    }
}

public class solution {

    public static ListNode<Integer> deleteMid(ListNode<Integer> head) {
        ListNode<Integer> temp = head;
        int size = 0;
        while (temp != null) {
            temp = temp.next;
            size++;
        }
        temp = head;   //reset temp

        int mid = size / 2;
        for (int i = 1; i < mid - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;

    }
}
