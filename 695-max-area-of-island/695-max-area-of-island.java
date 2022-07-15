class Solution {
    int count=0;
    
    public int maxAreaOfIsland(int[][] grid) {
        int max=Integer.MIN_VALUE;
        boolean [][]visited=new boolean[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1&& visited[i][j]==false){
                    findArea(grid,visited,i,j);
                    max=Math.max(count,max);
                    count=0;
                }
            }
        }
        return max==Integer.MIN_VALUE?0:max;
    }
    public void findArea(int a[][],boolean[][]visited,int i,int j){
        if(i<0|| i>=a.length|| j<0|| j>=a[0].length|| visited[i][j]==true|| a[i][j]==0){
            return ;
        }
        count++;
        visited[i][j]=true;
        findArea(a,visited,i+1,j);
                findArea(a,visited,i-1,j);
        findArea(a,visited,i,j-1);
        findArea(a,visited,i,j+1);

    }
}