import java.util.*;

/**
 * allconsecutiveelements
 */
public class allconsecutiveelements {

    public static boolean containsConsecutiveNumbers(int[] input) {
       

        int[] arr = new int[1000001];
        arr[0] = 1;
        for (int i = 0; i < input.length; i++) {
            arr[input[i]] = 1;

        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < input.length; i++) {
            if (input[i] > max) {
                max = input[i];
            }
            if (input[i] < min) {
                min = input[i];
            }
        }
        for (int i = min; i <= max; i++) {
            if (arr[i] == 0) {
                return false;
            }
        }
        return true;

    }
}