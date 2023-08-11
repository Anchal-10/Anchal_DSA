class Solution {
    public void moveZeroes(int[] nums) {
        int c=0;
        int i=0;
        for( i=0;i<nums.length;i++){
            if(nums[i]==0){
                c++;
            }
            else{
            nums[i-c]=nums[i];
        }
    }
        for(int k=i-c;k<nums.length;k++){
            nums[k]=0;
        }
}
}
    