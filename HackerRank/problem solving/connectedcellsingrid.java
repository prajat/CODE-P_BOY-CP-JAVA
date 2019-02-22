import java.util.*;

public class connectedcellsingrid {

    // Complete the connectedCell function below.
    public static int connectedCell(int[][] matrix) {

        boolean[][] visited = new boolean[matrix.length][matrix.length];
        return maxcount(matrix, visited);

    }

    public static int maxcount(int[][] matrix, boolean[][] visited) {
        int count = 0;
        int maxcount = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1 && !visited[i][j]) {
                    count = dfs(matrix, visited, i, j);
                    maxcount = Math.max(maxcount, count);

                }
            }
        }
        return maxcount;

    }

    private static int dfs(int[][] matrix, boolean[][] visited, int row, int col) {

        int count = 0;
        visited[row][col] = 1;
        for (int i = row - 1; i <= row + 1; i++) {
            for (int j = col - 1; col <= col + 1; j++) {
                if (issafe(matrix, visited, row, col)) {
                    count += dfs(matrix, visited, i, j);

                }

            }
        }
        return count;

    }

    public static boolean issafe(int[][] matrix, boolean[][] visited, int row, int col) {

        return (row >= 0) && (row < arr.length) && (col >= 0) && (col < arr[0].length) && (arr[row][col] == 1)
                && (visited[row][col] == false);
        
        
    }

    
}