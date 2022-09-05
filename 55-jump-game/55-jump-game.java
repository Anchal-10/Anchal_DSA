class Solution {
    public boolean canJump(int[] nums) {
        int reachedind=0;
        for(int i=0;i<nums.length;i++){
                        if(i>reachedind){
return false;
            }

            reachedind=Math.max(reachedind,nums[i]+i);
}
        return true;
    }
}