static int maximumToys(int[] prices, int k) {
        Arrays.sort(prices);
        int sum=0;
        int count=0;
        for(int i=0;i<prices.length;i++)
        {
            sum+=prices[i];
            count++;
            if(sum>k)
            {
                break;
            }
            
        }
        return count-1;
        
        
        
        


    }