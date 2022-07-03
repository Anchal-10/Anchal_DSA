class Solution {
    public int wiggleMaxLength(int[] nums) {
        
int temp=0;
        int n=nums.length;
        Boolean positive=null;
        for(int i=0;i<nums.length-1;i++){
temp=nums[i+1]-nums[i];
            if(temp==0){
                 n--;
            }
            else  if(positive==null){
 positive=temp>0;
            }
            else if((temp<0&& !positive) ||(temp>0&& positive)){
n--;
            }
            else{
                positive=!positive;
            }
        }
return n;
}}