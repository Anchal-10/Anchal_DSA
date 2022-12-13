class Solution {
    public int minFallingPathSum(int[][] matrix) {
Integer dp[][]=new Integer[matrix.length+1][matrix[0].length];
        int min=Integer.MAX_VALUE;
        for(int i=0;i<matrix.length;i++){
             int ans  = helper(matrix,0,i,dp,matrix.length);
            min=Math.min(min,ans);
        }
        return min;
    }
    public int helper(int [][]matrix,int i,int j,Integer dp[][],int n){
        if(j<0|| j>=n){
                        return (int) Math.pow(10, 7);

        }
        if(i==n-1){
            return matrix[i][j];
        }
        if(dp[i][j]!=null){
            return dp[i][j];
        }
        int x=matrix[i][j]+helper(matrix,i+1,j,dp,n);
        int y=matrix[i][j]+helper(matrix,i+1,j+1,dp,n);
        int z=matrix[i][j]+helper(matrix,i+1,j-1,dp,n);
int ans=Math.min(x,Math.min(y,z));
        dp[i][j]=ans;
        return ans;
        
    }
}

    

        
