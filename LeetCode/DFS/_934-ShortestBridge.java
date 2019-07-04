import java.util.*;


class Solution {
    int ans=0;
    public int shortestBridge(int[][] A) {
        
        boolean[][] visited=new boolean[A.length][A[0].length];
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
                if(A[i][j]==1){
                    dfs(A,visited,i,j);

                }
            }
        }
        return ans;
        
    }
    public void dfs(int[][] arr,boolean[][] visited,int x,int y){

        
        if(x<0 && y<0 || x>=arr.length || y>=arr[0].length || visited[x][y]==true ){
            return;
        }
        if(arr[x][y]==1){
            return;
        }
        visited[x][y]=true;
        ans++;
        dfs(arr, visited, x+1, y);
        dfs(arr, visited, x, y+1);
        dfs(arr, visited, x-1, y);
        dfs(arr, visited, x, y-1);
        

    }


}