import java.util.*;
/**
 * removeduplicates
 */
public class removeduplicates {

    public static void main(String[] args) {

    }
    
    public static String removeConsecutiveDuplicates(String s) {
        if (s.length() == 0) {
            return "";
        }
        char cc = s.charAt(0);

        String smallans = removeConsecutiveDuplicates(s.substring(1));
        String myans = smallans;
        if (cc != smallans.charAt(0)) {
            myans = cc + smallans;
        }
        return myans;


    }

}