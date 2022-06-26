class Solution {
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int j=0;
        int i=0;
        int ans=0;
        int smaller=0;
        while(j<nums.length){
            if(nums[j]<=right&& nums[j]>=left){
                smaller=j-i+1;
                ans+=smaller;
            }
            else if(nums[j]<left){
ans+=smaller;
            }
            else if(nums[j]>right){
i=j+1;
            smaller=0;
            }
            j++;
        }
        return ans;
    }
}