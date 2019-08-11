class Solution {
    int ans = 0;

    public int uniquePaths(int m, int n) {

        int[][] grid = new int[n][m];
        int[][] dp = new int[n][m];
        return count(grid, 0, 0, dp);

    }

    public int count(int[][] grid, int x, int y, int[][] dp) {
        if (x == grid.length - 1 && y == grid[0].length) {

            return 1;
        }
        if (x < 0 || x >= grid.length || y < 0 || y >= grid[0].length) {
            return 0;
        }
        if (dp[x][y] != 0) {
            return dp[x][y];
        }

        int op1 = count(grid, x, y + 1, dp);
        int op2 = count(grid, x + 1, y, dp);
        dp[x][y] = op1 + op2;
        return dp[x][y];
    }
}