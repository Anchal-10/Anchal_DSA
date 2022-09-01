class Solution {
    int c=0;
    public int maxAreaOfIsland(int[][] grid) {
            int max=0;

int m=grid.length;
        int n=grid[0].length;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    helper(grid,i,j,m,n);
                    max=Math.max(c,max);
                    c=0;
                }
            }
        }
        return max;
        
    }
    public void helper(int a[][],int i,int j,int m,int n){
if(i<0||j<0|| i>=m|| j>=n|| a[i][j]==0){
    return;
}
    c++;
        a[i][j]=0;
        helper(a,i+1,j,m,n);
      helper(a,i-1,j,m,n);
        helper(a,i,j+1,m,n);
        helper(a,i,j-1,m,n);

        
        
    }
}