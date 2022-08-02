class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[m][n];
        for(int a[]: dp){
            Arrays.fill(a,-1);
}
        int res=unique(m-1,n-1,dp);
        return res;
        
        
    }
    public int unique(int m,int n,int[][]dp){
        if(m==0&& n==0){
return 1;
        }
        if(m<0||n<0){
return 0;
        }
        if(dp[m][n]!=-1){
return dp[m][n];
        }
        int left=unique(m-1,n,dp);
                int right=unique(m,n-1,dp);
return dp[m][n]=left+right;
    }
}