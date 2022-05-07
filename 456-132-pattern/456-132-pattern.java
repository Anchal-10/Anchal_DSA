class Solution {
    public boolean find132pattern(int[] nums) {
        int secondmax=Integer.MIN_VALUE;
        Stack<Integer> st = new Stack<>();
        
        for(int j=nums.length-1;j>=0;j--)
        {
            if(secondmax>nums[j]){
return true;
            }
            while(st.size()>0 && st.peek() <nums[j]){
            secondmax=Math.max(secondmax,  st.pop());
            }
            st.push(nums[j]);
        }
    
        return false;
    }
}
