class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length==1){
            return  0;
        }
int i=0;
        int j=nums.length-1;
        int ans=0;
        while(i<=j){
            int mid=i+(j-i)/2;
                        if(mid>0&& mid<nums.length-1){

            if(nums[mid]>nums[mid+1]&& nums[mid]>nums[mid-1]){
                ans=mid;
                break;
                
            }
            else if(nums[mid]<nums[mid+1]){
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
            else if(mid==0){
                if(nums[mid]>nums[mid+1]){
                    return 0;
                }
                else{
return 1;}
            }
            else if(mid==nums.length-1){
                if(nums[mid-1]>nums[mid]){
                    return mid-1;
                }
                else{
                    return mid;
                }
            }
        }
        return ans;
    }
}

