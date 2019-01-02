import java.util.*;
/**
 * mincostpathdp
 */
public class mincostpathdp {

    public static void main(String[] args) {

        int[][] arr = { { 1, 1, 1 }, { 4, 5, 2 }, { 7, 8, 9 } };
        System.out.println(mincostpath(arr));
    }

    public static int mincostpath(int[][]arr) {
        int m = arr.length;
        int n = arr[0].length;

        int[][] storage = new int[m][n];
        return mincostpath(arr, 0, 0, storage);

    }

    public static int mincostpath(int[][] arr, int i, int j, int[][] storage) {
        int m = arr.length;
        int n = arr[0].length;

        if (i == m - 1 && j == n - 1) {
            storage[m - 1][n - 1] = arr[i][j];
            return storage[i][j];

        }
        if (i >= m || j >= n) {
            return Integer.MAX_VALUE;
        }

        int op1 = mincostpath(arr, i + 1, j, storage);
        int op2 = mincostpath(arr, i, j + 1, storage);
        int op3 = mincostpath(arr, i + 1, j + 1, storage);
        storage[i][j] = arr[i][j] + Math.min(op1, Math.min(op2, op3));
        return storage[i][j];

        
    }
}