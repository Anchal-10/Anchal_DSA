class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int dp[]=new int[cost.length];
        Arrays.fill(dp,-1);
        int m=Math.min(solve(0,cost,dp),solve(1,cost,dp));
        return m;
    }
    public int solve(int ind,int []a,int[]dp){
        if(ind>=a.length){
return 0;
        }
       if(ind==a.length-1|| ind==a.length-2){
            return a[ind];
        }
        if(dp[ind]!=-1){
return dp[ind];
        }
        int one=a[ind]+solve(ind+1,a,dp);
                int two=a[ind]+solve(ind+2,a,dp);
        return dp[ind]= Math.min(one,two);

    }
}