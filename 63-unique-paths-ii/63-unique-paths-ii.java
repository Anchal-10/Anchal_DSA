class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
int dp[][]=new int[m][n];
        for(int a[]:dp){
            Arrays.fill(a,-1);
        }
      int c=  solve(obstacleGrid,m-1,n-1,dp);
        return c;
    }
    public int solve(int a[][],int m,int n,int[][]dp){
        if(m<0||n<0){
            return 0;
        }
                if(a[m][n]==1){
            return 0;
        }
                if(m==0&& n==0){
            return 1;
        }
        if(dp[m][n]!=-1){
return dp[m][n];
        }


        int left=solve(a,m-1,n,dp);
        int right=solve(a,m,n-1,dp);
        return  dp[m][n]=left+right;
    }
}