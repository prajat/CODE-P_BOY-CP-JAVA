import java.util.*;

/**
 * maximumsubarray
 */
public class maximumsubarray {

    public static void main(String[] args) {

    }
    
    public static ArrayList<Integer> maxset(ArrayList<Integer> a) {
        // Write your code here

        int maxsofar = 0;
        int maxending = 0;
        int s = 0;
        int start = 0;
        int end = 0;

        for (int i = 0; i < a.size(); i++) {
            maxending += a.get(i);
            if (maxsofar < maxending) {
                maxsofar = maxending;
                start = s;
                end = i;
            }
            if (maxending < 0) {
                maxending = 0;
                s = i + 1;

            }

        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            list.add(a.get(i));
        }
        return list;

    }
}