import java.util.*;
/**
 * checksubset
 */
public class checksubset {

    public static boolean CheckSubset(int[] arr1, int n1, int[] arr2, int n2) {
        

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            if (!set.contains(arr2[i])) {

                return false;
            }
                else{
                    set.remove(arr1[i]);
                }
        }

        return true;
    }
}