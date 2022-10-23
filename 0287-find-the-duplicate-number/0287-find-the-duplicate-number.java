class Solution {
    public int findDuplicate(int[] nums) {
for(int i=0;i<nums.length;i++){
    int temp=Math.abs(nums[i]);
    
    if(nums[temp]<0){
        return Math.abs(temp);
    }
    nums[temp]=-nums[temp];
}
        return -1;
    }

}
