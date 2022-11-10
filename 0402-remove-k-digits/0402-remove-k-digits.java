class Solution {
    public String removeKdigits(String num, int k) {
        if(num.length()==1&& k==1){
return "0";
        }
Stack<Character> stack=new Stack<>();
        for(int i=0;i<num.length();i++){
            while(!stack.isEmpty()&& stack.peek()>num.charAt(i) && k>0){
                stack.pop();
                k--;
            }
            stack.push(num.charAt(i));
        }
        while(k>0){
            stack.pop();
            k--;
        }
        String ans="";
        while(!stack.isEmpty()){
            ans=stack.pop()+ans;
        }
int i=0;
        while(i<ans.length()&& ans.charAt(i)=='0'){
            i++;
        }
        return ans.substring(i)=="" ?"0": ans.substring(i);
    }
}