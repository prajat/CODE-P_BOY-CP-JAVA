import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(Ssystem.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        int count = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            int a = Math.abs(arr[i] - arr[i + 1]);
            if (a > 1) {
                count++;

            }
        }
        System.out.println(count);
    }

}