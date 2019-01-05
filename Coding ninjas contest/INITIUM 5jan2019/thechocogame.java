import java.util.*;
/**
 * thechocogame
 */
public class thechocogame {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int i = 1; i <= t; i++) {
            int n = s.nextInt();
            int m = s.nextInt();
            if (n * m % 2 == 0) {
                System.out.println("Aahad");
            }
            else {
                System.out.println("Harshit");
            }
        }
    }
}