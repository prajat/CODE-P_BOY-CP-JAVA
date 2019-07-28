public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        
        
        //solution 1
//         int count=0;
//         while(n!=0){
//             count+=n&1;
//             n=n>>1;
//         }
        
//         return count;
        
        
        //solution 2
//         int count=0;
//         while(n!=0){
            
//             count++;
//             n=n&(n-1);
//         }
//         return count;
        
        
        // solution 3
        // return Integer.bitCount(n);
    }
}