import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] k = new int[n];
        int[] m = new int[n];
        int[] ans = new int[n];
        int max = 0;
        int maxi = 0;
        int count = 0;
        String[] b = new String[n];
        for (int i = 0; i < n; i++) {
            b[i] = s.next();
            k[i] = s.nextInt();
            m[i] = s.nextInt();
            ans[i] = evolve(k[i], m[i]);

        }
        for (int j = 0; j < n; j++) {
            if (max < ans[j]) {
                max = ans[j];
                maxi = j;
            }
            count += ans[j];
        }
        System.out.println(count);
        System.out.println(b[maxi]);

    }

    public static int evolve(int k, int m) {
        if (m < k) {
            return 0;
        }
        return 1 + evolve(k, m - k + 2);

    }

}