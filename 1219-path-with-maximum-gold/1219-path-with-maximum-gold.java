class Solution {
    public int getMaximumGold(int[][] grid) {
        int max=0;
        boolean[][]visited=new boolean[grid.length][grid[0].length];
for(int i=0;i<grid.length;i++){
    for(int j=0;j<grid[0].length;j++){
        max=Math.max(max,helper(i,j,grid,visited));

        
    }
}
        return max;
    }
    public int helper(int i,int j,int[][]grid,boolean[][]visited){
                if(i<0 || j<0 || i >= grid.length || j >= grid[0].length || visited[i][j] || grid[i][j] == 0)
            return 0; //if overflows like index in -ve or greater than length or is already visited or 0 return 0

        visited[i][j]=true;
        int left=helper(i-1,j,grid,visited);
        int right=helper(i+1,j,grid,visited);
        int up=helper(i,j+1,grid,visited);
        int down=helper(i,j-1,grid,visited);

        visited[i][j]=false;
        return Math.max(right,Math.max(left,Math.max(up,down)))+ grid[i][j];
        
    }
}
