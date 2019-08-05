import java.util.*;

class Solution {
    public void rotate(int[][] matrix) {

        //diagonal reverse
        int l=matrix.length;
        for (int i = 0; i < l; i++) {
            for (int j = i; j < l; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        //reverse every row
        for (int i = 0; i < l; i++) {
            int left = 0;
            int right = m - 1;
            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }

    }
}