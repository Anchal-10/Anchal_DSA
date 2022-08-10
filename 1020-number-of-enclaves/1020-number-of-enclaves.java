class Solution {
    public int numEnclaves(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        boolean[][]visited=new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
              if(i==0|| i==m-1|| j==0|| j==n-1){
                   dfs(i,j,grid,m,n);
              }
            }
        }
        int res=0;
        for(int i=0;i<m;i++){
for(int j=0;j<n;j++){
    if(grid[i][j]==1){
        res++;
    }
}}
        return res;
    }

    public void dfs(int i,int j,int grid[][],int m,int n){
        if(i<0||j<0||i>=m||j>=n||grid[i][j]==0){
            return;
        }
                   grid[i][j]=0;
                   dfs(i+1,j,grid,m,n);
                   dfs(i,j+1,grid,m,n);
                   dfs(i,j-1,grid,m,n);
                   dfs(i-1,j,grid,m,n);

    }
}