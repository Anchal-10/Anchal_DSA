class Solution {
    public boolean canJump(int[] nums) {
        Integer[]dp=new Integer[nums.length];
        dp[nums.length-1]=0;
        for(int i=nums.length-2;i>=0;i--){
            int min=Integer.MAX_VALUE;
            if(nums[i]>0){
            for(int j=1;j<=nums[i]&& i+j<nums.length;j++){
                if(dp[i+j]!=null){
min=Math.min(dp[i+j],min);
                }
                
            }
                if(min!=Integer.MAX_VALUE){
                dp[i]=min+1;
            
        }
    }
}
        return dp[0]==null? false:true;
    }
}