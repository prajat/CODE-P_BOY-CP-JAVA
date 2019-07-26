public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<ArrayList<Integer>> anagrams(final List<String> A) {
        
        HashMap<String,ArrayList<Integer>> map=new HashMap<>();
        for(int i=0;i<A.size();i++){
            String curr=A.get(i);
            char[] arr=curr.toCharArray();
            Arrays.sort(arr);
            curr=new String(arr);
            if(map.containsKey(curr)){
                ArrayList<Integer> value=map.get(curr);
                value.add(i+1);
                 map.put(curr,value);
            }
            else{
                 ArrayList<Integer> value=new ArrayList<>();
                 value.add(i+1);
                map.put(curr,value);
            }
        }
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        for(Map.Entry<String,ArrayList<Integer>> i:map.entrySet()){
            ans.add(i.getValue());
        }
        return ans;
        
        
    }
}
