class Solution {
    int c=0;
    public int numIslands(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        boolean[][]visited=new boolean [m][n];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'&& visited[i][j]==false){
                    c++;
                    helper(grid,i,j,m,n,visited);
                }
            }
        }
        return c;
    }
    public void helper(char[][]a,int i,int j,int m,int n,boolean[][]visited){
       if(i<0||j<0||i>=m||j>=n||visited[i][j]==true|| a[i][j]=='0'){
return;
       }
        visited[i][j]=true;
        helper(a,i+1,j,m,n,visited);
                helper(a,i-1,j,m,n,visited);
        helper(a,i,j-1,m,n,visited);
        helper(a,i,j+1,m,n,visited);

        
    }
    
}