public class ArrayEquilibrium{	
	//arr is the given array in which you need to find the equilibrium index
	public static int arrayEquilibrium(int[] arr){  
		//write your code here
        
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }
            int leftsum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum = sum - arr[i];
                if (leftsum == sum) {
                    return i;
                    
                }
                leftsum += arr[i];
            }
           return -1;
	}
}