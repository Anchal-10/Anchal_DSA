class Solution {
    public int findClosestNumber(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(Math.abs(min)>   Math.abs(nums[i])){
                min=nums[i];
            }
            if(Math.abs(min)==Math.abs(nums[i])){
                min=Math.max(min,nums[i]);
            }
            
        }
        return min;
    }
}