import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        for (int i = 1; i <= t; i++) {
            long n = in.nextLong();
            long sum = 0;
            while (n > 0) {
                long r = n % 10;
                sum += r;
                n = n / 10;
            }
            System.out.println(sum);
        }

    }
}