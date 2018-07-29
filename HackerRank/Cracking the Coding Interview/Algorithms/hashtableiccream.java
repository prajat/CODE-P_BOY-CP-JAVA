import java.util.*;

/**
 * hashtableiccream
 */
public class hashtableiccream {

    public static void main(String[] args) {
        int[] a = { 2, 1, 3, 5, 6 };
        printid(a, 5);
    }

    public static void printid(int[] cost, int money) {
        HashMap<Integer, Integer> map = new HashMap();
        for (int i = 0; i <cost.length; i++) {

            if(map.containsKey(cost[i]))
            {
                System.out.print(map.get(cost[i]) + " " + (i+1));
            }
            else {
                map.put(money - cost[i], i+1);
            }

           

        }
        
    }
}