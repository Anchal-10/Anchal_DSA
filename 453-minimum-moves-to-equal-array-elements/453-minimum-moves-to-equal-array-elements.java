class Solution {
    public int minMoves(int[] nums) {
int sum=0;
        int min=nums[0];
        for(int i=1;i<nums.length;i++){
        min=Math.min(min,nums[i]);
        }
                for(int i=0;i<nums.length;i++){
                    
        sum=sum+(nums[i]-min);
    }
        return sum;
    }
}