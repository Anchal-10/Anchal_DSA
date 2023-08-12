class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid[0][0]==1){
            return 0;
        }
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
                int dp[][]=new int[m][n];
for(int []i: dp){
    Arrays.fill(i,-1);
}
        int ans=helper(obstacleGrid, m-1, n-1, dp);
        return ans;
    }
    
    public int helper(int[][]obstacleGrid, int m, int n, int[][]dp){
        if(m==0 && n==0){
            return 1;
        }
        if(m<0 || n<0){
            return 0;
        }
        if(obstacleGrid[m][n]==1){
            return 0;
        }
        if(dp[m][n]!=-1){
            return dp[m][n];
        }
        int left = helper(obstacleGrid, m,n-1, dp);
        int up= helper(obstacleGrid,m-1,n, dp);
        return dp[m][n]=up+ left;
    }
}