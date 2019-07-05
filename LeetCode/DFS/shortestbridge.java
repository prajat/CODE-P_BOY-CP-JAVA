import java.util.*;

import javafx.util.Pair;


class Solution {
    int[] xcord = { 0, 1, 0, -1 };
    int[] ycord = { 1, 0, -1, 0 };
   
    public int shortestBridge(int[][] A) {
        
        boolean[][] visited=new boolean[A.length][A[0].length];
        ArrayList<Pair<Integer,Integer>> list1=new ArrayList<>();
        ArrayList<Pair<Integer,Integer>> list2=new ArrayList<>();
        int islandcount=0;
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
                if(A[i][j]==1){
                    if(islandcount==0){
                        dfs(A,list1,visited,i,j);
                        islandcount++;
                    }
                    else{
                        dfs(arr, list2, visited, i, j); 
                    }
                }
            }
        }
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<list1.size();i++){
            for(int j=0;j<list2.size();j++){
                int val=Math.abs(list1.get(i).getKey()-list2.get(j).getKey())+Math.abs(list1.get(i).getValue()-list2.get(j).getValue());
                ans=Math.min(ans,val);
            }
        }
        return ans;
        
    }
    public void dfs(int[][] arr,ArrayList<Pair<Integer,Integer>> list,boolean[][] visited,int x,int y){

        
        if(x<0 && y<0 || x>=arr.length || y>=arr[0].length || visited[x][y]==true ){
            return;
        }
        visited[x][y]=true;
        Pair<Integer,Integer> pair=new Pair(x,y);
        list.add(pair);
        for(int i=0;i<4;i++){
            dfs(arr, list, visited, x+xcord[i], y+ycord[i]);
        }
        

    }


}