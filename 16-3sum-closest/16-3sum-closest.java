class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int min = Integer.MAX_VALUE;
        Arrays.sort(nums);
        int ans = 0;
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            int start = i+1;
            int end = nums.length-1;
            while(start < end) {
sum=nums[i]+nums[start]+nums[end];
                if(Math.abs(target-sum)<min){
                    min=Math.abs(target-sum);
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