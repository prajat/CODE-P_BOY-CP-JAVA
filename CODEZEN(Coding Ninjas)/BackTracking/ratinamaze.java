
public class Solution {

    public static void ratInAMaze(int maze[][]) {

        int[][] solution = new int[maze.length][maze.length];
        ratInAMaze(maze,solution,0,0);
    }

    private static void ratInAMaze(int[][] maze, int[][] solution, int i, int j) {

        if (i == maze.length - 1 && j == maze.length - 1) {
            solution[i][j] = 1;
            printsolution(solution);
            solution[i][j] = 0;
            return;
        }
        if (i >= maze.length || j >= maze.length || i < 0 || j < 0 || maze[i][j] == 0 || solution[i][j] == 1) {
            return;
        }
        solution[i][j] = 1;
        ratInAMaze(maze, solution, i + 1, j);
        ratInAMaze(maze, solution, i, j + 1);
        ratInAMaze(maze, solution, i - 1, j);
        ratInAMaze(maze, solution, i, j - 1);
        solution[i][j] = 0;

    }

    public static void printsolution(int[][] solution) {
        for (int i = 0; i < solution.length; i++) {
            for (int j = 0; j < solution.length; j++) {
                System.out.print(solution[i][j] + " ");
            }
            
        }
        System.out.println();
        
    }

}