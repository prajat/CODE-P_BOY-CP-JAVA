import java.util.*;

/**
 * longestsubstringwithoutrepeat
 */
public class longestsubstringwithoutrepeat {

    public static int longestSubstringLength(String str) {

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char cc = str.charAt(i);
            if(map.containsKey(cc)){
                map.put(cc, map.get(cc)+1);

            }else{
                map.put(cc, 1);
            }
        }
        int count=0;
        int max = 0;
        int[] arr = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = map.get(arr[i]);

        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!= 1) {
                count = 0;
            }
            if (arr[i]== 1) {
                count++;
                max = Math.max(max, count);
            }
        }
        
        return max;
    }
}
