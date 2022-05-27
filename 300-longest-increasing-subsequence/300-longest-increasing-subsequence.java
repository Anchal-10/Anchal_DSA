class Solution {
    public int lengthOfLIS(int[] nums) {
        int dp[]=new int[nums.length];
        dp[0]=1;
        for(int i=1;i<nums.length;i++){
            int max=0;
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]){
                    if(dp[j]>=max){
                        max=dp[j];
                    }
                }
            }
            dp[i]=max+1;
        }
        int m=0;
        for(int i:dp){
m=Math.max(i,m);
        }
        return m;
    }
}