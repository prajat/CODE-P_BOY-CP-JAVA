import java.util.*;

/**
 * thewrestlinggame
 */
public class thewrestlinggame {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int p = s.nextInt();
        int[] arr = new int[n];
        Arrays.sort(arr);
        int ans=n;
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] < arr[i] && arr[i] <= arr[j] + p) {
                    ans--;
                }
                i = j - 1;
            }
        }

        System.out.println(ans);
    }
}