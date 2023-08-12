class Solution {
    public int minimizeMax(int[] nums, int p) {
Arrays.sort(nums);
        int low=0;
        int ans=0;
        int high=nums[nums.length-1]-nums[0];
        while(low<=high){
            int mid=(low+high)>>1;
            if(possible(nums,p,mid)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    
    public boolean possible(int []nums, int p, int mid){
        int count=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]-nums[i-1]<=mid){
                count++;
                i++;
                
            }
        }
        return count>=p;
    }
}
