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
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            int value = num - arr[i];
            if (set.containsKey(value)) {
                if (arr[i] < value) {
                    System.out.print(arr[i] + " " + value);
                } else {
                    System.out.print(value + " " + arr[i]);
                }
                System.out.println();
            }
            set.add(arr[i]);

        }
        
    
    
    }
}