import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();

        }

        int firstans = 0;
        int secans = 0;
        for (int i = 0; i < n; i++) {

            if (i % 2 == 0 && arr[i] % 2 == 0) {
                firstans += arr[i];
            }
            if (i % 2 != 0 && arr[i] % 2 != 0) {
                secans += arr[i];
            }

        }
        System.out.print(firstans + " " + secans);

    }
}