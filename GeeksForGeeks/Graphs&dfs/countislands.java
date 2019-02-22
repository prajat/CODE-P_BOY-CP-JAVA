import java.util.*;

/**
 * countislands
 */
public class countislands {

    public static void main(String[] args) {

        int[][] arr = new int[][] { { 1, 1, 0, 0, 0 }, { 0, 1, 0, 0, 1 }, { 1, 0, 0, 1, 1 }, { 0, 0, 0, 0, 0 },
                { 1, 0, 1, 0, 0 } };
                System.out.println(count(arr));
    }

    public static int count(int[][] arr) {
        boolean[][] visited = new boolean[arr.length][arr.length];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 1 && visited[i][j] == false) {
                    dfs(arr, visited, i, j);
                    count++;
                }

            }
        }
        return count;

    }

    private static void dfs(int[][] arr, boolean[][] visited, int i, int j) {
        int rowNbr[] = new int[] { -1, -1, -1, 0, 0, 1, 1, 1 };
        int colNbr[] = new int[] { -1, 0, 1, -1, 1, -1, 0, 1 };
        visited[i][j] = true;
        for (int k = 0; k < 8; k++) {
            if (issafe(arr, i + rowNbr[k], j + colNbr[k], visited)) {
                dfs(arr, visited, i + rowNbr[k], j + colNbr[k]);
            }
        }

    }

    public static boolean issafe(int[][] arr, int row, int col, boolean[][] visited) {

        return (row >= 0) && (row < arr.length) && (col >= 0) && (col < arr[0].length) && (arr[row][col] == 1)
                && (visited[row][col] == false);
        
        
    }

    
}