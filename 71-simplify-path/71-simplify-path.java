class Solution {
    public String simplifyPath(String path) {
Stack<  String> stack=new Stack<>();
        for(int i=0;i<path.length();i++){
            if(path.charAt(i)=='/'){
                continue;
            }
        else if(path.charAt(i)!='/'){
            String temp="";
            while(i<path.length()&& path.charAt(i)!='/' ){
                temp+=path.charAt(i);
                i++;
            }
            if(temp.equals("..")){
                if(!stack.isEmpty())
                stack.pop();
            }
            else             if(temp.equals(".")){
                continue;
            }

            else {
                stack.push(temp);
            }
        }
        }
        String res="/";
        Stack<String> stack2=new Stack<>();
        while(!stack.isEmpty()){
        stack2.push(stack.pop());
        }
        while(!stack2.isEmpty()){
            res+=stack2.pop()+"/";
        }
    return res=="/" ?"/":res.substring(0,res.length()-1);
    }
}
