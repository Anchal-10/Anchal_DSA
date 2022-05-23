class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int median=nums[nums.length/2];
        int m=0;
        for(int i:nums){
            m=m+Math.abs(i-median);
        }
        return m;
    }
}