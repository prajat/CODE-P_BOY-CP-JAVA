import java.util.*;

class Solution {
    int[] xcord = { 0, 1, 0, -1 };
    int[] ycord = { 1, 0, -1, 0 };

    public int maxAreaOfIsland(int[][] grid) {
        int ans = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    int area = dfs(grid, i, j);
                    ans = Math.max(ans, area);
                }
            }
        }
        return ans;

    }

    public int dfs(int[][] grid, int x, int y) {

        if (x < 0 || y < 0 || x >= grid.length || y >= grid.length || grid[x][y] == 0) {
            return 0;
        }
        grid[x][y] = 0;
        int size = 1;
        for (int i = 0; i < xcord.length; i++) {
            size += dfs(grid, x + cord[i], y + ycord[i]);
        }

        return size;

    }
}