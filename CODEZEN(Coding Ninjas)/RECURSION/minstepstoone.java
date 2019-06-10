import java.util.*;
/**
 * minstepstoone
 */
public class minstepstoone {

    public static int countStepsTo1(int n) {

        int min = Integer.MAX_VALUE;
        if (n == 1) {
            return 0;
        }
        if (n % 3 == 0) {
            int step1 = 1 + countStepsTo1(n / 3);
            min = Math.min(min, step1);
        }
        if (n % 2 == 0) {
            int step2 = 1 + countStepsTo1(n / 2);
            min = Math.min(min, step2);
        }
        itn step3 = 1 + countStepsTo1(n - 1);
        return Math.min(min, step3);

    }
}