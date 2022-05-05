class Solution {
    public String removeDuplicates(String s) {
        Deque<Character> stack=new LinkedList<>();
        for(int i=0;i<s.length();i++){
            if(!stack.isEmpty()&&s.charAt(i)==stack.peekLast()){
                stack.removeLast();
                continue;
            }
            stack.offerLast(s.charAt(i));
        }
        String t="";
        while(!stack.isEmpty()){
          t=t+  stack.removeFirst();
        }
        return t;
    }
}