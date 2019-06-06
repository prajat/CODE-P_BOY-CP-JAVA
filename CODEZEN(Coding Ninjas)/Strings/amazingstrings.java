import java.util.*;
/**
 * amazingstrings
 */
public class amazingstrings {

    public static void answer(String s1, String s2, String s3) {

        // Write your code here

        String first = s1 + s2;
        char[] arr = new char[first.length()];
        for (int i = 0; i < first.length(); i++) {
            arr[i] = first.charAt(i);
        }
        Arrays.sort(arr);
        char[] arr2 = new char[s3.length()];
        for (int i = 0; i < s3.length(); i++) {
            arr2[i] = s3.charAt(i);
        }
        Arrays.sort(arr2);
        int flag = 0;

        for (int i = 0; i < first.length(); i++) {
            if (arr[i] != arr2[i]) {
                flag = 1;
                break;

            }
        }
        if (flag == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        

    }
}