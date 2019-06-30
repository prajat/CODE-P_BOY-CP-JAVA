class ListNode<t> {
    public t data;
    public ListNode<t> forw;
    public ListNode<t> backw;

    public ListNode(t data) {
        this.data = data;
    }
}

public class solution {

    public class solution {

        public static ListNode<Integer> deleteNode(ListNode<Integer> head, ListNode<Integer> n) {
            ListNode<Integer> temp = head;
            int value = n.data;
            while (temp.data != value && temp != null) {
                temp = temp.forw;

            }
            if (temp.backw == null) {
                head = temp.forw;
                return head;
            }
            if (temp.forw == null) {
                temp.backw.forw = null;
                return head;
            }
            temp.backw.forw = temp.forw;
            temp.forw.backw = temp.backw;
            return head;

        }
    }
}