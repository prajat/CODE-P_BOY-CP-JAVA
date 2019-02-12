import java.util.*;

public class nqueens {

    public static void placeNQueens(int n) {

        int[][] board = new int[n][n];
        placeNQueens(board, 0);
    }

    private static void placeNQueens(int[][] board, int row) {

        if (row >= board.length) {
            printboard(board);
            return;

        }
        for (int col = 0; col < board[0].length; col++) {
            if (check(board, row, col)) {
                board[row][col] = 1;
                placeNQueens(board, row + 1);
                board[row][col] = 0;
            }
        }

    }

    public static void printboard(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + " ");
            }
        }
        System.out.println();

    }

    public static boolean check(int[][] board, int row, int col) {

        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 1) {
                return false;
            }
        }
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }

        }
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {

            if (board[i][j] == 1) {
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        placeNQueens(4);
    }


}
