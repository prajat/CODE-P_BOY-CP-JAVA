import java.util.*;
class Solution {
    public List<Boolean> camelMatch(String[] queries, String pattern) {

        List<Boolean> list=new ArrayList<>();
        for(int j=0;j<queries.length;j++){
            String curr=queries[j];
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<curr.length();i++){
                if(curr.charAt(i)>='A' && curr.charAt(i)<='Z'){
                    sb.append(curr.charAt(i));
                }
            }
            
            int ans=pattern.compareTo(sb.toString());
            if(ans==0){
                list.add(true);
            }
            else{
                list.add(false);
            }
            

            
        }
        return list;
        
    }
}