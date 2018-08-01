static long arrayManipulation(int n, int[][] queries) {
        
        long[] arr=new long[n];
        arr.equals(0);
        
        for(int j=0;j<queries.length; j++)
        {
            int k=queries[j][2];
            int a=queries[j][0];
            int b=queries[j][1];
            arr[a-1] += k;
            if (b < n) {
                arr[b] -= k;
            }
        }
        long maxSum =0;
        long x = 0;
        
        for (int i=0;i<n;i++) {
            x = x + arr[i];
            if (maxSum < x) {
                maxSum = x;
            }
        }
        return maxSum;


    }