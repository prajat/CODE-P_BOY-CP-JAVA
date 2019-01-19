import java.util.*;

public class Main {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int k = 1; k <= t; k++) {
            int i = in.nextInt();
            int p = in.nextInt();

            int[] arr = new int[12];
            for (int m = 0; m < arr.length; m++) {
                arr[m] = m;
            }

            int ans = i + p;
            if (ans <= 11) {
                System.out.println(ans);
            } else {
                int z = ans - 11;
                System.out.println(arr[z-1]);
            }

            
        }
		
	}
}