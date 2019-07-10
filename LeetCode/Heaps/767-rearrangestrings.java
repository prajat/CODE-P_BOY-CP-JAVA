import java.util.*;
class Solution {
    public String reorganizeString(String S) {
        HashMap<Character,Integer> map=new HashMap<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<S.length();i++){
            char ch=S.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }
            else{
                map.put(ch, 1);
            }
        }    
        int mr=0;
        for(Map.Entry<Character,Integer> i:map.entrySet()){

            mr=Math.max(mr,i.getValue());
        }
        if(mr>S.length()-mr+1){
            return "";
        }
        while(map.size()>=0){
            for(Map.Entry<Character,Integer> i:map.entrySet()){
                char key=i.getKey();
                char freq=i.getValue();
                sb.append(key);
                map.put(key, freq-1);
                
    
        }
        if(sb.length()==S.length()){
            return sb.toString();
        }
        
        }
        return sb.toString();

    }

}