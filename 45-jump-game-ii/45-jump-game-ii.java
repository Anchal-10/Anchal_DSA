class Solution {
    public int jump(int[] nums) {
        Integer dp[]=new Integer[nums.length];
        dp[dp.length-1]=0;
        
        for(int i= dp.length-2; i>=0;i--){
            int min=Integer.MAX_VALUE;
            if(nums[i]>0){
            for(int j=1;j<=nums[i]&& i+j<dp.length;j++){
                if(dp[i+j]!=null && dp[i+j]<min){
                    min=dp[i+j];
                }
            }
            }
            if(min!=Integer.MAX_VALUE){
                dp[i]=min+1;
            }
        }
        return dp[0];
    }
}
      /*  Integer[] dp=new Integer[nums.length];
        dp[nums.length-1]=0;
        for(int i=nums.length-2;i>=0;i--){
            int min=Integer.MAX_VALUE;
            if(nums[i]>0){
                for(int j=1;j<=nums[i]&& i+j<nums.length;j++){
                    if(dp[i+j]!=null){
                        min=Math.min(min,dp[i+j]);
                    }
                }
            }
            if(min!=Integer.MAX_VALUE){
                dp[i]=min+1;
            }
            
        }
        return dp[0];
        
        
        
    }
}*/