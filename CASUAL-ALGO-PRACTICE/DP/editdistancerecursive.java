import java.util.*;

/**
 * editdistancerecursive
 */
public class editdistancerecursive {

    public static void main(String[] args) {

        String a = "adef";
        String b = "gbed";
        System.out.println(editdistancerec(a, b));
    }

    public static int editdistancerec(String a, String b) {
        if (a.length() == 0) {
            return b.length();

        }
        if (b.length() == 0) {
            return a.length();
        }
        if (a.charAt(0) == b.charAt(0)) {   
            return editdistancerec(a.substring(1), b.substring(1));

        } else {
            int op1 = editdistancerec(a, b.substring(1));
            int op2 = editdistancerec(a.substring(1), b);
            int op3 = editdistancerec(a.substring(1), b.substring(1));
            return 1+Math.min(op1, Math.min(op2, op3));
        }

    }
}