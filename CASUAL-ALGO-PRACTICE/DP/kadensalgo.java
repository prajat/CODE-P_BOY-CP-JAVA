import java.util.*;

/**
 * kadensalgo
 */
public class kadensalgo {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, -5, 6, 3 };
        System.out.println(kaden(arr));
    }

    public static int kaden(int[] arr) {
        int curr_sum = 0;
        int best_sum = 0;
        for (int i = 0; i < arr.length; i++) {
            curr_sum += arr[i];
            if (best_sum < curr_sum) {
                best_sum = curr_sum;

            }
            if (curr_sum < 0) {
                curr_sum = 0;
            }
        }
        return best_sum;

    }
}