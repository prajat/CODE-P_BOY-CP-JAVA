import java.util.*;
/**
 * removedupliactes
 */
public class removedupliactes {

    public static void main(String[] args) {

    }
    
    public static int[] removeDuplicates(int arr[]) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        Integer[] arr1 = new Integer[set.size()];
        set.toArray(arr1);

        return arr1;


        return null;
    }
}