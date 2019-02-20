import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();

        }
        Arrays.sort(arr, Collections.reverseOrder());

        int mincost = 0;
        int currcost = 0;
        int count = 0;

        for (int i = 0; i < arr.length - 1;) {

            currcost = arr[i] + arr[i + 1];
            mincost += currcost;
            currcost = 0;
            i = i + 3;
            if (i == arr.length - 1) {
                mincost += arr[i];
            }

        }
        System.out.println(mincost);

    }

}