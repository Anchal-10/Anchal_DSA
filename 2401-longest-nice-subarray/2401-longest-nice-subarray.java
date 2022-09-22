class Solution {
    public int longestNiceSubarray(int[] nums) {
        
int i=0;
        int j=0;
        int bsum=0;
        int max=Integer.MIN_VALUE;
        while(j<nums.length){
            while((bsum&nums[j])!=0){
                bsum=bsum^nums[i];
                i++;
            }
            bsum=bsum| nums[j];
            max=Math.max(max,j-i+1);
            j++;
        }
        return max;
    }
}