class Solution {
    public int maxAscendingSum(int[] nums) {
        
int max=-1;
        int sum=nums[0];
        max=Math.max(sum,max);
        for(int i=1;i<nums.length;i++){
                            max=Math.max(sum,max);

            if(nums[i]>nums[i-1]){
                sum+=nums[i];
                max=Math.max(sum,max);
            }
                           // max=Math.max(sum,max);

            else{
                sum=nums[i];
            }

        }
        return max;
    }
}