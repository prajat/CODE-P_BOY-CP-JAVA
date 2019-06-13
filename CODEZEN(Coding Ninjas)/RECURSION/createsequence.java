import java.util.*;
/**
 * createsequence
 */
public class createsequence {

    public static void printSequence(int range) {
        if (n < 2) {
            return;
        }
        if (n / 10 == 0) {
            System.out.println(n);
            return;
        }
        printSequence(n-1);

        
    }
}