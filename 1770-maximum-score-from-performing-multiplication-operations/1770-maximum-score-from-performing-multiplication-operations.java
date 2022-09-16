class Solution {
    public int maximumScore(int[] nums, int[] multipliers) {
        Integer dp[][]=new Integer[nums.length][  multipliers.length];
        
      return  helper(nums,multipliers,0,nums.length-1,0,dp);
        
    }
    public int helper(int []nums,int[]multipliers,int start,int end,int index,Integer dp[][]){
        if(index>=multipliers.length){
            return 0;
        }
        if(dp[start][index]!=null){
            return dp[start][index];
        }
        int left=nums[start]*multipliers[index]+helper(nums,multipliers,start+1,end,index+1,dp);
                int right=nums[end]*multipliers[index]+helper(nums,multipliers,start,end-1,index+1,dp);
        return  dp[start][index]=Math.max(left,right);

    }
    
}