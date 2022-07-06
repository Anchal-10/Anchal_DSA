class Solution {
    public int rob(int[] nums) {
        if(nums.length==0){
            return 0;
            
        }
                if(nums.length==1){
            return nums[0];
            
        }

        
        int a1[]=new int[nums.length-1];
                int a2[]=new int[nums.length-1];
        for(int i=0;i<a1.length;i++){
            a1[i]=nums[i];
        }
                for(int i:a1){
            System.out.print(i+ " ");
        }

        int j=0;
        for(int i=1;i<=a2.length;i++){
            a2[j]=nums[i];
            j++;
        }
        for(int i:a2){
            System.out.print(i+ " ");
        }
        int ans=Math.max(helper(a1),helper(a2));
        return ans;
    }
        public int helper(int nums[]){
        int dp[]=new int[nums.length];
dp[0]=nums[0];
for(int i=1;i<nums.length;i++){
    int take=nums[i];
    if(i>1){
        take+=dp[i-2];
    }
    int notake=dp[i-1];
    dp[i]=Math.max(take,notake);
}
return dp[nums.length-1];
}
}