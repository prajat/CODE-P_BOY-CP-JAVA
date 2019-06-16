import java.util.*;
/**
 * editdistance
 */
public class editdistance {

    public static void main(String[] args) {

        System.out.println(editDistance("loki", "raja"));
    }
    
    public static int editDistance(String s1, String s2) {

            if (s1.length() == 0){
                return s2.length();
            }
                
            if (s2.length() == 0) {
                return s1.length();
            }
            char cc1 = s1.charAt(0);
            char cc2 = s2.charAt(0);

            if (cc1 == cc2) {
                return editDistance(s1.substring(1) , s2.substring(1));

            }
            else {
                int op1 = 1 + editDistance(s1.substring(1), s2.substring(1));
                int op2 = 1 + editDistance(s1.substring(1), s2);
                int op3 = 1 + editDistance(s1, s2.substring(1));

                return Math.min(op1, Math.min(op2, op3));

            }
        
        
        


    }
}