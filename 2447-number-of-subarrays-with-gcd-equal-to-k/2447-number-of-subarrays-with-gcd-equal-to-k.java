class Solution {
    public int subarrayGCD(int[] nums, int k) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            int curr=nums[i];
            for(int j=i;j<nums.length;j++){
             curr=   gcd(curr,nums[j]);
                if(curr==k){
                    ans=ans+1;
                }
                if(curr<k){
                    break;
                }
            }
        }
        return ans;
    }
    public int gcd(int a,int b){
        if(b==0){
return a;
        }
        return gcd(b,a%b);
    }
        
    }
