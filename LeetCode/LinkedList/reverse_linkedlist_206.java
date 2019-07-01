import java.util.*;

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {
    public ListNode reverseList(ListNode head) {


        ListNode temp = head;
        ListNode res=null;
        while(temp!=null){

            ListNode next=temp.next;
            temp.next=res;
            res=temp;
            temp=next;
            
        }
        return res;

    }
}