class Solution {
    public int findGCD(int[] nums) {
int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i: nums){
            max=Math.max(max,i);
            min=Math.min(min,i);
        }
      int m=  helper(min,max);
        return m;
    }
    public int helper(int a,int b){
        if(b==0){
            return a;
        }
        return helper(b,a%b);
    }
}