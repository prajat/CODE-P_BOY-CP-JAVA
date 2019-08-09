import java.util.Collections;
import java.util.PriorityQueue;

import javafx.scene.layout.Priority;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        for (int i : nums) {
            heap.offer(i);
        }
        int ans = 0;
        for (int i = 0; i < k; i++) {
            ans = heap.poll();
        }
        return ans;

    }
}