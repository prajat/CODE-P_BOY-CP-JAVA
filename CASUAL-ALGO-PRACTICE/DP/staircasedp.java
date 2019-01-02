import java.util.*;
/**
 * staircasedp
 */
public class staircasedp {

    public static void main(String[] args) {

        System.out.println(countsteps(3));
    }

    public static int countsteps(int n) {
        int[] storage = new int[n + 1];
        return countsteps(n, storage);

    }

    public static int countsteps(int n, int[] storage) {
        if (n == 0 || n == 1) {
            storage[n] = 1;
            return storage[n];
        }
        if (n == 2) {
            storage[n] = 2;
            return storage[n];
        }
        if (storage[n] > 0) {
            return storage[n];
        }
        storage[n] = countsteps(n - 1, storage) + countsteps(n - 2, storage) + countsteps(n - 3, storage);
        return storage[n];
        
    }
}