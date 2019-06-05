import java.util.*;
/**
 * smallestsubarraywithrequiredsum
 */
public class smallestsubarraywithrequiredsum {

    public static ArrayList<Integer> smallestSubarray(int sum, ArrayList<Integer> input) {
        // Write your code here

        ArrayList<Integer> myresult = new ArrayList<>();

        int nsum = 0;
        int n = Integer.MAX_VALUE;
        int count = 0;
        int s=0;
        int e = 0;
        for (int i = 0; i < input.size(); i++) {
            nsum += input.get(i);
            count++;
            if (nsum >= sum) {
                if (count < n) {
                    n = count;
                    e = count - 1;
                    s = i - e;
                    i = i - 1;
                }

            }
        }
        for (int i = s; i <= e; i++) {
            myresult.add(input.get(i));
        }
        return myresult;
        //unsolved



    }
}