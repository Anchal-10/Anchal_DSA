class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        
        int minsofar=nums[0];
        int maxsofar=nums[0];
        int mintotal=nums[0];
        int maxtotal=nums[0];
        int sum=nums[0];
for(int i=1;i<nums.length;i++){
    maxsofar=Math.max(maxsofar+nums[i],nums[i]);
    maxtotal=Math.max(maxtotal,maxsofar);
    minsofar=Math.min(minsofar+nums[i],nums[i]);
        mintotal=Math.min(mintotal,minsofar);
sum+=nums[i];
    
}   
        if(sum==mintotal){
return maxtotal;
        }
        return Math.max(maxtotal,sum-mintotal);
}
}