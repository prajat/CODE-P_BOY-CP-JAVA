static int[] maxXor(int[] arr, int[] queries) {
        // solve here

        int[] res=new int[queries.length] ;
        for(int i=0;i<queries.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
               res[i]=Math.max(res[i],queries[i]^arr[j]); 
            }
        }
        return res;
    }
