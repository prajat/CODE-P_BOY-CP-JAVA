import java.util.*;

//not efficient approach



/***********
 
Following is the Linked list node structure already written 
 
class ListNode<t> {
	public t data;
	 public ListNode<t> next;
	 public ListNode(t data)
	 {
		 this.data=data;
	 }
}

************/


public class solution {
	
	public static ListNode<Integer> changelist(ListNode<Integer> head) {


        ListNode<Integer> temp1=head;
        ListNode<Integer> reverselist=reverse(temp1);
        ListNode<Integer> temp=head;
        ListNode<Integer> ans=null;

        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }

        temp=head;
        int count=0;
        while(count<size/2){
            ans=temp;
            ans.next=reverselist;
            temp=temp.next;
            reverselist=reverselist.next;
            ans=ans.next;
            

        }
        return ans;



        
        

    }
    public static ListNode<Integer> reverse(ListNode<Integer> head){
        ListNode<Integer> ans=null;
        while(head!=null){
            ListNode<Integer> temp=head.next;
            head.next=ans;
            ans=head;
            head=temp;
        }
        return ans;

    }
}

