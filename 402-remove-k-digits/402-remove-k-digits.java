class Solution {
    public String removeKdigits(String num, int k) {
        if(num.length()==k){
return "0";
        }
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<num.length();i++){
            while(k>0&&!stack.isEmpty()&& (stack.peek()-'0')>(num.charAt(i)-'0')){
                stack.pop();
                k--;
            }
            stack.push(num.charAt(i));
        }
                while(k>0){
            stack.pop();
            k--;            
        }

        StringBuilder sb=new StringBuilder();
        while(!stack.isEmpty()){
         sb.append(stack.pop());
        }
        String res=sb.reverse().toString();
        int i=0;
        while(i<res.length()&&res.charAt(i)=='0'){
            i++;
            }
        if(res.substring(i)==""){
            return "0";
        }
        else{
            return res.substring(i);
        }
    }
}
        
