import java.util.*;
/**
 * breaknumbers
 */
public class breaknumbers {

    public static void main(String[] args) {

        //printCombination(4);
        printPartitions(4, 4, "");
    }
    
    public static void printCombination(int num) {
        ArrayList<Integer> list = new ArrayList<>();
        printCombination(num,num,list);
    }

    public static void printCombination(int num, int remval, ArrayList<Integer> list) {
        if (remval == 0) {
            System.out.println(list);
            list.clear();
            return;

        } else {
            if (num > 1) {
                printCombination(num - 1, remval, list);
            }
            if (num <= remval) {
                list.add(num);
                printCombination(num, remval - num, list);
            }
        }

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