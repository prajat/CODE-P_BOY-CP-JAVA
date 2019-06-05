import java.util.8;
/**
 * duplicateinarray
 */
public class duplicateinarray {

    public static void main(String[] args) {

    }
    
    public static int duplicate(int[] arr) {
       
        int arrsum = 0;
        for (int i : arr) {
            arrsum += i;
        }
        int n = arr.length - 2;
        int nsum = (n * (n + 1)) / 2;
        return arrsum - nsum;
    }
}