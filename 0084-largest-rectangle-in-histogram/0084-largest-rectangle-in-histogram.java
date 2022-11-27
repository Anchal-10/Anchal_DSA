class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack=new Stack<>();
        
int left[]=new int[heights.length];
        int right[]=new int[heights.length];
        for(int i=0;i<heights.length;i++){
            while(!stack.isEmpty()&& heights[stack.peek()]>=heights[i]){
                stack.pop();
            }
            left[i]=stack.isEmpty()?-1:stack.peek();
            stack.push(i);
}
        stack.clear();
        for(int i=heights.length-1;i>=0;i--){
            while(!stack.isEmpty()&& heights[stack.peek()]>=heights[i]){
                stack.pop();
            }
            right[i]=stack.isEmpty()?heights.length:stack.peek();
            stack.push(i);
}
int ans=Integer.MIN_VALUE;
        for(int i=0;i<heights.length;i++){
            ans=Math.max(ans,(right[i]-left[i]-1)*heights[i]);
        }
        return ans;
    }}