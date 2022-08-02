class Solution {
    public int threeSumClosest(int[] nums, int target) {
Arrays.sort(nums);
        int ans=0;      
        int min=Integer.MAX_VALUE;

        
        for(int i=0;i<nums.length-2;i++){
              if(i==0|| i>0 && nums[i]!=nums[i-1]){
                  int j=i+1;
                  int k=nums.length-1;
                  while(j<k){
                      int sum=nums[i]+nums[j]+nums[k];
                     int diff=target-(nums[i]+nums[j]+nums[k]);
                      if(Math.abs(diff)<Math.abs(min)){
                         min=diff;
                          ans=sum;
                         
                      }
                      if(sum<target){
                          j++;
                      }
                      else{
k--;}
                  
                  }
              }
        }
        return ans;
        }
}