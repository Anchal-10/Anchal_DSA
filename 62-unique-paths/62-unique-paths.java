class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[m][n];
        for(int i=0;i<dp.length;i++){
                    for(int j=0;j<dp[i].length;j++){
                        if(i==0&& j==0){
dp[i][j]=1;

                        }
                        else{
                                                                int right=0;
        int left=0;

                        if(i>0){
                             left=dp[i-1][j];
                        }
                        if(j>0){
                            right=dp[i][j-1];
                        }
                    
                        dp[i][j]=left+right;

}
                    }
                        
        }   
        return dp[m-1][n-1];
    }
}


