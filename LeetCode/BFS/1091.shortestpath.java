class Solution {
    int[] dx={0,1,1,1,0,-1,-1,-1};
    int[] dy={1,1,0,-1,-1,-1,0,1};
    
    
    public class Cell{
        int x;
        int y;
        int d;
        Cell(int x,int y,int d){
            this.x=x;
            this.y=y;
            this.d=d;
        }
        
    }
    int count=-1;
    public int shortestPathBinaryMatrix(int[][] grid) {
        
        boolean[][] visited=new boolean[grid.length][grid.length];
        if(grid[0][0]==1){
            return count;
        }
        
        bfs(grid,visited,0,0);
        
        return count;
        
        
    }
    public void bfs(int[][] grid,boolean[][] visited,int x,int y){
        
        Queue<Cell> queue=new LinkedList();
        queue.add(new Cell(x,y,1));
        visited[x][y]=true;
        while(!queue.isEmpty()){
            Cell cell=queue.poll();
           
            
            int r=cell.x;
            int c=cell.y;
            int d=cell.d;
            
            if(r==grid.length-1&& c==grid.length-1){
               count=cell.d;
                return;
            }
            for(int i=0;i<8;i++){
                int nx=r+dx[i];
                int ny=c+dy[i];
                if(issafe(grid,visited,nx,ny)){
                    
                    visited[nx][ny]=true;
                    queue.offer(new Cell(nx,ny,d+1));
                }
            }
            
        }
        
        
    }
    public boolean issafe(int[][] grid,boolean[][] visited,int x,int y){
        if(x<0||x>=grid.length||y<0||y>=grid.length||grid[x][y]==1||visited[x][y]==true){
            return false;
        }
        return true;
    }
}
