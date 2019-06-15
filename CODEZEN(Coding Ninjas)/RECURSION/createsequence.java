import java.util.*;

/**
 * createsequence
 */
public class createsequence {

    public static void main(String[] args) {
        printSequence(30, 1);
    }

    public static void printSequence(int n, int start) {
        if (start > n) {
            return;
        }

        int temp = start;
        boolean check = true;
        while (temp > 0) {
            int rem = temp % 10;
            if (!(rem == 2 || rem == 5)) {

                check = false;
                break;
            }
            temp = temp / 10;

        }
        if (check == true) {
            System.out.println(start);
        }

        printSequence(n, start + 1);

    }
}