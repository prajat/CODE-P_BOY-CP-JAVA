static int lonelyinteger(int[] a) {
        int res=0;
        for(int i=0;i<a.length;i++)
        {
            res=res^a[i];
        }
        return res;


    }