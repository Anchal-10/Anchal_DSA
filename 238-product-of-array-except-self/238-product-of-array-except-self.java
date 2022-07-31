class Solution {
    public int[] productExceptSelf(int[] nums) {
int left[]=new int[nums.length];
        int right[]=new int[nums.length];
left[0]=1;
        int pro=1;
        for(int i=1;i<nums.length;i++){
            left[i]=left[i-1]*nums[i-1];
            
        }
        pro=1;
        left[nums.length-1]=left[nums.length-1]*pro;
        pro=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            left[i]*=pro;
            pro=pro*nums[i];
            

        }
    return left;
    }
}