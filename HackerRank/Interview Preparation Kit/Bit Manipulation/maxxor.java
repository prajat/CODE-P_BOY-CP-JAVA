static int maximizingXor(int l, int r) {
        int res=0;
        for(int i=l;i<=r;i++)
        {
            for(int j=i;j<=r;j++)
            {
                int xor=i^j;
                res=Math.max(res,xor);
            }
        }
        return res;


    }