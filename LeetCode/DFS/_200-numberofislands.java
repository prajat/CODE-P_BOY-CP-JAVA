import java.util.*;
class Solution {
        int[] xcord = { 0, 1, 0, -1 };
        int[] ycord = { 1, 0, -1, 0 };
    public int numIslands(char[][] grid) {
        

        int ans=0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    dfs(grid, i, j);
                   ans++;
                }
            }
        }
        return ans;
        
    }
    public void dfs(char[][] grid ,int x,int y){
        if(x<0 || y<0 || x>=grid.length || y>=grid[0].length grid[x][y]=='0'){
            return;
        }
        grid[x][y]='0';
        for(int i=0;i<xcord.length;i++){

            dfs(grid,x+xcord[i],y+ycord[i]);
        }

    }
}