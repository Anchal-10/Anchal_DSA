class Solution {
    public int minOperations(int[] nums, int x) {
int n=nums.length;
        int sum=0;
        for(int i: nums){
            sum+=i;
            
        }
        if(x>sum){
            return -1;
        }
        int max=Integer.MIN_VALUE;
        sum=sum-x;
        int j=0;
        int i=0;
        int k=0;
        while(j<n)
        {
            k=k+nums[j];
            if(k<sum){
                j++;
            }
            else if(k==sum){
                max=Math.max(j-i+1,max);
                // i++;
                j++;
                
            }
else if(k>sum){
    while(k>sum && i<nums.length){
        k=k-nums[i];
        i++;
        if(k==sum){
            max=Math.max(j-i+1, max);
        }
    
    }
    j++;
}
        }
       // System.out.print(sum+ " " +max); 
return n-max<0? -1: n-max;
    }
}
