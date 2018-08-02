import java.util.*;
/**
 * fradulentactivitynotifivation
 */
public class fradulentactivitynotifivation {

    public static void main(String[] args) {

        int[] arr = { 2, 3, 4, 2, 3, 6, 8, 4, 5 };
        //int[] arr = { 1,2,3,4,4 };
        System.out.println(activityNotifications(arr, 5));

    }
    
    public static int activityNotifications(int[] expenditure, int d) {

        int count = 0;
        for (int i = d; i < expenditure.length; i++) {
            double medianans = medianfunc(i-1, d, expenditure);
            if (expenditure[i] >= medianans*2) {
                count++;
            }

        }
        return count;

    }

    public static double medianfunc(int index, int d, int[] expenditure) {
        int[] medianarr = new int[d];
        
        int i = 0;
        int j = index;
        while (i < d && j >= index - d)
        {
            medianarr[i] = expenditure[j];
            i++;
            j--;
        }
        Arrays.sort(medianarr);
        double median = 0;
        if (medianarr.length % 2 == 0) {
            median = ((double)medianarr[(medianarr.length / 2) - 1] + medianarr[medianarr.length / 2]) / 2;
        } else {
            median = medianarr[medianarr.length / 2];
        }
        System.out.println(median);
        return median;

    }
}