class Solution {
    public int majorityElement(int[] arr) {
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

        }
        for (Map.Entry<Integer, Integer> i : map.entrySet()) {
            if (i.getValue() > arr.length / 2) {
                ans = i.getKey();
            }
        }
        return ans;

    }
}