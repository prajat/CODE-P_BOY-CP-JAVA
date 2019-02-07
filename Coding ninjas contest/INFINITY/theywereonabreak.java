import java.util.*;

/**
 * theywereonabreak
 */
public class theywereonabreak {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        System.out.println(fib(n));
    }

    // public static int fibo(int n,int[] dp,int count) {
    // if (n == 0 || n == 1) {
    // dp[0] = 1;
    // dp[1] = 1;
    // return dp[n];
    // }

    // if (dp[n] > 0) {
    // return dp[n];
    // }
    // int fib = fibo(n - 1, dp,count) + fibo(n - 2, dp,count);
    // dp[n] = fib;
    // return dp[n];

    // }
    public static long fib(long n) {
        long[] dp = new long[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        long count = 2;
        for (long i = 2; i < n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
            if (dp[i] % 4 != 0 && dp[i] % 5 != 0) {
                count++;
            }
        }
        return count;

    }
}

//     public static void main(String[] args) {
//         /*
//          * Your class should be named Main. Read input as specified in the question.
//          * Print output as specified in the question.
//          */

//         // Write your code here
//         Scanner s = new Scanner(System.in);
//         int n = s.nextInt();
//         System.out.println(fib(n));
//     }

//   public static int fib(int n) {
//         int[] dp = new int[n + 1];
//         dp[0] = 1;
//         dp[1] = 1;
//         int count = 2;
//         for (int i = 2; i < n; i++) {
//             dp[i] = dp[i - 1] + dp[i - 2];
//             if (dp[i] % 4 != 0 && dp[i] % 5 != 0) {
//                 count++;
//             }
//         }
//         return count;

//     }
