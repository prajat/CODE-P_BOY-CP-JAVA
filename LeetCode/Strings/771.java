class Solution {
    public int numJewelsInStones(String J, String S) {
        
        HashSet<Character> set=new HashSet<>();
        int count=0;
        for(int i=0;i<J.length();i++){
            set.add(J.charAt(i));
        }
        
        for(int i=0;i<S.length();i++){
            if(set.contains(S.charAt(i))){
                count++;
            }
        }
        return count;
        
    }
}