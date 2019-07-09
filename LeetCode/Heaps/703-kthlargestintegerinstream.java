import java.util.*;

class solution1 { // using max heap
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
        ArrayList<Integer> list = new ArrayList<>();
        int result = 0;
        int tempk = maxk;
        heap.offer(val);
        while (tempk -> 0) {
            result = heap.poll();
            list.add(result);
        }
        for (int i : list) {
            heap.offer(i);
        }
        return result;

    }
}

class sloution2 { // using minheap of k size
    PriorityQueue<Integer> heap;
    int k;

    public KthLargest(int k, int[] nums) {
        this.k=k;
       this.heap=new PriorityQueue<>(k);
       for(int i:nums){
           heap.offer(i);
           if(heap.size()>k){
               heap.poll();
           }
       }
       
    }

    public int add(int val) {
        heap.offer(val);
        if (heap.size() > k) {
            heap.poll();
        }
        return heap.peek();

    }
}

/**
 * Your KthLargest object will be instantiated and called as such: KthLargest
 * obj = new KthLargest(k, nums); int param_1 = obj.add(val);
 */