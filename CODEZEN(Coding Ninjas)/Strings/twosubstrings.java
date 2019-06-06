import java.util.*;
/**
 * twosubstrings
 */
public class twosubstrings {

    public static void twoSubstrings(String str)
	{
        / int count=0;
        for (int i = 0; i < str.length() - 1; i++) {
            char cc = str.charAt(i);
            if (cc == 'A') {
                if (str.charAt(i + 1) == 'B') {
                    count++;
                    i = i + 1;
                }
            }
            if (cc == 'B') {
                if (str.charAt(i + 1) == 'A') {
                    count++;
                    i = i + 1;
                }
            }
        }
        if (count >1) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
	}
	}
}