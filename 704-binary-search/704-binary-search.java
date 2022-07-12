class Solution {
    public int search(int[] nums, int target) {
        int low=0;
        int v=-1;
        int high=nums.length-1;
        while(low<=high){
int mid=low+(high-low)/2;
            if(nums[mid]==target){
                v=mid;
                break;
            }
            else if(target<nums[mid]){
                high=mid-1;
            }
                        else if(target>nums[mid]){
                low=mid+1;
            }
        }
        return v;

            
            }
}
