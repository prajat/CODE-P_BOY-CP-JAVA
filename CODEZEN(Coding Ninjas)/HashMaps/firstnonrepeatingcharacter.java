import java.util.*;
/**
 * firstnonrepeatingcharacter
 */
public class firstnonrepeatingcharacter {

    public static char firstNonRepeatingChar(String str) {
        // write your code here.

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char cc = str.charAt(i);
            if (map.containsKey(cc)) {
                map.put(cc, map.get(cc) + 1);
            } else {
                map.put(cc, 1);
            }
        }
        for (Map.Entry<Character, Integer> i : map.entrySet()) {
            if (i.getValue() == 1) {
                return i.getKey();
            }
        }

        return str.charAt(0);
    }
}