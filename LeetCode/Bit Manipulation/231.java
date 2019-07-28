class Solution {
    public boolean isPowerOfTwo(int x) {
        
       
        int a=x&(x-1);
        return x>0 && a==0;
        
        
    }
}