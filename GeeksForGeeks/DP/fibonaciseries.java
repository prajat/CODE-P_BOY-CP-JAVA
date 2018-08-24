import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	 //code
	 Scanner s=new Scanner(System.in);
	 int T=s.nextInt();
	 
	 for(int i=1;i<=T;i++){
	     int N=s.nextInt();
	     long[] arr=new long[N+1];
	 for(int k=0;k<arr.length;k++)
	 {
	     arr[k]=0;
	 }
	     for(int j=0;j<N;j++)
	     {
	         System.out.print(fibdp(j,arr)+" ");
	     }
	     System.out.println();
	 }
	 
	 }
	 
	 public static long fibdp(int n,long[] arr)
	 {
	     if(n==0||n==1)
	     {
	         return 1;
	     }
	     
	     if(arr[n]>0)
	     {
	         return arr[n];
	     }
	     arr[n]=fibdp(n-1,arr)+fibdp(n-2,arr);
	     return arr[n];
	 }
}