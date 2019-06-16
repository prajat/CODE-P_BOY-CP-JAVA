public class solution {

  public static int getMaxOnes(int[][] grid) {
    int maxRegion = 0;

    for (int row = 0; row < grid.length; row++) {
      for (int col = 0; col < grid[0].length; col++) {
        if (grid[row][col] == 1) {
          int size = findLargestRegion(grid, row, col);
          maxRegion = Math.max(maxRegion, size);
        }
      }
    }
    return maxRegion;
  }

  public static int findLargestRegion(int[][] grid, int row, int col) {

    if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length) {
      return 0;
    } else if (grid[row][col] == 0) {
      return 0;
    }

    grid[row][col] = 0;
    int size = 1;

    for (int r = row - 1; r <= row + 1; r++) {
      for (int c = col - 1; c <= col + 1; c++) {
        size += findLargestRegion(grid, r, c);
      }
    }

    return size;
  }
}
