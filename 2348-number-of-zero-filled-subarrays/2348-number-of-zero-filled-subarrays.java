class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long count=0;
int i=0;
        int j=0;
        while(j< nums.length && i<nums.length){
            if(nums[j]!=0&& nums[i]!=0){
                i++;
                j++;
            }
        else    if(nums[i]==0 && nums[j]==0){
                count=count+(long)((j-i+1));
                j++;
            }
           else if(nums[j]!=0){
                i=j;
            }
        }
        return count;
    }
}
