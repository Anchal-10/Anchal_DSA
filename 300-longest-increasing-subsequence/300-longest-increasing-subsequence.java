class Solution {
    public int lengthOfLIS(int[] nums) {
int dp[]=new int[nums.length];
        Arrays.fill(dp,1);
        dp[0]=1;
        int omax=0;
        for(int i=0;i<nums.length;i++){
         for(int j=0;j<i;j++){
            if(nums[j]<nums[i]){
                dp[i]=Math.max(dp[j]+1,dp[i]);
                        }
                    }
            omax=Math.max(omax,dp[i]);
            
        }

    return omax;
    }
}
