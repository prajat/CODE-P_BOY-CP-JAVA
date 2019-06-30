/***********
 * 
 * Following is the Linked list node structure already written
 * 
 * class ListNode<t> { public t data; public ListNode<t> next; public ListNode(t
 * data) { this.data=data; } }
 * 
 ************/

public class solution {

    public static ListNode<Integer> lastToFront(ListNode<Integer> head) {
        ListNode<Integer> temp = head;
        ListNode<Integer> targetnode = null;
        while (temp.next.next != null) {
            temp = temp.next;

        }
        targetnode = temp;
        temp = temp.next;
        temp.next = head;
        head = targetnode.next;
        targetnode.next = null;
        return head;

    }
}
