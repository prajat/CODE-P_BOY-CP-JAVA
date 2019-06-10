import java.util.*;
/**
 * removeduplicates
 */
public class removeduplicates {

    public static String removeConsecutiveDuplicates(String s) {
            if (s.length() == 1) {
                return s;
            }
            char cc=s.charAt(0);
            String smallans = removeConsecutiveDuplicates(s.substring(1));
            if (cc == smallans.charAt(0)) {
                return smallans;
            }
            return cc + smallans;
    }

}