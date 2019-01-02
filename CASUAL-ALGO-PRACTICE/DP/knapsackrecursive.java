import java.util.*;
/**
 * knapsackrecursive
 */
public class knapsackrecursive {

    public static void main(String[] args) {

    }

    public static int knapsack(int[] weight, int value[], int maxWeight) {

        return knapsack(weight, value, maxWeight, 0);

    }

    public static int knapsack(int[] weight, int value[], int maxWeight, int start) {
        if (start == weight.length || maxWeight == 0) {

            return 0;
        }
        if (weight[start] > maxWeight) {
            return knapsack(weight, value, maxWeight, start + 1);
        } else {
            int op1 = value[start] + knapsack(weight, value, maxWeight - weight[start], start + 1);
            int op2 = knapsack(weight, value, maxWeight, start + 1);
            return Math.max(op1, op2);
            
        }

        
    }
}