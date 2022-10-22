class Solution {
    public int getMaximumGold(int[][] grid) {
        int max=0;
        boolean[][]vis=new boolean[grid.length][grid[0].length];
for(int i=0;i<grid.length;i++){
    for(int j=0;j<grid[0].length;j++){
        if(grid[i][j]!=0){
            max=Math.max(helper(i,j,grid,vis),max);
        }
        
    }
}
                         
        return max;
    }
    public int helper(int i,int j,int[][]grid,boolean[][]vis){
if(i<0 || j<0|| i>=grid.length|| j>=grid[0].length|| grid[i][j]==0|| vis[i][j]==true){
return 0;
}


        vis[i][j]=true;
        int left=helper(i-1,j,grid,vis);
                int right=helper(i+1,j,grid,vis); 
        int down=helper(i,j+1,grid,vis);      
        int up=helper(i,j-1,grid,vis);
        vis[i][j]=false;
        return Math.max(up,Math.max(left,Math.max(right,down)))+grid[i][j];
    }
                         }
                         