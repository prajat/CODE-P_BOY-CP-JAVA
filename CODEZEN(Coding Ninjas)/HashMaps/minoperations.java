import java.util.*;

/**
 * minoperations
 */
public class minoperations {

    public static void main(String[] args) {

    }

    public static int ReturnMinOperationCount(int[] arr, int n) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int max=0;
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])){

                map.put(arr[i], map.get(arr[i])+1);
        }
        else{
            map.put(arr[i], 1);
        }
        }
        for(Map.Entry<Integer,Integer> it:map.entrySet()){
            if(it.getValue()>max){
                max=it.getValue();

            }
        }
        int ans=0;
        if(max==1){
            ans=n-1;
        }
        else if(max>1){
            ans=n-max;
        }
        else{
            ans=0;
        }


        
        
        
        
        
        
        
            
	
        return ans;
	
	}
    }
}
