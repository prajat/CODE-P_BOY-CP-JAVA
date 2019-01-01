import java.util.*;
/**
 * minstepsto1bottomipdp
 */
public class minstepsto1bottomipdp {

    public static void main(String[] args) {
        System.out.println(minstepto1dpbu(100));
    }
    public static int minstepto1dpbu(int n) {
        int[] dp=new int[n+1];
        dp[1]=0;
        for(int i=2;i<=n;i++){
            int min=dp[i-1];
            if(i%3==0){
                if(min>dp[i/3]){
                    min=dp[i/3];
                }
            }
            if(i%2==0){
                if(min>dp[i/2]){
                    min=dp[i/2];
                }
            }
            dp[i]=1+min;
        }
        return dp[n];
        
    }
}