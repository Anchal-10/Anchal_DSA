class Solution {
    public int minDeletion(int[] nums) {
int del=0;
        for(int i=0;i<nums.length-1;i++){
             int newindex=i-del;
            if(newindex%2==0){
                if(nums[i]==nums[i+1]){
del++;
                }
            }
        }
        if((nums.length-del)%2==0){
return del;
        }
        else{
            return del+1;
        }
    }
}
