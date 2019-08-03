class Solution {
    public int longestCommonSubsequence(String a, String b) {
        int[][] dp=new int[a.length()+1][b.length()+1];
        
       return ans(a,b,dp);
        
    }
    public int ans(String a,String b,int[][] dp){
        int m=a.length();
        int n=b.length();
         if(a.length()==0 || b.length()==0){
            return 0;
        }
        if(dp[m][n]!=0){
            return dp[m][n];
        }
        
        
        
        if(a.charAt(0)==b.charAt(0)){
            dp[m][n]=1+ans(a.substring(1),b.substring(1),dp);
            return dp[m][n];
        }
        else{
            int op1=ans(a,b.substring(1),dp);
            int op2=ans(a.substring(1),b,dp);
            dp[m][n]=Math.max(op1,op2);
            return dp[m][n];
        }
    }
}