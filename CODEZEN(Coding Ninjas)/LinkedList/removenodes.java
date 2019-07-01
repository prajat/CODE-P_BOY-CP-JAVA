import java.util.*;
class ListNode<t> {
	public t data;
	public ListNode<t> next;
	public ListNode(t data)
	{
		this.data=data;
	}
}

public class solution {

    public static ListNode<Integer> RemoveNpowNodes(ListNode<Integer> head) {
     

        ListNode<Integer> temp=head;

        int size=0;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        temp = head;

        int count=1;
        for (int i = 0; i < size; i++) {
            int index = Math.pow(2, i);

            while (temp != null && count < index) {
                temp = temp.next;

            }
        }
        System.out.println(temp.data);

        return head;
    }

}