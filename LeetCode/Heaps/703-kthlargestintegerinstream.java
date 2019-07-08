import java.util.*;
class KthLargest {
    PriorityQueue<Integer> heap;
    int maxk;

    public KthLargest(int k, int[] nums) {
        heap=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<nums.length;i++){
            heap.offer(nums[i]);
        }
        maxk=k;    
    }
    
    public int add(int val) {
        ArrayList<Integer> list=new ArrayList<>();
        int result=0;
        int tempk=maxk;
        heap.offer(val);
        while(tempk->0){
            result=heap.poll();
            list.add(result);
        }
        for(int i:list){
            heap.offer(i);
        }
        return result;


        
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */