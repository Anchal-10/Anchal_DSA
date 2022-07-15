class Solution {
    public int minDeletion(int[] nums) {
        int d=0;
        for(int i=0;i<nums.length-1;i++){
            int ind=i-d;
            if(ind%2==0&& nums[i]==nums[i+1]){
                d++;
            }
        }
        return (nums.length-d)%2==0? d:d+1;
    }
}