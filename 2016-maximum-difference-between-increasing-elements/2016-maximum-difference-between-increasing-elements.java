class Solution {
    public int maximumDifference(int[] nums) {
int min=nums[0];
        int max=0;
        for(int i=1;i<nums.length;i++){
            min=Math.min(min,nums[i]);
            max=Math.max(nums[i]-min,max);
        }
        
        return (max==0)?-1:max;
    }
}