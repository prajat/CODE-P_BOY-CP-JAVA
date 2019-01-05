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
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        Arrays.sort(arr);
        int count = 0;
        for (int i = 1; i < arr.length; i++) {

            for (int j = i - 1; j >= 0; j--) {
                if (arr[i] > arr[j] && arr[i] < arr[j] + p) {
                    count++;
                }
            }



        }
            

        System.out.println(n-count);
    }
}