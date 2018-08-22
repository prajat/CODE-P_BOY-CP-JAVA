/**
 * n-queen
 */

import java.util.*;
public class nqueen {

    public static void main(String[] args) {

        solveNQ();

        
    }

    public static void solveNQ() {
        int[][] board = new int[4][4];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = 0;
            }
        }
        solveNQ2(board, 0);

    }

    public static void solveNQ2(int[][] board, int col) {
        if (col >= board[0].length) {
            printboard(board);
            return;
        }

        for (int i = 0; i < board.length; i++) {

            if (issafe(board, i, col)) {
                board[i][col] = 1;
                solveNQ2(board, col + 1);
                board[i][col] = 0;
            }
        }
    }
        
        
    public static boolean issafe(int[][] board, int row, int col) {
        for (int i = 0; i <= col; i++) {
            if (board[row][i] == 1)
                return false;

        }
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--)

        {
            if (board[i][j] == 1)
                return false;

        }
        for (int i = row,  j = col; i < board.length && j >= 0; i++, j--) {
            if (board[i][j] == 1)
                return false;

        }
        return true;

    }

    public static void printboard(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {

                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}