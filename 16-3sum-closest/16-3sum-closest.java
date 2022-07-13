class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int sum=0;
        int ans=0;
    int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length-1;i++){
            int start=i+1;
            int end=nums.length-1;
            while(start<end){
                sum=nums[i]+nums[start]+nums[end];
                
                if(Math.abs(min)>Math.abs(target-sum)){
                    min=target-sum;
                    ans=sum;
                }
                if(sum<target){
start++;
                }
                else{
                    end--;
                }
            }
        }
        return ans;
    }
}