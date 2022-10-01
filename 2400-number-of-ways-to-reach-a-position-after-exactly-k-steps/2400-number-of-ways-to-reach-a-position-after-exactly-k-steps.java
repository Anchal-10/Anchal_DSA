class Solution {
    int mod=1000000007;
    public int numberOfWays(int startPos, int endPos, int k) {
        int dp[][]=new int[3002][1001];
        for(int a[]: dp){
        Arrays.fill(a,-1);
        }
int ans=helper(startPos,startPos,endPos,k,dp);
        return  ans;
    }
    public int helper(int startPos, int curr,int endPos,int k,int[][]dp){
        if(k==0){
            if(curr==endPos){
return 1;
            }
            return 0;
        }
        if(dp[curr+1001][k]!=-1){
return dp[curr+1001][k];
        }
        int right=helper(startPos,curr-1,endPos,k-1,dp)%mod;
                int left=helper(startPos,curr+1,endPos,k-1,dp)%mod;
        return dp[curr+1001][k]=(right+left)%mod;

    }
}