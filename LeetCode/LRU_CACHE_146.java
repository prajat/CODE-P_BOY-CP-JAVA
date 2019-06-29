import java.util.*;

class LRUCache {
    HashMap<Integer, Integer> map;
    Queue<Integer> queue;
    int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new LinkedHashMap<>();
        this.queue = new LinkedList<>();

    }

    public int get(int x) {
        if (map.containsKey(x)) {
            int ans = map.get(x);
            queue.remove(x);
            queue.add(x);
            return ans;
        }
        return -1;
    }

    public void put(int x, int y) {
        if (map.containsKey(x)) {
            map.put(x, y);
            queue.remove(x);
            queue.add(x);
        }
        if (!map.containsKey(x)) {
            if (queue.size() == capacity) {
                int key = queue.poll();
                map.remove(key);
                queue.add(x);
                map.put(x, y);

            }

        } else {
            map.put(x, y);
            queue.add(x);
        }

    }
}

/**
 * Your LRUCache object will be instantiated and called as such: LRUCache obj =
 * new LRUCache(capacity); int param_1 = obj.get(key); obj.put(key,value);
 */