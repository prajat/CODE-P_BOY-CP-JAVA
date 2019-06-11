import java.util.*;
/**
 * countinversions
 */
public class countinversions {

    public static void main(String[] args) {

        int[] A = { 3, 2, 1 };
        System.out.println(solve(A, A.length));
    }
     
    public static long solve(int[] A, int n) {

        int[] temp = new int[A.length];
        return mergesort(A, temp, 0, A.length - 1);

    }

    public static long mergesort(int[] arr, int[] temp, int left, int right) {

        long invcount = 0;
        if (right > left) {
            int mid = (right+left) / 2;
            invcount = mergesort(arr, temp, left, mid);
            invcount += mergesort(arr, temp, mid + 1, right);

            invcount += merge(arr, temp, left, mid + 1, right);

        }
        return invcount;

    }

    public static long merge(int[] arr, int[] temp, int left, int mid, int right) {
        int i = left;
        int j = mid;
        int k = left;
        long invcount=0;
        while ((i <= mid - 1) && (j <= right)) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                invcount += (long)(mid - i);
            }
        }
        while (i <= mid-1) {
            temp[k++] = arr[i++];
        }
        while (j <= right) {
            temp[k++] = arr[j++];
        }
        for (int x = left; x <= right; x++) {
            arr[x] = temp[x];
        }
        return invcount;
        
    }


}