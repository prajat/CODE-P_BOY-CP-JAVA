class MedianFinder {
    PriorityQueue<Integer> minheap;
    PriorityQueue<Integer> maxheap;

    /** initialize your data structure here. */
    public MedianFinder() {
        minheap = new PriorityQueue<>();
        maxheap = new PriorityQueue<>(Collections.reverseOrder());

    }

    public void addNum(int num) {
        minheap.offer(num);
        maxheap.offer(minheap.poll());
        if (minheap.size() < maxheap.size()) {
            minheap.offer(maxheap.poll());
        }

    }

    public double findMedian() {
        if (minheap.size() > maxheap.size()) {
            return minheap.peek();
        } else {
            return (minheap.peek() + maxheap.peek()) / 2.0;
        }

    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder(); obj.addNum(num); double param_2 =
 * obj.findMedian();
 */