import java.util.*;
/**
 * pairsuminarray
 */
public class pairsuminarray {

    public static void pairSum(int[] arr, int num) {
        // HashSet<Integer> set = new HashSet<>();
        // for (int i = 0; i < arr.length; i++) {
        //     set.add(arr[i]);
        // }

        // for (int i = 0; i < arr.length; i++) {

        //     int value=num-arr[i];
        //     if (set.contains(value)) {
        //         if (arr[i] < value) {
        //             System.out.print(arr[i] + " " + value);
        //         }
        //         else {
        //             System.out.print(value + " " + arr[i]);
        //         }
        //         System.out.println();
        //         set.remove(value);
        //     }

        // }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }

        }
        for (int i = 0; i < arr.length; i++) {
            int value = num - arr[i];
            if (map.containsKey(value)) {
                if (map.get(value) >= 1) {
                    if (arr[i] < value) {
                    System.out.print(arr[i] + " " + value);
                }
                else {
                    System.out.print(value + " " + arr[i]);
                }
                System.out.println();
                    map.put(arr[i], map.get(value) - 1);
                    
                    
                }

            }
        }
    
    
    }
}