import java.uttil.*;

public class solution {

	// Return a 2D array that contains all the subsets which sum to k
    public static int[][] subsetsSumK(int input[], int k) {
        

		
        return subsetsSumK(input, k, 0);
	}

    private static int[][] subsetsSumK(int[] input, int k, int start) {
        if (start == input.length) {
            if (k == 0) {
                return new int[1][0];
            }
            else {
                return new int[0][0];
            }
        }


            itn cn = input[start];
            int[][] smallans1=subsetsSumK(input, k-cn, start+1);
            int[][] smallans2=subsetsSumK(input, k, start+1);

            int[][] myans = new int[smallans1.length + smallans2.length][];
            int p = 0;
            
            for (int i = 0; i < smallans2.length; i++) {
                myans[p] = smallans2[i];
                p++;

            }
        for (int i = 0; i < smallans1.length; i++) {
            myans[p] = new int[smallans1.length + 1];
            myans[p][0] = cn;
            for (int j = 0; j < smallans1[i].length; j++) {
                myans[p][j + 1] = smallans1[i][j];

            }
            p++;
        }
        return myans;


        }
    }

