import java.util.*;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> heap=new PriorityQueue<>(new Comparator<ListNode>() {
            public int compare(ListNode obj1,ListNode obj2){
                if(obj1.val>obj2.val)
                return 1;
                else return -1;
            }
        });
        for(int i=0;i<lists.length;i++){
            ListNode currhead=lists[i];
            while(currhead!=temp){
                heap.offer(currhead);
                currhead=currhead.next;
            }

        }
        ListNode ans=heap.poll();
        for(int i=1;i<heap.size();i++){
            ans.next=heap.poll();
        }
        
        return ans;
    }
}