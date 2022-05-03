class Solution {
    public int findUnsortedSubarray(int[] nums) {
        Stack<Integer> stack=new Stack<>();
        int min=nums.length;
        int max=0;
        for(int i=0;i<nums.length;i++){
            while(!stack.isEmpty()&& nums[stack.peek()]>nums[i]){
                int m=stack.pop();
                min=Math.min(min,m);
            }
            stack.push(i);
        }
        stack.clear();
                for(int i=nums.length-1;i>=0;i--){
            while(!stack.isEmpty()&& nums[stack.peek()]<nums[i]){
                int n=stack.pop();
             max=Math.max(max,n);
            }
            stack.push(i);
        }
        return max-min<0? 0:max-min+1;
    }

        
    }