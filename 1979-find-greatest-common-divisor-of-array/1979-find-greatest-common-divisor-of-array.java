class Solution {
    public int findGCD(int[] nums) {
        
int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
for(int i=0;i<nums.length;i++){
    min=Math.min(nums[i],min);
    max=Math.max(nums[i],max);
    
}
      //  System.out.print(min+ " "+max);
        int maxi=-1;
        for(int i=1;i<=min*max;i++){
            if(min%i==0&& max%i==0){
                maxi=Math.max(maxi,i);
            }
        }
        return maxi;
    }}