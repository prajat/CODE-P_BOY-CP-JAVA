import java.util.*;


/**
 * coinchangedp
 */
public class coinchangedp {

    public static void main(String[] args) {

        int[] den = { 1, 2 };
        System.out.println(coinchange(4, den, 2));
    }

    public static int coinchange(int n, int[] den, int numd) {
        int[][] storage = new int[n + 1][numd + 1];
        return coinchange(n, den, 0, numd, storage);

    }

    public static int coinchange(int n, int[] den, int start, int numd, int[][] storage) {
        if (n == 0) {
            return 1;

        }
        if (numd == 0) {
            return 0;
        }
        if (n < 0) {
            return 0;
        }
        if (storage[n][numd] > 0) {
            return storage[n][numd];

        }
        int op1 = coinchange(n - den[start], den, start, numd, storage);
        int op2 = coinchange(n, den, start + 1, numd - 1, storage);

        storage[n][numd] = op1 + op2;
        return op1 + op2;
        

        
    }
}