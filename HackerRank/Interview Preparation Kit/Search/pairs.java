static int pairs(int k, int[] nums) {

        
        int i=0;
        int j=1;
        int count=0;
        int n=nums.length;
        Arrays.sort(nums);
        
    
    while(j < n) {
        int diff = nums[j] - nums[i];
        int diff2=nums[i]-nums[j];
        
        if (diff == k || diff2==k) {
            count++;
            j++;
        } else if (diff > k) {
            i++;
        } else if (diff < k) {
            j++;
        }
    }
        return count;

    }