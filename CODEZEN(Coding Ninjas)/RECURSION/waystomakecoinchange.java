import java.util.*;

public class Solution {

    public static int countWaysToMakeChange(int denominations[], int value) {

        return countWaysToMakeChange(denominations, 0, value);

    }

    public static int countWaysToMakeChange(int[] denominations, int start, int value) {

        if (value == 0) {
            return 1;
        }
        if (denominations.length == start || value < 1) {
            return 0;
        }

        int coin = denominations[start];
        int op1 = countWaysToMakeChange(denominations, start, value - coin);
        int op2 = countWaysToMakeChange(denominations, start + 1, value);
        return op1 + op2;
    }

}