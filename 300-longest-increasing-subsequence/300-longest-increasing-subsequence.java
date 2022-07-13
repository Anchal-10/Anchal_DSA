class Solution {
    public int lengthOfLIS(int[] nums) {
        int dp[][]=new int[nums.length][nums.length+1];
        for(int[]a: dp){
Arrays.fill(a,-1);
    }
    
int m=helper(nums,0,-1,dp);
        return m;
    }
    public int helper(int []a,int ind,int prev_ind,int[][]dp){
        
        if(ind==a.length){
return 0;
        }
        if(dp[ind][prev_ind+1]!=-1){
return dp[ind][prev_ind+1];
        }
        
        int not_take=helper(a,ind+1,prev_ind,dp);
        int take=Integer.MIN_VALUE;
        if(prev_ind==-1|| a[ind]>a[prev_ind]){
            take=1+helper(a,ind+1,ind,dp);
        }
        return  dp[ind][prev_ind+1]=Math.max(take,not_take);
    }
}