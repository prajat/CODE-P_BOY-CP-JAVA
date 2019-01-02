import java.util.*;
/**
 * LCSrecursive
 */
public class LCSrecursive {

    public static void main(String[] args) {

        String a = "dgei";
        String b = "begi";
        System.out.println(lcs(a, b));  

    }

    public static int lcs(String a, String b) {
        if (a.length() == 0 || b.length() == 0) {
            return 0;
        }
        if (a.charAt(0) == b.charAt(0)) {
            return 1 + lcs(a.substring(1), b.substring(1));

        } else {
            int op1 = lcs(a.substring(1), b);
            int op2 = lcs(a, b.substring(1));
            return Math.max(op1, op2);
        }
        
    }
}