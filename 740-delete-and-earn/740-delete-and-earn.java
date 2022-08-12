class Solution {
    public int deleteAndEarn(int[] nums) {
        int dp[]=new int[100001];
        for(int i: nums){
            dp[i]=dp[i]+i;
        }
        return helper(dp,dp.length-1);
            
    }
    public int helper(int a[],int ind){
int dp[]=new int[a.length];
dp[0]=a[0];
dp[1]=Math.max(a[1],a[0]);
for(int i=2;i<dp.length;i++){
    int p=a[i]+ dp[i-2];
    int n=0+dp[i-1];
    dp[i]=Math.max(p,n);
}
    return dp[a.length-1];
    }
}

