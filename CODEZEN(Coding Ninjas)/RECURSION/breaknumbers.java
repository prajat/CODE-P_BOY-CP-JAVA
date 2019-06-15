import java.util.*;

/**
 * breaknumbers
 */
public class breaknumbers {

    public static void main(String[] args) {

        // printCombination(4);
        printPartitions(4, 4, "");
    }

    public static void printPartitions(int target, int maxValue, String suffix) {
        if (target == 0)
            System.out.println(suffix);
        else {
            if (maxValue > 1)
                printPartitions(target, maxValue - 1, suffix);
            if (maxValue <= target)
                printPartitions(target - maxValue, maxValue, maxValue + " " + suffix);
        }
    }
}