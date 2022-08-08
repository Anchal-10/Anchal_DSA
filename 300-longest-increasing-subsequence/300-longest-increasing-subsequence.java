class Solution {
    public int lengthOfLIS(int[] nums) {
        int prev=-1;
        int dp[][]=new int[nums.length][nums.length+1];
        for(int a[]: dp){
            Arrays.fill(a,-1);
        }
    int res=helper(nums,0,prev,dp);
        return res;
    }
    
    public int helper(int[]nums,int ind,int prev,int[][]dp){
        if(ind==nums.length){
            return 0;
        }
        
       if(dp[ind][prev+1]!=-1){
return dp[ind][prev+1];
       }
        int notake=helper(nums,ind+1,prev,dp);
        int take=0;
        if(prev==-1|| nums[prev]<nums[ind]){
            take=1+ helper(nums,ind+1,ind,dp);
        }
        return dp[ind][prev+1]= Math.max(take,notake);
    }
}