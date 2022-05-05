class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Integer> stack1=new Stack<>();
        Stack<Character> stack2=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(!stack2.isEmpty()&& stack2.peek()==s.charAt(i)){
                stack1.push(stack1.peek()+1);
            }
            else{
                stack1.push(1);
            }
            stack2.push(s.charAt(i));
            if(stack1.peek()==k){
            for(int j=0;j<k;j++){
                stack1.pop();
                stack2.pop();
            }
            }
        }
            StringBuilder res=new StringBuilder();
            while(!stack2.isEmpty()){
            res.append(stack2.pop());
            }
            return res.reverse().toString();
        }
    }
