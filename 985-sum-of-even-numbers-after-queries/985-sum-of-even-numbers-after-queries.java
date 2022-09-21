class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
       int res[]=new int[nums.length];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                sum=sum+nums[i];
            }
            
        }
        System.out.print(sum);
for(int i= 0;i<queries.length;i++){
    
    int temp=queries[i][1];
    if(nums[temp]%2==0){
        sum=sum-nums[temp];
    }
    nums[temp]=nums[temp]+queries[i][0];
    if(nums[temp]%2==0){
        sum+=nums[temp];
    }
        res[i]=sum;
        
    
    

    
    

}
        return res;
    }
}
