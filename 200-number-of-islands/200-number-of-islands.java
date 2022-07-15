class Solution {
    public int numIslands(char[][] grid) {
        boolean visited[][]=new boolean[grid.length][grid[0].length];
        int c=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]=='1' && visited[i][j]==false){
                    helper(grid,i,j,visited);
                    c++;
                }
                
            }
        }
        return c;
    }
    public void helper(char a[][],int i,int j,boolean visited[][]){
        
        if(i>=0&& i<a.length&& j>=0&& j<a[i].length&& a[i][j]=='1'&& visited[i][j]==false){
        visited[i][j]=true;
        helper(a,i+1,j,visited);
                helper(a,i-1,j,visited);
        helper(a,i,j+1,visited);
        helper(a,i,j-1,visited);

    }
}
}