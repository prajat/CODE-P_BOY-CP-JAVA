import java.util.*;
/**
 * 2stringshashmap
 */
public class twostringshashmap {

    public static void main(String[] args) {
        System.out.println(check("hello", "lo"));
        
    }
    public static String check(String s1,String s2)
    {
        HashMap<Character, Character> map = new HashMap<>();
        for(int i=0;i<s1.length();i++)
        {
            map.put(s1.charAt(i), s1.charAt(i));

        }
        for(int i=0;i<s2.length();i++)
        {
            if (map.containsValue(s2.charAt(i))) {
                return "YES";

            }

        }
        return "NO";
    }
}