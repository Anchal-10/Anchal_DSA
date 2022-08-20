class pair{
int value;
int mini;
    public pair(int value,int mini){
        this.value=value;
        this.mini=mini;
    }
}
class MinStack {
Stack<pair> stack;
    
    public MinStack() {
        stack=new Stack<>();
    }
    
    public void push(int val) {
    if(stack.isEmpty()){
stack.push(new pair(val,val));
    }
        else{
            int min=Math.min(stack.peek().mini,val);
            stack.push(new pair(val,min));
        }
    }
    
    public void pop() {
        if(!stack.isEmpty()){
            pair p=stack.pop();
        
        }
        else{
        return;
    }
    }
    
    public int top() {
                if(!stack.isEmpty()){
            pair p=stack.peek();
            return p.value;
        }
        return -1;
    }
    
    public int getMin() {
                        if(!stack.isEmpty()){
            pair p=stack.peek();
            return p.mini;
        }
        return -1;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */