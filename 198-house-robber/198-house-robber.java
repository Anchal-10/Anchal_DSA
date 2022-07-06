class Solution {
    public int rob(int[] nums) {
        int dp[]=new int[nums.length];
        Arrays.fill(dp,-1);
        int m=helper(nums,nums.length-1,dp);
        return m;
    }
    
    public int helper(int a[],int n,int[]dp){
        if(n==0){
            return a[n];
        }
        if(n<0){
            return 0;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int one=a[n]+helper(a,n-2,dp);
        int two=helper(a,n-1,dp);
        return dp[n]=Math.max(one,two);
    }
}