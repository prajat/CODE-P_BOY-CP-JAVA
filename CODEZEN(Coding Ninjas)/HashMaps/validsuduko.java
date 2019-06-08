import java.util.*;

/**
 * validsuduko
 */
public class validsuduko {

    public static boolean isSudokuValid(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; i++) {
                if (isvalid(arr, i, j) == false) {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean rowcheck(int[][] arr, int row) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr[0].length; i++) {
            if (set.contains(arr[row][i])) {
                return false;
            }
            if (arr[row][i] != 0) {
                set.add(arr[row][i]);
            }
        }
        return true;

    }

    public static boolean colcheck(int[][] arr, int col) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i][col])) {
                return false;
            }
            if (arr[i][col] != 0) {
                set.add(arr[i][col]);
            }
        }
        return true;

    }

    public static boolean boxcheck(int[][] arr, int row, int col) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int curr = arr[i + row][j + col];

                if (set.contains(curr)) {
                    return false;
                }
                if (curr != 0) {
                    set.add(curr);
                }
            }
        }
        return true;

    }

    public static boolean isvalid(int[][] arr, int row, int col) {
        return rowcheck(arr, row) && colcheck(arr, col) && boxcheck(arr, row - row % 3, col - col % 3);

    }
}

