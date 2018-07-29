import java.util.HashMap;
import java.util.*;

/**
 * sherlockstrings
 */
public class sherlockstrings {

    public static HashMap<Character, Integer> map = new HashMap<>();

    public static void main(String[] args) {

        System.out.println(isvalid("aabbcd"));

    }
    

    public static boolean isvalid(String str) {

        for(int i=0;i<str.length();i++)
        {
            if (map.containsKey(str.charAt(i))) {
                int c = map.get(str.charAt(i));
                c++;
                map.put(str.charAt(i), c);

            } else {
                map.put(str.charAt(i), 1);
            }
        }
        
        List<Value> values = new ArrayList<Value>(map.values());
        System.out.println(values);
        
        
        
        return true;


        
    }
}