class Solution {
    public int[] maxSlidingWindow(int[] a, int k) {


        //maxheap method
        if(nums.length == 0) return new int[0];
        ArrayList<Integer> list=new ArrayList<>();
        PriorityQueue<Integer> heap=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<k;i++){
        heap.offer(nums[i]);
        }
        list.add(heap.peek());
        for(int i=k;i<nums.length;i++){
        heap.remove(nums[i-k]);
        heap.offer(nums[i]);
        list.add(heap.peek());
        }
        int[] arr=new int[list.size()];
        for(int i=0;i<arr.length;i++){
        arr[i]=list.get(i);
        }
        return arr;


        //dequeue method
        if (a == null || k <= 0) {
            return new int[0];
        }
        int n = a.length;
        int[] r = new int[n - k + 1];
        int ri = 0;
        // store index
        Deque<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < a.length; i++) {
            // remove numbers out of range k
            while (!q.isEmpty() && q.peek() < i - k + 1) {
                q.poll();
            }
            // remove smaller numbers in k range as they are useless
            while (!q.isEmpty() && a[q.peekLast()] < a[i]) {
                q.pollLast();
            }
            // q contains index... r contains content
            q.offer(i);
            if (i >= k - 1) {
                r[ri++] = a[q.peek()];
            }
        }
        return r;

    }
}