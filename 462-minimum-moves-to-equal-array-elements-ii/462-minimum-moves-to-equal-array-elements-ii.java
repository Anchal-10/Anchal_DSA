class Solution {
    public int minMoves2(int[] nums) {
        int m=0;
        Arrays.sort(nums);
            m=nums[nums.length/2];
    
        int ans=0;
for(int i=0;i<nums.length;i++){
    ans=ans+Math.abs(nums[i]-m);
}
        return ans;
        
    }
}