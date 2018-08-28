import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	 //code
	 Scanner s=new Scanner(System.in);
	 int t=s.nextInt();
	 for(int i=1;i<=t;i++)
	 {
	     int n=s.nextInt();
	     int[] arr=new int[n];
	     for(int j=0;j<arr.length;j++)
	     {
	         arr[j]=s.nextInt();
	     }
	     help(arr);
	 }
	 }
	 public static void help(int[] arr){
	     for(int i=0;i<arr.length-1;i++)
	     {
	         if(arr[i+1]<arr[i])
	         {
	             System.out.print(arr[i+1]+" ");
	         }
	         else
	         {
	             System.out.print(-1+" ");
	             
	         }
	         
	     }
	     System.out.print(-1);
	     System.out.println();
	 }
}