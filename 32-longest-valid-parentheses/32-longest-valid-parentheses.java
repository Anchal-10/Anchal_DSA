class Solution {
    public int longestValidParentheses(String s) {
        Stack<Character> stack=new Stack<>();
        Stack<Integer> index=new Stack<>();
        index.push(-1);
        int ans=0;
        for(int i=0;i<s.length();i++){
if(s.charAt(i)=='('){
    stack.push('(');
    index.push(i);
}
            else if(!stack.isEmpty()&& s.charAt(i)==')' && stack.peek()=='('){
                stack.pop();
                index.pop();
                ans=Math.max(ans,i-index.peek());
            }
            else{
                index.push(i);
            }
    }
        return ans;
}
}
