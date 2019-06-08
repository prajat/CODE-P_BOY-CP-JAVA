import java.util.*;

/**
 * maximumfrequencynumber
 */
public class maximumfrequencynumber {

    public static int maxFrequencyNumber(int[] arr) {
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);

            } else {
                map.put(arr[i], 1);
            }
        }
        int max = 0;
        int maxkey = 0;
        for (Map.Entry<Integer, Integer> i : map.entrySet()) {
            if (i.getValue() > max) {
                max = i.getValue();
                maxkey = i.getKey();
            }
        }
        return maxkey;

    }
}