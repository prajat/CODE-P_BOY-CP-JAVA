class Solution {
    public int findKthLargest(int[] nums, int k) {
        // PriorityQueue<Integer> heap = new
        // PriorityQueue<>(Collections.reverseOrder());
        // for (int i : nums) {
        // heap.offer(i);
        // }
        // int ans = 0;
        // for (int i = 0; i < k; i++) {
        // ans = heap.poll();
        // }
        // return ans;

       
       
        //min heap method
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int i : nums) {
            heap.offer(i);
            if (heap.size() > k) {
                heap.poll();
            }
        }
        return heap.peek();
    }
}