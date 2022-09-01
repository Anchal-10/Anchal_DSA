class Solution {
    int c=0;
    public int islandPerimeter(int[][] grid) {
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    helper(grid,i,j,grid.length,grid[0].length);
                    break;
                }
            }
        }
        return c;
        
    }
    public void helper(int[][]a,int i,int j,int m,int n){
        if(i<0|| j<0||i>=m|| j>=n||a[i][j]==0){
c++;
        return;
        }
        if(a[i][j]==2){
            return;
        }
        a[i][j]=2;
        helper(a,i+1,j,m,n);
       helper(a,i,j+1,m,n);
        helper(a,i-1,j,m,n);
        helper(a,i,j-1,m,n);

        
    }
}