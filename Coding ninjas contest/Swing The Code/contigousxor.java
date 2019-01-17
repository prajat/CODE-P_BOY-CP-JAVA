import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int i = 1; i <= t; i++) {
            int n = s.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = s.nextInt();
            }

            int ret = 0;
            int count = 0;
            for (int k = 0; k < n; k++) {
                count = (k + 1) * (n - k);
                if (count % 2 == 0) {
                    ret ^= arr[k];
                }
            }
            if (arr.length % 2 == 0) {
                System.out.print(0);
            } else {
                System.out.println(ret);
            }
            
        }
    }

}