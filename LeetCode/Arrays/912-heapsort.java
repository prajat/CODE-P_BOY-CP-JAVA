class Solution {
    public int[] sortArray(int[] nums) {
       heapsort(nums);
       return nums;

   }

   public void heapsort(int[] arr) {
       int n=arr.length;

       // Build Max Heap
       for (int i = n/2 - 1; i >= 0; i--) {

           heapify(arr,n,i);
       }
       for(int i=n-1;i>=0;i--){


           //swap last with firs node(max node)
           int temp=arr[0];
           arr[0]=arr[i];
           arr[i]=temp;

           //heapify the array

           heapify(arr,i,0);
       }
   }
   public void heapify(int[] arr,int n,int index){
     
       int largest=index;
       int left=2*index+1;
       int right=2*index+2;
       if(left<n && arr[left]>arr[largest]){
           largest=left;
       }
       if(right<n && arr[right]>arr[largest]){
           largest=right;
       }

       if(largest!=index){
           int temp=arr[index];
           arr[index]=arr[largest];
           arr[largest]=temp;
           heapify(arr,n, largest);
       }

   }
}