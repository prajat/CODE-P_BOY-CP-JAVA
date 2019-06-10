import java.util.*;
/**
 * staircase
 */
public class staircase {

    public static int findWays(int n) {

        if (n == 1 || n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
    
        return findWays(n - 1) + findWays(n - 2) + findWays(n - 3);

    }
}