import java.util.*;

/**
 * maximumdistance
 */
public class maximumdistance {

    public static int maxDistance(int arr[]) {
        


        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                list.add(arr[i]);
            }
            set.add(arr[i]);
        }
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();


        for (int i = 0; i < arr.length; i++) {

            map.put(i, arr[i]);
        }
        
        ArrayList<Integer> maxlist = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            for (Map.Entry<Integer, Integer> it : map.entrySet()) {
                int first = -1;
                int second = 0;
                if (it.getValue() == list.get(i)) {

                    if (first >= 0) {
                        second = it.getKey();
                    } else {
                        first = it.getKey();
                    }
                    maxlist.add(second - first);

                }
            }

        }
        int max = 0;
        for (int i = 0; i < maxlist.size(); i++) {
            if (maxlist.get(i) > max) {
                max = maxlist.get(i);
            }

        }
        return max;
        
        



        
        return 0;
    }
}