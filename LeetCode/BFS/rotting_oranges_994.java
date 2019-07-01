import java.util.LinkedList;
import java.util.Queue;

class Rotting_oranges_994 {


    public int orangesRotting(int[][] grid) {

        return bfs(grid);

    }

    public class Cell {
        int x;
        int y;
        int t;

        Cell(int x, int y, int t) {
            this.x = x;
            this.y = y;
            this.t = t;
        }

    }

    public boolean issafe(int x, int y, int[][] grid) {
        return (x >= 0 && x < grid.length && y >= 0 && y < grid[0].length);
    }

    public int bfs(int[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        Queue<Cell> queue = new LinkedList<>();
        int freshorng = 0;
        int time=0;
        int[] dx = {1,-1,0,0};
        int[] dy = {0,0,1,-1};
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2) {
                    queue.add(new Cell(i, j, 0));

                } else if (grid[i][j] == 1) {
                    freshorng++;
                }
            }
        }
        if (freshorng == 0) {
            return 0;
        }
        while (!queue.isEmpty()) {
            Cell cell = queue.poll();
            int x = cell.x;
            int y = cell.y;
            int t = cell.t;
            time=Math.max(time,t);
            if (visited[x][y]) {
                continue;
            } else {
                visited[x][y] = true;
            }
            for (int i = 0; i < 4; i++) {
                int px = x + dx[i];
                int py = y + dy[i];
                if (issafe(px, py, grid) && grid[px][py] == 1 && visited[px][py] == false) {

                    grid[px][py] = 2;
                    queue.add(new Cell(px, py, t + 1));
                }
            }

        }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    return -1;
                }
            }
        }
        return time;
    }
}