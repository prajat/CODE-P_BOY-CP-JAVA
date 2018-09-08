import java.util.*;

/**
 * climbingtheleaderboard
 */
public class climbingtheleaderboard {

    public static void main(String[] args) {
        int[] scores = { 100, 90, 90, 80, 75, 60 };
        int[] alice = { 50, 65, 77, 90, 102 };
        int[] arr = climbingLeaderboard(scores, alice);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    public static int[] climbingLeaderboard(int[] scores, int[] alice) {
        Set<Integer> set = new HashSet();
        for (int i : scores) {
            set.add(i);
        }

        Iterator iterator = set.iterator();

        Integer[] a = new Integer[set.size()];
        a = set.toArray(a);
        Arrays.sort(a, Collections.reverseOrder());
        int[] result = new int[alice.length];
        for (int i = 0; i < result.length; i++)
        {
            result[i] = 1;
        }

        for (int j = 0; j < alice.length; j++) {
            int low = 0;
            int high = a.length - 1;
            while (low <= high) {
                int middle = (low + high) / 2;
                if (alice[j] == a[middle]) {
                    result[j] = middle + 1;
                    break;
                }

                else if (alice[j] < a[middle]) {
                    result[j] = middle + 2;
                    low = middle + 1;
                } else {
                    high = middle - 1;
                }
            }

        }
        // for (int i = 0; i < a.length; i++) {

        //     if (alice[j] >= a[i]) {
        //         result[j] = i + 1;
        //         break;
        //     }

        // }
        // if (result[j] == 0) {
        //     result[j] = a.length + 1;
        // }

        return result;
    }
        
    }
