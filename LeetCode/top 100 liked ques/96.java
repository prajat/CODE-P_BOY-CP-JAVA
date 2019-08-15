class Solution {

    public int numTrees(int n) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(0, 1);
        map.put(1, 1);
        return numTrees(n, map);
    }

    private int numTrees(int n, Map<Integer, Integer> map) {

        if (map.containsKey(n))
            return map.get(n);

        int sum = 0;
        for (int i = 1; i <= n; i++)
            sum += numTrees(i - 1, map) * numTrees(n - i, map);
        map.put(n, sum);
        return sum;
    }
}