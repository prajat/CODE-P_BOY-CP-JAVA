import java.util.*;

/**
 * mimimumswaps2sort
 */
public class mimimumswaps2sort {

    static int hourglassSum(int[][] arr) {
        int maxSum = Integer.MIN_VALUE;
        int tempSum;
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                tempSum = arr[i][j] + arr[i - 1][j] + arr[i - 1][j - 1] + arr[i - 1][j + 1] + arr[i + 1][j]
                        + arr[i + 1][j - 1] + arr[i + 1][j + 1];
                maxSum = Math.max(maxSum, tempSum);
            }
        }
        return maxSum;

    }
}