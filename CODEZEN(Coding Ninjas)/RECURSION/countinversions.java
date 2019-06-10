import java.util.*;
/**
 * countinversions
 */
public class countinversions {

    public static void main(String[] args) {

        int[] A = { 2,5,1,3,4 };
        System.out.println(solve(A,0));
    }
    
    public static long solve(int[] A, int start) {

        if (start == A.length) {
            return 0;
        }
        int firstn = A[start];
        long smallans = solve(A, start + 1);

        long count=0;
        for (int i = start; i < A.length; i++) {
            if (firstn > A[i]) {
                count++;
            }

        }
        return smallans + count;

    }
}