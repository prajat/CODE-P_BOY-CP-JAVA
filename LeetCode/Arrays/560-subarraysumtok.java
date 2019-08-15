class Solution {
    public int subarraySum(int[] nums, int k) {
//             int count=0;
            
//             for(int i=0;i<nums.length;i++){
//                     int sum=0;
//                     for(int j=i;j<nums.length;j++){
//                             sum+=nums[j];
//                             if(sum==k){
//                                     count++;
                                    
//                             }
//                     }
//             }
//             return count;
          HashMap<Integer,Integer> map=new HashMap<>();
            int sum=0;
            int count=0;
            map.put(0,1);
            for(int i=0;i<nums.length;i++){
                    sum+=nums[i];
                    if(map.containsKey(sum-k)){
                            count+=map.get(sum-k);
                    }
                    map.put(sum,map.getOrDefault(sum,0)+1);
            }
            return count;
        
    }
}