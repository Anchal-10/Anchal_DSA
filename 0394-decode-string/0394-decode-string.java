class Solution {
    public String decodeString(String s) {
        // String ans="";
        Stack<String> strStack=new Stack<>();
        Stack<Integer> numStack=new Stack<>();
        int k=0;
        for(int i=0;i<s.length();i++){
if(Character.isDigit(s.charAt(i))){
    k=k*10+(s.charAt(i)-'0');
    continue;
}
            
            if(s.charAt(i) == '['){
                strStack.push(String.valueOf(s.charAt(i)));
                numStack.push(k);
                k=0;
                continue;
                
            }
                        if(s.charAt(i) != ']'){
                                            strStack.push(String.valueOf(s.charAt(i)));
continue;
                        }
            String ans="";
            while(!strStack.isEmpty()  && !strStack.peek().equals("[")){
                
               ans=ans+ strStack.pop();
            }
            StringBuilder sb=new StringBuilder();

            strStack.pop();
            int m=numStack.pop();
            for(int j=0;j<m;j++){
                sb.append(ans);
            }
            strStack.push(sb.toString());
        }
            StringBuilder sb=new StringBuilder();
        while(!strStack.isEmpty()){
           sb.append(strStack.pop());
        }
        return sb.reverse().toString();
    }
}


            