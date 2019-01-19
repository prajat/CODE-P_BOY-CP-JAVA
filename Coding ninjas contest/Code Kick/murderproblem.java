import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Write your code here

        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int i = 1; i <= t; i++) {
            int n = s.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = s.nextInt();
            }

            long sum = 0;
            for (int m = 1; m < arr.length; m++) {
                for (int k = m - 1; k >= 0; k--) {
                    if (arr[k] < arr[m]) {
                        sum += arr[k];
                    }
                }
            }
            System.out.println(sum);

        }
    }

}