import java.util.*;
import java.lang.*;
import java.io.*;

class sppthelastbattle {
    public static void main(String[] args) {
        // code
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        for (int i = 1; i <= N; i++) {

            int n = s.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for (int j = 0; j < a.length; j++) {
                a[j] = s.nextInt();
            }
            for (int j = 0; j < b.length; j++) {
                b[j] = s.nextInt();
            }
            solve(a, b);
        }

    }

    public static void solve(int[] a, int[] b) {
        int counta = 0;
        int countb = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > b[i]) {
                counta++;

            }
            if (b[i] > a[i]) {
                countb++;

            }
        }
        if (counta > countb) {
            System.out.println(counta + countb + "A");
        } else if (countb > counta) {
            System.out.println(counta + countb + "B");
        } else {
            System.out.println(counta + countb + "DRAW");
        }

    }
}