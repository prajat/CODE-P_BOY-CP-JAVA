import java.util.*;
/**
 * specialsumofarray
 */
public class specialsumofarray {

    public static void main(String[] args) {

        
    }
    
    public static int sum(int arr[]) {
        // Write code here

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if (sum >= 10) {
                sum = sum - 9;
            }

           
               
            

        }
        return sum;
    }
}