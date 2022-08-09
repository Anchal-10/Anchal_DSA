class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int max=0;
        boolean visited[][]=new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1 && visited[i][j]==false){
                    List<Integer> al=new ArrayList<>();
                    helper(grid,i,j,m,n,visited,al);
                    max=Math.max(al.size(),max);
                }
            }
        }
        return max;
    }
    
    public void helper(int [][]a,int i,int j,int m,int n,boolean[][]visited,List<Integer> al){
        if(i<0|| j<0|| i>=m|| j>=n || visited[i][j]==true|| a[i][j]==0){
            return;
        }
        al.add(a[i][j]);
        visited[i][j]=true;
        helper(a,i+1,j,m,n,visited,al);
        helper(a,i-1,j,m,n,visited,al);
        helper(a,i,j-1,m,n,visited,al);
        helper(a,i,j+1,m,n,visited,al);

        
    }
}