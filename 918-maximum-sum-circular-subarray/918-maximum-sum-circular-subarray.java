class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int maxsf= Integer.MIN_VALUE;
        int minsf= Integer.MAX_VALUE;
        int min=0;
        int max=0;
        int sum=0;
        for(int i=0 ;i< nums.length; i++){
sum+=nums[i];
            max+=nums[i];
            maxsf=Math.max(maxsf,max);
            if(max<0){
max=0;
            }
                        min+=nums[i];
            minsf=Math.min(minsf,min);
            if(min>0){
min=0;
            }
        }
        if(minsf==sum){
            return maxsf;
        }
        return Math.max(sum-minsf,maxsf);
    }
}

        