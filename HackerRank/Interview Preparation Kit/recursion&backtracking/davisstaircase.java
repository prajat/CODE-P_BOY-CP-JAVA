static int stepPerms(int n) {
       
       int[] arr=new int[n+1];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=-1;
        }
        return help(n,arr);
    }
    static int help(int n,int[] arr)
    {
        if(n<0)
        {
            return 0;
        }
        if(n==0)
        {
            return 1;
        }
        if(arr[n]>=0)
        {
            return arr[n];
        }
        else
        {
            arr[n]=help(n-1,arr)+ help(n-2,arr)+ help(n-3,arr);
        
            
            
        }
        return arr[n];

    }