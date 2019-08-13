class Solution {
    public int[] shortestToChar(String S, char C) {
        char[] arrS = S.toCharArray();
        int[] dist = new int[arrS.length];
        int disToL = S.length(), disToR = S.length();

        for (int i = 0; i < arrS.length; i++) { // pass 1, determine distance to nearest C on the left
            if (arrS[i] == C)
                disToL = 0;
            dist[i] = disToL;
            disToL++;
        }

        for (int i = arrS.length - 1; i >= 0; i--) { // pass 2, determine distance to nearest C on the right, compare
                                                     // with previous pass and take minimum
            if (arrS[i] == C)
                disToR = 0;
            dist[i] = Math.min(dist[i], disToR);
            disToR++;
        }

        return dist;

    }

}