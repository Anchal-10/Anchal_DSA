class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
int low=1;
        int high=nums.length;
        int ans=0;
        while(low<=high){
            int mid=(low+high)>>1;
            if(isPossible(mid,k,nums)){
                ans=mid;
                low=mid+1;
        }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
    public boolean isPossible(int mid,int k,int[]nums){
        int windowsum=0;
        int totalsum=0;
        for(int i=0;i<mid;i++){
            windowsum=windowsum+nums[i];
        }
        totalsum=nums[mid-1]*mid;
        if(totalsum-windowsum<=k){
return true;
        }
        int j=0;
        for(int i=mid;i<nums.length;i++){
            windowsum=windowsum-nums[j];
            windowsum=windowsum+nums[i];
            totalsum=nums[i]*mid;
            if(totalsum-windowsum<=k){
                return true;
            }
            j++;
        }
        return false;
    }
}
