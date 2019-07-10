import java.util.*;

class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        for (int i : stones) {
            heap.offer(i);
        }

        while (heap.size() >= 1) {
            int y = heap.poll();
            int x = heap.poll();
            if (x == y) {
                continue;
            } else {
                y = y - x;
                heap.offer(y);
            }

        }
        if (heap.size() == 1) {
            return heap.poll();

        } else {
            return 0;
        }

    }
}