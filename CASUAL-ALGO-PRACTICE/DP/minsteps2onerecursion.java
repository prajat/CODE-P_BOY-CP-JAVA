import java.util.*;
/**
 * minsteps2onerecursion
 */
public class minsteps2onerecursion {

    
    public static void main(String[] args) {

        System.out.println(minto1rec(2));
    }
    public static int  minto1rec(int n) {
        if (n == 1) {
            return 0;
        }
        int option1 = minto1rec(n - 1);
        int ans = option1;

        if (n % 3 == 0) {
            int option2 = minto1rec(n / 3);
            ans = Math.min(ans, option2);

        }

        if (n % 2 == 0) {
            int option3 = minto1rec(n / 2);

            ans = Math.min(ans, option3);
        }
        return 1 + ans;
        
    }
}