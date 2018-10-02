import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. */
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();

        for (int i = 1; i <= T; i++) {
            int n = s.nextInt();
            boolean ans = check(n);
            if (ans == false) {
                System.out.println("Not prime");
            } else {
                System.out.println("Prime");
            }
        }

    }

    public static boolean check(int n) {
        if (n < 2)
            return false;
        if (n == 2 || n == 3)
            return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;

        for (int i = 5; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

}
