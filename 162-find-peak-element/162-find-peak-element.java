class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length==1){
            return 0;
        }
        int low=0;
        int high=nums.length-1;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)>>1;
            if(mid>0&& mid<nums.length-1){
                if(nums[mid]>nums[mid-1]&& nums[mid]>nums[mid+1]){
                    ans=mid;
                    break;
                }
                else if(nums[mid+1]>nums[mid]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
}
            }
            else if(mid==0){
                if(nums[1]>nums[0]){
return 1;
                }
                else{
                    return 0;
                    
                }
            }
            else if(mid==nums.length-1){
                if(nums[nums.length-1]>nums[nums.length-2]){
return nums.length-1;
                }
                else{
                    return nums.length-2;

                }
            }
        }
        return ans;
    }
}