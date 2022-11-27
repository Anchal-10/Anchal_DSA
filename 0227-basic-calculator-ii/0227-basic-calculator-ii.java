class Solution {
    public int calculate(String s) {
char op='+';
        Stack<Integer> stack=new Stack<>();
        int currn=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                currn=(currn*10)+(ch-'0');
            }
            if((!Character.isDigit(ch) && ch!=' ') || i==s.length()-1){
                if(op=='+'){
                    stack.push(currn);
                }
                else if(op=='-'){
                    stack.push(-currn);
                }
                else if(op=='*'){
                    int m=stack.pop();
                    stack.push(m*currn);
                }
                                else if(op=='/'){
                    int m=stack.pop();
                    stack.push(m/currn);
                }
                op=ch;
                currn=0;

                
            }
        }
        int res=0;
        while(!stack.isEmpty()){
res+=stack.pop();
        }
        return res;
    }
}